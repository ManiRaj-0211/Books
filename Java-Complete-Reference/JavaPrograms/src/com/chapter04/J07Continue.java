package com.chapter04;

public class J07Continue {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            if(i == 5) {
                System.out.println("\nLoop Continue...");
                continue;
            }
            else {
                System.out.print(i + "  ");
            }
        }

    }
}
