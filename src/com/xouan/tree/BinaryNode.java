package com.xouan.tree;

public class BinaryNode<T> {

    private T data;
    private BinaryNode<T> leftChild;
    private BinaryNode<T> rightChild;

    BinaryNode() {
        this(null);
    }

    BinaryNode(T data) {
        this(data, null, null);
    }

    BinaryNode(T data, BinaryNode<T> leftChild, BinaryNode<T> rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public boolean hasLeftChild() {
        return leftChild != null;
    }

    public boolean isLeaf() {
        return (leftChild == null) && (rightChild == null);
    }

    public int size() {return 0;}
    public int getHeight() {
        return getHeight(this);
    }
    private int getHeight(BinaryNode<T> node) {
        int height = 0;
        if (node != null) {
            height = 1 + Math.max(getHeight(node.getLeftChild()), getHeight(node.getRightChild()));
        }
        return height;
    }

}
