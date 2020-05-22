package com.mojica.stack;

import java.util.Objects;

public class Node {
    private Object data;
    private Node next;

    public Node() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return Objects.equals(data, node.data) &&
                Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
