package com.xouan.linear.bag;

public class BagTest {
    public static void main(String[] args) {
        System.out.println("Test bag");
        MyBag<String> abag = new MyArrayBag<>();
        String[] contentsBag = {"A", "B", "C", "D", "A", "C", "B"};
        testAdd(abag, contentsBag);
        System.out.println("Test initially empty");
        abag = new MyArrayBag<>(9);
        String[] contentBag2 = {"C","D", "A", "B", "C", "D", "A"};
        testAdd(abag, contentBag2);

    }
    private static void testAdd(MyBag<String> abag, String[] content) {
        System.out.println("Sdding the following" + content.length + "string to the bag:");
        for (int index = 0; index < content.length; index++) {
            if (abag.add(content[index])) {
                System.out.println(content[index] + " ");
            } else {
                System.out.println("Unable to add" + content[index] + "to the bag");
            }
        }
        System.out.println();
        displayBag(abag);
    }
    private static void displayBag(MyBag<String> abag) {
        System.out.println("The bag contains the following string(s):");
        Object[] bagArray = abag.toArray();
        for (int index = 0; index < bagArray.length; index++) {
            System.out.println(bagArray[index] + " ");
        }
        System.out.println();
    }
}
