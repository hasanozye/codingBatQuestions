package array2;

import java.util.Arrays;

public class Pre4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(pre4(new int[]{1, 2, 4, 1}))); //  → [1, 2]
        System.out.println(Arrays.toString(pre4(new int[]{3, 1, 4}))); // → [3, 1]
        System.out.println(Arrays.toString(pre4(new int[]{1, 4, 4}))); // → [1]
    }


    public static int[] pre4(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                index = i;
                break;
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = nums[i];
        }
        return result;
    }

}
