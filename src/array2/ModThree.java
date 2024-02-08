package array2;

public class ModThree {

    public static void main(String[] args) {

        System.out.println(modThree(new int[]{2, 1, 3, 5})); // true
        System.out.println(modThree(new int[]{2, 1, 2, 5})); // false
        System.out.println(modThree(new int[]{2, 4, 2, 5})); // true

    }


    public static boolean modThree(int[] nums) {

        boolean isEven = false;
        boolean isOdd = false;

        for (int i = 0; i < nums.length-2; i++) {

            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {

                isEven = true;

            } else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {

                isOdd = true;

            }

        }

        return isEven || isOdd;

    }
}
