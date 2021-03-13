package com.chapter04;

public class J08Return {
    public static void main(String[] args) {

        int a = 25, b = 25;
        int sum = addNumbers(a, b);

        System.out.println("Sum of Two Numbers : " + sum);

    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
