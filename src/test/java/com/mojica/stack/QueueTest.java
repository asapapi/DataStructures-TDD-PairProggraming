package com.mojica.stack;

import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void queue_isEmpty_ShouldReturnTrue() {
        //setup
        Queue queue = new Queue();

        //exercise
        boolean actual = queue.isEmpty();

        assertTrue(actual);
    }

    @Test
    void queue_isEmpty_ShouldReturnFalse() {
        //setup
        Queue queue = new Queue();
        Object object = new Object();

        //exercise
        //adding
        Object actual = queue.enqueue(object);

        assertNotNull(actual);

    }

    @Test
    void queue_isEmpty_AfterAddingAndRemoving_shouldReturnTrue() {
        //setup
        Queue queue = new Queue();
        Object object = new Object();

        //exercise
        Object actual = queue.enqueue(object);
        assertNotNull(actual);
        queue.dequeue();



        boolean expected = queue.isEmpty();

        //assert
        assertTrue(expected);

    }

    @Test
    void peek_WhenEmpty_ShouldThrowException() {

        //setup
        Queue queue = new Queue();

        //assert

        assertThrows(EmptyStackException.class, () -> queue.peek());

    }

    @Test
    void peek_WhenNotEmpty_ShouldReturnQueueObject(){

        //setup
        Queue queue = new Queue();
        Object data = new Object();

        //excercise

        queue.enqueue(data);
        assertNotNull(data);

        //assert

        assertEquals(data, queue.peek());
    }

    @Test
    void peek_AfterThreeEnqueues_ShouldReturnFirstEnqueue(){
        Queue queue = new Queue();
        Object data1 = "Asahi";
        Object data2 = "Mojica";
        Object data3 = "Cherno";

        //excise

        queue.enqueue(data1);
        queue.enqueue(data2);
        queue.enqueue(data3);

        //should remove data1
        queue.dequeue();
        System.out.println(queue);

        // assesert
        assertEquals(data2,queue.peek());

    }


}
