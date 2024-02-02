package array2;

public class Sum67 {
    public static void main(String[] args) {
        System.out.println(sum67(new int[]{1, 2, 2, 6, 99, 99, 7}));// → 5
        System.out.println(sum67(new int[]{1, 2, 2}));// → 5
        System.out.println(sum67(new int[]{1, 1, 6, 7, 2}));// → 4
        System.out.println(sum67(new int[]{6, 8, 1, 6, 7}));// → 0
        System.out.println(sum67(new int[]{6, 7, 1, 6, 7, 7}));// → 8
    }


    public static int sum67(int[] nums) {
        int sum = 0;
        boolean ignoreSection = false;

        for (int num : nums) {
            if (num == 6) {
                ignoreSection = true;
            } else if (num == 7 && ignoreSection) {
                ignoreSection = false;
            } else if (!ignoreSection) {
                sum += num;
            }
        }

        return sum;
    }

}
