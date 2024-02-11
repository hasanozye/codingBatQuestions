package array2;

public class TripleUp {


    public static void main(String[] args) {

        System.out.println(tripleUp(new int[]{1, 4, 5, 6, 2})); // true
        System.out.println(tripleUp(new int[]{1, 2, 3})); // true
        System.out.println(tripleUp(new int[]{1, 2, 4})); // false


    }


    public static boolean tripleUp(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {

            if (nums[i] + 1 == nums[i + 1] && nums[i + 1] + 1 == nums[i + 2]) {

                return true;

            }

        }


        return false;
    }
}
