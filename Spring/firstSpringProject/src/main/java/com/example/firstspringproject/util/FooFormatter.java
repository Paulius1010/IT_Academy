package com.example.firstspringproject.util;

import org.springframework.stereotype.Component;

@Component("fooFormatter")
public class FooFormatter implements Formatter {

    @Override
    public String format() {
        return "foo";
    }
}
