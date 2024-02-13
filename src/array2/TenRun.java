package array2;

import java.util.Arrays;

public class TenRun {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(tenRun(new int[]{2, 10, 3, 4, 20, 5}))); // → [2, 10, 10, 10, 20, 20]
        System.out.println(Arrays.toString(tenRun(new int[]{10, 1, 20, 2}))); // → [10, 10, 20, 20]
        System.out.println(Arrays.toString(tenRun(new int[]{10, 1, 9, 20}))); // → [10, 10, 10, 20]
    }


    public static int[] tenRun(int[] nums) {
        boolean found = false;
        int multiple = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                found = true;
                multiple = nums[i];
            } else if (found) {
                nums[i] = multiple;
            }
        }
        return nums;


    /*
//        boolean isMod10 = false;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] % 10 == 0) {

                nums[i + 1] = nums[i];
                i++;
            }


        }

        return nums;
     */

    }
}
