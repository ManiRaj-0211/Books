package com.chapter04;

public class J06Break {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            if(i == 6) {
                System.out.println("\nLoop Break Here...");
                break;
            }
            else {
                System.out.print(i + "  ");
            }
        }

    }
}
