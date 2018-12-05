package com.xouan.linear.bag;
public class MyLinkedBag<Item> implements MyBag<Item> {

    private Node first; // 链表头结点
    private int size;

    public MyLinkedBag() {
        first = null;
        size = 0;
    }

    private class Node {
       Item item;
       Node next;

       Node() {
       }
       Node(Item item) {
           this(item, null);
       }
       Node(Item item, Node next) {
           this.item = item;
           this.next = next;
       }
    }

    public int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(Item item) {
        Node newNode = new Node(item);
        newNode.next = first;
        first = newNode;
        size++;
        return true;
    }

    @Override
    public Item remove() {
        Item result = null;
        if (first != null) {
            result = first.item;
            first = first.next;
            size--;
        }
        return result;
    }

    @Override
    public boolean remove(Item item) {

        return false;
    }

    @Override
    public boolean contains(Item item) {

        boolean found = false;
        Node currentNode = first;
        while (!found && (currentNode != null)) {
            if (item.equals(currentNode.item)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }

    @Override
    public void clear() {

    }

    @Override
    public Item[] toArray() {
        Item[] result = (Item[])new Object[size];
        int index = 0;
        Node currentNode = first;
        while ((index < size) && (currentNode != null)) {
            result[index] = currentNode.item;
            currentNode = currentNode.next;
            index++;
        }
        return result;
    }

}
