package array2;

import java.util.Arrays;

public class WithoutTen {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(withoutTen(new int[]{1, 10, 10, 2}))); // → [1, 2, 0, 0]
        System.out.println(Arrays.toString(withoutTen(new int[]{10, 2, 10}))); // → [2, 0, 0]
        System.out.println(Arrays.toString(withoutTen(new int[]{1, 99, 10}))); // → [1, 99, 0]

    }


    public static int[] withoutTen(int[] nums) {

        boolean is10Found = false;
        int[] result = new int[nums.length];
        int countNone0 = 0;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] != 10) {

                result[countNone0] = nums[i];
                countNone0++;

            }/*if (nums[i] == 10){

                nums

            }*/


        }

        return result;

    }
}
