package array2;

import java.util.Arrays;

public class ShiftLeft {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(shiftLeft(new int[]{6, 2, 5, 3}))); // [2, 5, 3, 6]
        System.out.println(Arrays.toString(shiftLeft(new int[]{1, 2}))); // [2, 1]
        System.out.println(Arrays.toString(shiftLeft(new int[]{1}))); // [1]


    }


    public static int[] shiftLeft(int[] nums) {

        int[] finArr = new int[nums.length];
        int count = 0;

        if (nums.length > 0) {

            finArr[finArr.length - 1] = nums[0];


            for (int i = 1; i < nums.length; i++) {

                finArr[count] += nums[i];
                count++;

            }


        }

        return finArr;

    }
}
