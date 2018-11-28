package com.xouan.linear.bag;

public interface MyBag<Item> extends Iterable<Item>{
    int size();
    boolean isEmpty();
    void add(Item item);
}
