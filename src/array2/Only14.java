package array2;

public class Only14 {

    public static void main(String[] args) {

        System.out.println(only14(new int[]{2, 4, 1, 4})); // ->false
        System.out.println(only14(new int[]{1, 4, 1, 4})); // ->true
        System.out.println(only14(new int[]{1, 1})); // ->true

    }


    public static boolean only14(int[] nums) {

        boolean is1 = true;
        boolean is4 = true;

        for (int n : nums) {

            if (n != 4 && n != 1) {

                return false;

            }
        }

        return true;

        /*boolean is1 = false;
        boolean is4 = false;

        for (int n : nums) {

            if (n == 1){

                is1 = true;
            } else if (n == 4) {

                is4 = true;

            } else if (n != 5){

                is1 = false;
                is4 = false;


            }

        }

        return is1 && is4;*/

    }
}
