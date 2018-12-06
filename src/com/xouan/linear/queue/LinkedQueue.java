package com.xouan.linear.queue;

public class LinkedQueue<T> implements QueueInterface<T> {

    private Node firstNode;
    private Node lastNode;
    private int size;

    public LinkedQueue() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(T item) {
        Node newNode = new Node(item);
        if (isEmpty()) {
            firstNode = newNode;
        }
        lastNode.next = newNode;
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        return null;
    }

    @Override
    public T getFront() {
        return null;
    }

    @Override
    public void clear() {

    }

    private class Node {
        private T data;
        private Node next;
        public Node() {}
        public Node(T data) {
            this(data, null);
        }
        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
