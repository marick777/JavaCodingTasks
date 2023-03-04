package week8;

import java.util.Arrays;

public class ZeroToEnd {

        public static void moveZerosToEnd(int[] nums) {
            int n = nums.length;
            int lastNonZeroIndex = 0;

            for (int i = 0; i < n; i++) {
                if (nums[i] != 0) {
                    nums[lastNonZeroIndex++] = nums[i];
                }
            }

            while (lastNonZeroIndex < n) {
                nums[lastNonZeroIndex++] = 0;
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 0, 2, 0, 3, 0, 4, 0};
            System.out.println("Before moving zeros: " + Arrays.toString(nums));
            moveZerosToEnd(nums);
            System.out.println("After moving zeros: " + Arrays.toString(nums));
        }
    }

/*
Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
