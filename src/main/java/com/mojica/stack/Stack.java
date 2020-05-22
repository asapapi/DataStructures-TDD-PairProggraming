package com.mojica.stack;

import java.util.EmptyStackException;

public class Stack {
    private Node head;
    private int size;

    public Stack(){
        this.head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void push(Object data) {
        Node newNode = new Node(data,head);
        if(isEmpty()){
            head = newNode;
        }else{
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }

    public Object peek() {
        Object data = null;
        if(isEmpty()) throw new EmptyStackException();
        else{
            data = head.getData();
            return data;

        }
    }

    public Object pop() {
        Object data = null;
        if(isEmpty()){
            throw new EmptyStackException();
        }
        data = head.getData();

        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
        return data;

    }
}
