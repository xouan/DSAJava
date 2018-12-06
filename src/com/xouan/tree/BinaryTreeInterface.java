package com.xouan.tree;

public interface BinaryTreeInterface<T> extends TreeInterface<T>, TreeIteratorInterface<T> {

    void setTree(T rootData);
    void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree);
}
