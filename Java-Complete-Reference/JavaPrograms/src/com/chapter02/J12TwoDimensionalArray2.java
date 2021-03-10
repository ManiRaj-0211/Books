package com.chapter02;

public class J12TwoDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr = new int[4][];
        int[] pos = { 1, 2, 3, 4 };

        int k = 1;

        arr[0] = new int[pos[0]];
        arr[1] = new int[pos[1]];
        arr[2] = new int[pos[2]];
        arr[3] = new int[pos[3]];

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < pos[i]; j++) {
                arr[i][j] = k;
                k += 1;
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < pos[i]; j++) {
                System.out.print((arr[i][j] * 3) + "  ");
            }
            System.out.println();
        }

    }
}
