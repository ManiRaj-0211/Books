// Find Absolute Value

package com.chapter03;

public class J05TernaryOperator {
    public static void main(String[] args) {

        int a = -11;
        int b = 11;

        int x = a > 0 ? a : -a;
        int y = b > 0 ? b : -b;

        System.out.println("Original value : " + a + "\nAbsolute Value : " + x);
        System.out.println("\nOriginal Value : " + b + "\nAbsolute Value : " + y);

    }
}
