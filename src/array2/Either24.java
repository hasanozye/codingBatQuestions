package array2;

public class Either24 {

    public static void main(String[] args) {

        System.out.println(either24(new int[]{1, 2, 3, 4})); // → false
        System.out.println(either24(new int[]{1, 2, 2})); // → true
        System.out.println(either24(new int[]{4, 4, 1})); // → true
        System.out.println(either24(new int[]{4, 4, 1, 2, 2})); // → false
    }


    public static boolean either24(int[] nums) {

        boolean is22 = false;
        boolean is44 = false;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 2) {

                is22 = true;

            } else if (nums[i] == 4 && nums[i + 1] == 4) {

                is44 = true;
            }

            if (is22 && is44) {

                return false;
            }

        }
        return is22 || is44;
    }
}
