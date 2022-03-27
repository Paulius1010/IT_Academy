package com.swedbank.itacademy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class LibraryTest {
    @Mock
    private List<Book> mockedBooks;

    @InjectMocks
    private Library library;

//    List<String> list = new ArrayList<>();
//    List<String> spyList= spy(list);


    @Test
    public void should_Get_Books() {
        when(mockedBooks.get(0)).thenReturn(new Book(5, "title"));
        assertEquals(5, library.getAllBooks().get(0).getPages());
        assertEquals("title", library.getAllBooks().get(0).getTitle());
    }

    @Test
    public void should_Return_Book_With_Highest_Pages_Count() {
        mockedBooks.add(new Book())
        when(mockedBooks.getBookWithHighestPageCount()).thenReturn(new Book(5, "title"));
        assertEquals(5, library.getAllBooks().get(0).getPages());
        assertEquals("title", library.getBookWithHighestPageCount(); }

    @Test
    public void should_ThrowRuntimeException_When_Library_isEMpty() {
        when(mockedBooks.isEmpty()).thenReturn(true);
        assertThrows(RuntimeException.class, () -> library.getBookWithHighestPageCount());
    }


}


