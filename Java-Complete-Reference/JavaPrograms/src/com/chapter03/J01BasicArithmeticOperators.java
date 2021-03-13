// Basic Arithmetic Operators   =>   +, -, *, /, %

package com.chapter03;

public class J01BasicArithmeticOperators {
    public static void main(String[] args) {

        // Basic Arithmetic Operation in Integer
        int a = 10;
        int b = 4;

        int ia = a + b;
        int ib = a - b;
        int ic = a * b;
        int id = a / b;
        int ie = a % b;

        System.out.println("Addition of Two Integer is : " + ia);
        System.out.println("Subtraction of Two Integer is : " + ib);
        System.out.println("Multiplication of Two Integer is : " + ic);
        System.out.println("Division of Two Integer is : " + id);
        System.out.println("Modulus of Two Integer is : " + ie + '\n');


        // Basic Arithmetic Operation on Double
        double x = 12.423;
        double y = 5.325;

        double da, db, dc, dd, de;

        da = x + y;
        db = x - y;
        dc = x * y;
        dd = x / y;
        de = x % y;

        System.out.println("\nAddition of Two Double is : " + da);
        System.out.println("Subtraction of Two Double is : " + db);
        System.out.println("Multiplication of Two Double is : " + dc);
        System.out.println("Division of Two Double is : " + dd);
        System.out.println("Modulus of Two Double is : " + de);
    }
}
