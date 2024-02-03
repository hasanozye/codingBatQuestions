package array2;

public class Has22 {

    public static void main(String[] args) {
        System.out.println(has22(new int[]{1, 2, 2})); // → true
        System.out.println(has22(new int[]{1, 2, 1, 2})); // → false
        System.out.println(has22(new int[]{2, 1, 2})); // → false
    }


    public static boolean has22(int[] nums) {

        boolean isthere22 = false;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] == 2 && nums[i + 1] == 2) {

                isthere22 = true;
                break;
            }

        }

        return isthere22;


    }
}
