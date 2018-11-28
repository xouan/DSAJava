package com.xouan.linear.bag;

import java.util.Iterator;

public class MyLinkedBag<Item> implements MyBag<Item> {

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

    @Override
    public void add(Item item) {
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = first;
        first = newNode;
        size++;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node current = first;
            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                Item item = current.item;
                current = current.next;
                return item;
            }
        };
    }
}
