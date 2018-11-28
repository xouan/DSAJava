package com.xouan.linear.list;

import java.util.Iterator;

public class MyArrayList<Item> implements MyList<Item> {
    private int size = 0;
    private Item[] items = (Item[]) new Object[1];

    private void resize(int max) {
        Item[] temp = (Item[]) new Object[max];
        for (int i = 0; i < size; i++) {
            temp[i] = items[i];
        }
        items = temp;
    }

    private void check() {
        if (size >= items.length) {
            resize(2 * items.length);
        } else if (size > 0 && size <= items.length / 4) {
            resize(items.length / 2);
        }
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
        check();
        for (int i = size; i > idx; i--) {
            items[i] = items[i - 1];
        }
        items[idx] = item;
    }

    @Override
    public Item remove(int idx) throws Exception {
        if (isEmpty()) {
            throw new Exception("list is empty");
        }
        Item item = items[--size];
        check();
        return item;
    }

    @Override
    public Item get(int idx) {
        if (idx < 0 || idx >= size) throw new ArrayIndexOutOfBoundsException();
        return items[idx];
    }

    @Override
    public Item set(int idx, Item item) {
        if (idx < 0 || idx >= size) throw new ArrayIndexOutOfBoundsException();
        Item old = items[idx];
        items[idx] = item;
        return old;
    }

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i = size;

            @Override
            public boolean hasNext() {
                return i > size;
            }

            @Override
            public Item next() {
                return items[--i];
            }
        };
    }
}
