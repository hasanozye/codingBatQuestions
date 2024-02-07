package array2;

public class No14 {

    public static void main(String[] args) {

        System.out.println(no14(new int[]{2, 3, 4, 1})); // false
        System.out.println(no14(new int[]{1, 2, 3})); //  true
        System.out.println(no14(new int[]{1, 2, 3, 4})); // false
        System.out.println(no14(new int[]{2, 3, 4})); // true

    }

    public static boolean no14(int[] nums) {

        boolean hasOne = false;
        boolean hasFour = false;

        for (int num : nums) {
            if (num == 1) {
                hasOne = true;
            } else if (num == 4) {
                hasFour = true;
            }

            if (hasOne && hasFour) {
                return false;
            }
        }

        return true;


        /*boolean is1or4 = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                for (int j = i; j < nums.length; j++) {

                    if (nums[j] == 4) {
                        return false;

                    }

                }


            } else if (nums[i] == 4) {

                for (int j = i; j < nums.length; j++) {

                    if (nums[j] == 1) {
                        return false;

                    }

                }
            }

        }
        return true;*/

    }
}
