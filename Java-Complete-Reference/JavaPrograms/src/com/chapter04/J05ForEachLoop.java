// Sum of First 10 Integers

package com.chapter04;

public class J05ForEachLoop {
    public static void main(String[] args) {

        // From One Dimensional Array
        int[] oneD = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sumOneD = 0;

        for(int i: oneD) {
            sumOneD += i;
        }

        System.out.println("From One Dimensional Array : " + sumOneD);


        // From MultiDimensional Array
        int[][] twoD = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int sumTwoD = 0;

        for(int[] x: twoD) {
            for(int y: x) {
                sumTwoD += y;
            }
        }

        System.out.println("From Two Dimensional Array : " + sumTwoD);
    }
}
