package array2;

public class Sum28 {

    public static void main(String[] args) {
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2})); // → true
        System.out.println(sum28(new int[]{2, 3, 2, 2, 4, 2, 2})); // → true
        System.out.println(sum28(new int[]{1, 2, 3, 4})); // → true

    }


    public static boolean sum28(int[] nums) {

        int sum = 0;
        boolean is8 = true;

        for (int n : nums) {

            if (n == 2) {

                sum += n;
            }


        }

        return (sum == 8) == is8;
    }
}
