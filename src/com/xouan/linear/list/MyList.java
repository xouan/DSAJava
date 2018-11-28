package com.xouan.linear.list;


public interface MyList<Item> extends Iterable<Item> {
    int size();
    boolean isEmpty();
    void add(int idx, Item item);
    Item remove(int idx) throws Exception;
    Item get(int idx);
    Item set(int idx, Item item);

}
