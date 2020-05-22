package com.mojica.stack;

public class LinkList {

    private Object data;
    public boolean isEmpty() {
        return data == null;
    }

    public void add(Object data) {
        this.data = data;
    }
}
