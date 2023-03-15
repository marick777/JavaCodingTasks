package week9;

import java.util.Arrays;

public class ConcatTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7};

        int[] arr3 = new int[arr1.length + arr2.length]; // to make sure that 3rd array has enough capacity to contain all arr1 and arr2


        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++, k++) { // i: for first array's index numbers
            arr3[k] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) { // i: for second array's index numbers
            arr3[k] = arr2[i];
        }


        System.out.println(Arrays.toString(arr3));
    }
}
