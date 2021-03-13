// Compound Assignment Operator   =>   +=, -=, *=, /=, %=

package com.chapter03;

public class J02CompoundAssignmentOperator {
    public static void main(String[] args) {

        int a = 10, b = 4;

        a += b;     // a = a + b;
        System.out.println("+= Operator (a): " + a);
        a -= b;
        System.out.println("-= Operator (a): " + a);
        b *= a;
        System.out.println("*= Operator (b) : " + b);
        b /= a;
        System.out.println("/= Operator (b) : " + b);
        a %= b;
        System.out.println("%= Operator (b): " + a);

    }
}
