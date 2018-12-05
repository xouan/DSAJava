package com.xouan.linear.bag;

public class MyArrayBag<Item> implements MyBag<Item>{

    private final Item[] bag;
    private int size;
    private static final int DEFAULT_CAPACITY = 25;

    public MyArrayBag() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayBag(int capacity) {
        Item[] items = (Item[])new Object[capacity];
        bag = items;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(Item item) {
        boolean result = true;
        if (isArrayFull()) {
            result = false;
        } else {
            bag[size] = item;
            size++;
        }
        return result;
    }
    @Override
    public Item remove() {
        return null;
    }

    @Override
    public boolean remove(Item item) {
        return false;
    }

    @Override
    public boolean contains(Item item) {

        return false;
    }

    @Override
    public void clear() {

    }

    public Item[] toArray() {
        Item[] result = (Item[])new Object[size];
        for (int index = 0; index < size; index++) {
            result[index] = bag[index];
        }
        return result;
    }

    private boolean isArrayFull() {
        return size >= bag.length;
    }
}
