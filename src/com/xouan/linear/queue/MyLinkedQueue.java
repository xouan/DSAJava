package com.xouan.linear.queue;

import java.util.Iterator;

public class MyLinkedQueue<Item> implements MyQueue<Item> {
    private Node first;
    private Node last;
    int size = 0;

    // 节点成员内部类
    private class Node {
        Item item;
        Node next;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public MyQueue<Item> add(Item item) {
        // 向表尾添加元素
        Node newNode = new Node();
        newNode.item = item;
        newNode.next = null;
        if (isEmpty()) {
            last = newNode;
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
        return this;
    }

    @Override
    public Item remove() throws Exception {
        // 从表头删除元素
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        Node node = first;
        first = first.next;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return node.item;
    }

    @Override
    public Iterator<Item> iterator() {

        // 使用匿名内部类实现迭代器
        return new Iterator<Item>() {
            Node cur = first;

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
