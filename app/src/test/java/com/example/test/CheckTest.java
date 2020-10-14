package com.example.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckTest {
    Check check;
    @Before
    public void setUp(){
        check = new Check();
    }

    @Test
    public void testOnReceive() {
        assertEquals("Geektech Hello",check.onReceive("Hello Geektech"));
    }

    @Test
    public void testOnRevers(){
        assertEquals("olleH",check.onRevers("Hello"));
    }
}
