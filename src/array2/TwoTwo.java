package array2;

public class TwoTwo {

    public static void main(String[] args) {

        System.out.println(twoTwo(new int[]{4, 2, 2, 3})); // true
        System.out.println(twoTwo(new int[]{2, 2, 4})); // true
        System.out.println(twoTwo(new int[]{2, 2, 4, 2})); // false

    }


    public static boolean twoTwo(int[] nums) {

        boolean is22 = false;


        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == 2) {

                if (nums[i + 1] == 2) {

                    is22 = true;
                    i++;

                } else if (nums[i + 1] != 2) {

                    is22 = false;
                }


            }

        }
        return is22;
    }

}
