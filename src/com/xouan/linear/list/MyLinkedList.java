package com.xouan.linear.list;

import java.util.Iterator;

public class MyLinkedList<Item> implements MyList<Item> {
    private Node head = null;
    private int size = 0;
    private class Node {
        Item item;
        Node next;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void add(int idx, Item item) {
        if (idx >= size) throw new ArrayIndexOutOfBoundsException();
        Node p = head;
        for (int i = 0; i < idx; i++) {
            p = p.next;
        }
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = p.next;
        p.next = newNode;
        size++;
    }
    public Item remove(int idx) {
        if (idx >= size) throw new ArrayIndexOutOfBoundsException();
        Node p = head;
        for (int i = 0; i < idx -1; i++) {
            p = p.next;
        }
        Item item = p.next.item;
        p.next = p.next.next;
        size--;
        return item;
    }
    public Item get(int idx) {
        if (idx >= size) throw new ArrayIndexOutOfBoundsException();
        Node p = head;
        for (int i = 0; i < idx; i++) {
            p = p.next;
        }
        Item item = p.item;
        return item;
    }
    public Item set(int idx, Item item) {
        if (idx >= size) throw new ArrayIndexOutOfBoundsException();
        Node p = head;
        for (int i = 0; i < idx; i++) {
            p = p.next;
        }
        Item old = p.item;
        p.item = item;
        return old;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node current = head;
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
