package array2;

import java.util.Arrays;

public class deneme {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(evenOdd(new int[]{3, 3, 2}))); // → [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(new int[]{1, 0, 1, 0, 0, 1, 1}))); // → [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(new int[]{2, 2, 2}))); // → [2, 2, 2]

    }


    public static int[] evenOdd(int[] nums) {

        int[] evenArr = new int[nums.length];
        int evenCounter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {

                evenArr[evenCounter] = nums[i];
                evenCounter++;

            }

        }

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {

                evenArr[evenCounter] = nums[i];
                evenCounter++;

            }

        }

        return evenArr;

    }
}
