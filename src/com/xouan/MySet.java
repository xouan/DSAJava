package com.xouan;

public interface MySet<Item> {

    int size();
    void isEmpty();
    boolean add(Item item);
    Item remove();
    boolean remove(Item item);
    void clear();
    boolean contains(Item item);
    Item[] toArray();
}
