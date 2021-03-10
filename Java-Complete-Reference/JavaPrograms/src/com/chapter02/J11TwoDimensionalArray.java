package com.chapter02;

public class J11TwoDimensionalArray {
    public static void main(String[] args) {

        int[][] arr = new int[4][5];

        int k = 1;

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                arr[i][j] = k;
                k += 1;
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
