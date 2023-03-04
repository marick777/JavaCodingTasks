package week7;

import java.util.Arrays;

public class FindMinNum {

    public static int findMinNum(int[] arr) {

        int min = arr[0];

        for (int each : arr) {

            if (each < min) {
                min = each;
            }
        }
        return min;
    }

    public static int findMin(int[] arr2) {

        int min = arr2[0];

        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] < min) {
                min = arr2[i];
            }

        }

        return min;
    }


        public static void main (String[]args){
            System.out.println("findMinNum(new int[]{1, 3, 5, 6, 10, -3, -7, 22})\nMinimum number: " + findMinNum(new int[]{1, 3, 5, 6, 10, -3, -7, 22}));

           // System.out.println("findMin(new int[]{2, 3, 6, 78, 5, 4, -6, 0, 22, -33})\nMinimum number: " + findMin(new int[]{2, 3, 6, 78, 5, 4, -6, 0, 22, -33}));
        }


}
