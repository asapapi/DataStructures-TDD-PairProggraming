package com.mojica.stack;

public class Node {
    private Object data;
    private Node next;

    public Node(Object object, Node next) {
        this.data = object;
        this.next = next;
    }

    public Node(Object object) {
        this.data = object;
    }

    public Node(Node next) {
        this.next = next;
    }

    public Object getObject() {
        return data;
    }

    public void setObject(Object object) {
        this.data = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }
}
