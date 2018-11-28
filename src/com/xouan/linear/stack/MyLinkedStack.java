package com.xouan.linear.stack;

import java.util.Iterator;

public class MyLinkedStack<Item> implements MyStack<Item> {

    private Node top = null;
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
    public void push(Item item) {
        Node newTop = new Node();
        newTop.item = item;
        newTop.next = top;
        top = newTop;
        size++;
    }

    @Override
    public Item pop() throws Exception{
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        Item item = top.item;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private Node cur = top;
            @Override
            public boolean hasNext() {
                return cur != null;
            }

            @Override
            public Item next() {
                Item item = cur.item;
                cur = cur.next;
                return item;
            }
        };
    }
}
