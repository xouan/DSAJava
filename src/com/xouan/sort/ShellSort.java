package com.xouan.sort;

public class ShellSort<T extends Comparable<T>> extends BaseSort<T> {

    public  void sort(T[] a) {
        int N = a.length;
        int gap = N / 2;
        while (gap > 0) {
            for (int i = gap; i < N; i+=gap) {
                int j = i;
                while (j >= gap && less(a[j], a[j - gap])) {
                    swap(a, j, j - gap);
                    j -= gap;
                }
                swap(a, j, j - gap);
            }
            gap /= 2;
        }
    }

}
