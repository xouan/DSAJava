package com.xouan.node;

public class Node<Item> {
    Item item;
    Node next;
    public Node(Item item) {
        this.item = item;
        this.next = null;
    }
}
