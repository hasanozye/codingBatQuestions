package array2;

import java.util.Arrays;

public class ZeroFront {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0, 0, 1}))); // → [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{0, 1, 1, 0, 1}))); // → [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(new int[]{1, 0}))); // → [0, 1]

    }


    public static int[] zeroFront(int[] nums) {

//        boolean isZeroFound = false;
        int count0 = 0;
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
//            int[] result = new int[nums.length];

            if (nums[i] == 0) {

                result[count0] = nums[i];
                count0++;

            }
        }

        int[] woZeros = new int[nums.length-count0];
        int woZeroCount= 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0){

                woZeros[woZeroCount] = nums[i];
                woZeroCount++;

            }

        }

        int anotherCounter = 0;
        for (int i = count0; i <nums.length ; i++) {

            result[i] = woZeros[anotherCounter];
            anotherCounter++;

        }

        return result;

    }
}
