package com.xouan.sort;

public abstract class BaseSort<T extends Comparable<T>>{

    public abstract void sort(T[] a);
    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
    protected void swap(T[] a, int i, int j) {
        T t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

}
