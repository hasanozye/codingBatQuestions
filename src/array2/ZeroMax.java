package array2;

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3}))); // → [3, 4, 3, 3]
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3}))); // → [5, 5, 3, 3]
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 1, 0}))); // → [1, 1, 0]
    }


    public static int[] zeroMax(int[] nums) {


        boolean is0Found = false;
        boolean isOddAfter0Found = false;
        int indexOfZero = 0;
        int indexOfOdd = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                is0Found = true;
                indexOfZero = i;
            }

            if (is0Found && nums[i] % 2 != 0) {

                isOddAfter0Found = true;
                indexOfOdd = i;

            }

            if (is0Found && isOddAfter0Found && nums[i] % 2 != 0) {

                nums[indexOfZero] = nums[indexOfOdd];

            }

        }

        return nums;
    }
}
