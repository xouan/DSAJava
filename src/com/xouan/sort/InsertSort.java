package com.xouan.sort;

public class InsertSort<T extends Comparable<T>> extends BaseSort<T> {

    @Override
    public void sort(T[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            int j = i - 1;
            while (j >= 0 && less(a[j], a[j -1])) {
                swap(a, j, j -1);
            }
        }
    }
}
