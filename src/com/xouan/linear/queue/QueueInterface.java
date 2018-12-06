package com.xouan.linear.queue;

public interface QueueInterface<T> {
    int size();
    boolean isEmpty();
    void enqueue(T item);
    T dequeue();
    T getFront();
    void clear();
}
