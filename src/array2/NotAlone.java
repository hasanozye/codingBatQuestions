package array2;

import java.util.Arrays;

public class NotAlone {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(notAlone(new int[]{1, 1, 1, 2}, 1))); //→ [1, 1, 1, 2]
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3}, 2))); //→ [1, 3, 3]
        System.out.println(Arrays.toString(notAlone(new int[]{1, 2, 3, 2, 5, 2}, 2))); //→ [1, 3, 3, 5, 5, 2]
        System.out.println(Arrays.toString(notAlone(new int[]{3, 4}, 3))); //→ [3, 4]

    }


    public static int[] notAlone(int[] nums, int val) {

//        boolean isAlone = false;

        for (int i = 1; i < nums.length - 1; i++) {
            int beforeInx = nums[i - 1];
            int afterInx = nums[i + 1];

            if (nums[i] == val && (nums[i] != beforeInx && nums[i] != afterInx)) {
                nums[i] = Math.max(beforeInx, afterInx);
            }
        }
        return nums;


    }
}
