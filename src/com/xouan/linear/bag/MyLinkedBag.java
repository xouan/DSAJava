package com.xouan.linear.bag;

public class MyLinkedBag<Item>{

    private Node first = null; // 链表首节点
    private int size = 0;
    private class Node {
       Item item;
       Node next;
    }
    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void add(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        size++;
    }

}
