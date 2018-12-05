package com.xouan.tree;

public interface Tree<T> {
    int size();
    boolean isEmpty();
    T getRoot();
    int getHight();
    void clear();
}
