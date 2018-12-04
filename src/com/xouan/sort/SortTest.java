package com.xouan.sort;

public class SortTest {
    public static void main(String[] args) {
        Integer[] a = {45, 2, 4, 67, 4, 7, 8, 1};
        ShellSort<Integer> shellSort = new ShellSort<>();
        shellSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        SelectSort<Integer> selectSort = new SelectSort<>();
        selectSort.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println(a);

        System.out.println("start:");
        System.out.println(a);
    }
}
