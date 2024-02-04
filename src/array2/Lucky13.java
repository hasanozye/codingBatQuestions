package array2;

public class Lucky13 {

    public static void main(String[] args) {


        System.out.println(lucky13(new int[]{})); // → true
        System.out.println(lucky13(new int[]{0, 2, 4})); // → true
        System.out.println(lucky13(new int[]{1, 2, 3})); // → false
        System.out.println(lucky13(new int[]{1, 2, 4})); // → false


    }


    public static boolean lucky13(int[] nums) {

        boolean n13 = true;

        for (int n : nums) {

            if (n == 1 || n == 3) {

                n13 = false;

            }

        }

        return n13;


    }

}
