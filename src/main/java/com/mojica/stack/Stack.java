package com.mojica.stack;

public class Stack {
    Object data;
    public boolean isEmpty() {
        return data == null;
    }

    public void push(Object data) {
        this.data = data;
    }

    public Object peek() {
        return data;
    }
}
