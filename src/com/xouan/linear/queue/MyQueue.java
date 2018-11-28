package com.xouan.linear.queue;

public interface MyQueue<Item> extends Iterable<Item> {
    int size();
    boolean isEmpty();
    MyQueue<Item> add(Item item);  // 入队
    Item remove() throws Exception;  //出队
}
