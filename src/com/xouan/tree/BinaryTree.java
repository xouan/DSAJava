package com.xouan.tree;

import java.util.Iterator;

public class BinaryTree<T> implements BinaryTreeInterface<T> {
    private BinaryNode<T> root;
    public BinaryTree() {
        root = null;
    }
    public BinaryTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }
    public BinaryTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        privateSetTree(rootData, leftTree, rightTree);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }



    @Override
    public T getRootData() {
        if (isEmpty())
            return null;
        else
            return root.getData();
    }

    @Override
    public int getHight() {
        return root.getHeight();
    }

    @Override
    public void clear() {
         root = null;
    }
    @Override
    public Iterator<T> getPreorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getpostorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getInorderIterator() {
        return null;
    }

    @Override
    public Iterator<T> getLevelOrderIterator() {
        return null;
    }
    public void setTree(T rootData) {
        root = new BinaryNode<>(rootData);
    }
    public void setTree(T rootData, BinaryTreeInterface<T> leftTree, BinaryTreeInterface<T> rightTree) {
        privateSetTree(rootData, (BinaryTree<T>)leftTree, (BinaryTree<T>)rightTree);
    }
    private void privateSetTree(T rootData, BinaryTree<T> leftTree, BinaryTree<T> rightTree) {
        root = new BinaryNode<>(rootData);
        if (leftTree != null) {
            root.setLeftChild(leftTree.root);
        }
        if (rightTree != null) {
            root.setRightChild(rightTree.root);
        }
    }
}
