package com.chapter02;

public class J02IntegerDataType {
    public static void main(String[] args) {
        int x;

        x = 12662728;   // -2,147,483,648 to 2,147,483,648 => Integer Numbers

        System.out.println("Integer Value is : " + x);


        x = 123___456__789;     // Underscores are discarded when compile the program
        // we can use underscore for easier to read large integers
        System.out.println(x);
    }
}
