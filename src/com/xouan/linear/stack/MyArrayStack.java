package com.xouan.linear.stack;


import java.util.Iterator;

public class MyArrayStack<Item> implements MyStack<Item> {
    private int size = 0;
    private Item[] items = (Item[]) new Object[1];

    private void check() {
        if (size >= items.length) {
            resize(2 * items.length);
        } else if (size > 0 && size <= items.length / 4) {
            resize(items.length / 2);
        }
    }

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        items = temp;
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
        check();
        items[size++] = item;
    }

    @Override
    public Item pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("stack is empty");
        }
        Item item = items[--size];
        check();
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i = size;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public Item next() {
                return items[--i];
            }
        };
    }

}