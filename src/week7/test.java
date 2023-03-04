package week7;

import java.util.Arrays;

public class test {

    public static int[] sortArray(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println("Loop " + (i + 1) + ": " + Arrays.toString(arr));
            for (int j = 1; j < (arr.length - i); j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("Sort Ascending = " + Arrays.toString(sortArray(new int[]{1,2,3,4,5,6,7,8,9,10,-25})));


    }
}

