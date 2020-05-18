package com.mojica.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void stack_isEmpty_ShouldReturnEmpty(){
        //setup
        Stack stack = new Stack();
        stack.isEmpty();
        assertTrue(stack.isEmpty());
    }

    @Test
    void stack_isEmptyAfterPush_ShouldReturnFalse(){
        //setup
        Stack stack=  new Stack();
        String object = "asahi";
        stack.push(object);

        System.out.println(object);
        assertFalse(stack.isEmpty());
    }

    @Test
    void peek_whenEmpty_ShouldReturnNull(){
        Stack stack = new Stack();
        stack.peek();
        assertNull(stack.peek());
    }

    @Test
    void peek_whenNotEmpty_ShouldReturnPushObject(){
        Stack stack  = new Stack();
        Object expected = new Object();
        stack.push(expected);
        Object actual = stack.peek();
        System.out.println(expected+"     "+ actual);

        assertEquals(expected,actual);

    }


}
