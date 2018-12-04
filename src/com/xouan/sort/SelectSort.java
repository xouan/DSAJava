package com.xouan.sort;

public class SelectSort<T extends Comparable<T>> extends BaseSort<T> {

    @Override
    public void sort(T[] a) {
        int N = a.length;
        for (int i = 0; i < N - 1; i++) {
            int min = i; // 最小元素索引
            for (int j = i + 1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }
}
