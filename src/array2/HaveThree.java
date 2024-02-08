package array2;

public class HaveThree {

    public static void main(String[] args) {

        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3})); // true
        System.out.println(haveThree(new int[]{3, 1, 3, 3})); // false
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4})); // false

    }


    public static boolean haveThree(int[] nums) {

        int count3 = 0;
        boolean is333 = false;

        for (int num : nums){

            if (num == 3) {
                count3++;

            }
        }

        for (int i = 1; i < nums.length - 1; i++) {



            if (count3 == 3 && nums[i - 1] != 3 && nums[i] == 3 && nums[i + 1] != 3) {

                is333 = true;

            }

        }
        return is333;
    }
}
