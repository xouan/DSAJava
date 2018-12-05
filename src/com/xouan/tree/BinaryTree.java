package com.xouan.tree;

public interface BinaryTree<T> extends Tree<T>, TreeIterator<T> {

    void setTree(T rootData);
    void setTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree);
}
