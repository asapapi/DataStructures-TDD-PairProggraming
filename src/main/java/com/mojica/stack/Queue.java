package com.mojica.stack;


import java.util.EmptyStackException;

public class Queue {

   private Object data;
   Node head;
   Node tail;

    public Queue() {
        this.head = null;
        this.tail = null;

    }



    public boolean isEmpty() {
        return head == null;
    }

    // enque == adding
    public Object enqueue(Object obj) {
        Node newNode = new Node(obj);
        if (isEmpty()){
            head = newNode;
        }else{
            tail.setNext(newNode);
        }
        tail = newNode;
        this.data = obj;
        return data;
    }

    public Object dequeue() {
        if(isEmpty()) throw new RuntimeException("Empty Queue.");
        Object temp = head.getData();
        head = head.getNext();
        return temp;
    }





    public Object peek() throws EmptyStackException {
        if (data == null) {
            throw new EmptyStackException();
        } else {
            return head.getData();
        }
    }
}
