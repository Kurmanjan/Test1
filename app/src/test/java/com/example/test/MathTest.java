package com.example.test;

import android.icu.text.Edits;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MathTest {
    Math math;


    @Before
    public void setUp(){
        System.out.println("before");
        math = new Math();

    }

    @Test
    public void addTest(){
        System.out.println("addTest");
        assertEquals(4,math.aad(3,1));
    }

    @Test
    public void minusTest(){
        System.out.println("minusTest");
        assertEquals(2,math.minus(3,1));
    }
    @Test
    public void multiplyTest(){
        System.out.println("multiplyTest");
        assertEquals(20,math.multiply(5,4));
    }
    @Test
    public void divideTest(){
        System.out.println("divideTest");
        assertEquals(3,math.divide(6,2));
    }
    @Test
    public void testMock(){
        /**мокаем обьект */
        Iterator iterator = mock(Iterator.class);
        /**задаем поведение моку */
        when(iterator.next()).thenReturn("Next");
        /**работа с моком */
        String result = iterator.next().toString();
        assertEquals("Next",result);
        
    }


    @After
    public void clearUp(){
        System.out.println("clearUp");
//      math = null;

    }

}
