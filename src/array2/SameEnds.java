package array2;

public class SameEnds {

    public static void main(String[] args) {


        /*
        Return true if the group of N numbers at the start and end of the array are the same.
        For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
        and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
         */
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 2)); // true
        System.out.println(sameEnds(new int[]{1, 2, 5, 2, 1}, 2)); // false
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 1)); // false
        System.out.println(sameEnds(new int[]{5, 6, 45, 99, 13, 5, 6}, 3)); // false

    }


    public static boolean sameEnds(int[] nums, int len) {

        boolean flag = false;

        for (int i = 0; i < len; i++) {

            if (nums[i] != nums[nums.length - len+i]) {

                return false;
            }


        }


        return true;

    }
}
