// Relational Operators   ==, !=, >, <, >=, <=

package com.chapter03;

public class J03RelationalOperator {
    public static void main(String[] args) {

        int a = 145;
        int b = 145;

        System.out.println("== Operator : " + (a == b));    // return true
        System.out.println("!= Operator : " + (a != b));    // return false
        System.out.println("< Operator : " + (a < b));    // return false
        System.out.println("> Operator : " + (a > b));    // return false
        System.out.println("<= Operator : " + (a <= b));    // return true
        System.out.println(">= Operator : " + (a >= b));    // return true
    }
}
