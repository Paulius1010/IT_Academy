package com.swedbank.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ListMockTest {

    @Test
    public void whenNotUsingMockAnnotation() {
        List<String> mockedList = Mockito.mock(ArrayList.class);
        mockedList.add("one");

        verify(mockedList).add("one");
        assertEquals(0, mockedList.size());

        when(mockedList.size()).thenReturn(100).thenReturn(45);
        assertEquals(100, mockedList.size());
        assertEquals(45, mockedList.size());

    }

    @Mock
    private List<String> mockedList2;

    @Test
    public void whenUsingMockAnnotation() {
        mockedList2.add("one");

        verify(mockedList2).add("one");
        assertEquals(0, mockedList2.size());

        when(mockedList2.size()).thenReturn(100).thenReturn(45);
        assertEquals(100, mockedList2.size());
        assertEquals(45, mockedList2.size());

    }

    @Test
    public void whenNotUsingArgumentCaptorAnnotation() {
        List<String> mockedList = Mockito.mock(ArrayList.class);
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        mockedList.add("one");
        mockedList.add("two");
        verify(mockedList, times(2)).add(argumentCaptor.capture());
        assertEquals("one", argumentCaptor.getAllValues().get(0));
        assertEquals("two", argumentCaptor.getAllValues().get(1));


    }

    @Mock
    private List<String> mockedList;
    @Captor
    private ArgumentCaptor<String> argumentCaptor;

    @Test
    public void whenUsingArgumentCaptorAnnotation() {
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
        mockedList.add("one");
        mockedList.add("two");
        verify(mockedList, times(2)).add(argumentCaptor.capture());
        assertEquals("one", argumentCaptor.getAllValues().get(0));
        assertEquals("two", argumentCaptor.getAllValues().get(1));
    }


    @Mock
    private Map<String, String> wordMap;
    @InjectMocks
    private MyDictionary myDictionary;

    @Test
    public void injectMocks() {
        when(wordMap.get("aWord")).thenReturn("aMeaning");
        assertEquals("aMeaning", myDictionary.getMeaning("aWord"));


        when(wordMap.get(any(String.class))).thenReturn("any");
        assertEquals("any", myDictionary.getMeaning(""));
    }

}
