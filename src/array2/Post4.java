package array2;

import java.util.Arrays;

public class Post4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(post4(new int[]{2, 4, 1, 2}))); // → [1, 2]
        System.out.println(Arrays.toString(post4(new int[]{4, 1, 4, 2}))); // → [2]
        System.out.println(Arrays.toString(post4(new int[]{4, 4, 1, 2, 3}))); // → [1, 2, 3]


    }

    public static int[] post4(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 4) {
                count = i;
            }

        }


        int[] result = new int[nums.length-count-1];
        int number = 0;
        for (int i = count; i < nums.length-1; i++) {

            result[number] = nums[i+1];
            number++;

        }


        return result;
    }
}
