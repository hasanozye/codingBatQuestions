package array2;

import java.util.Arrays;

public class ZeroMax {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(zeroMax(new int[]{0, 4, 0, 3}))); // → [3, 4, 3, 3]
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 5, 0, 3}))); // → [5, 5, 3, 3]
        System.out.println(Arrays.toString(zeroMax(new int[]{0, 1, 0}))); // → [1, 1, 0]
    }


    public static int[] zeroMax(int[] nums) {


        int maxOdd = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                nums[i] = maxOdd;
            } else if (nums[i] % 2 != 0 && nums[i] > maxOdd) {
                maxOdd = nums[i];
            }
        }

        return nums;
    }
}
