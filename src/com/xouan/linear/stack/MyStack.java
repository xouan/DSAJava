package com.xouan.linear.stack;

public interface MyStack<Item> extends Iterable<Item> {
    int size();
    boolean isEmpty();
    void push(Item item);
    Item pop() throws Exception;

}
