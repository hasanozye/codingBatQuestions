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

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 6) { // 4. index

                for (int j = i; j < nums.length; j++) {
                    if (nums[j] == 7) {
                        break;

                    }
                    i++;

                }

            }
            if (nums[i] != 6 && nums[i] != 7) {
                sum += nums[i];
            }

        }
        return sum;
        //TODO: Solve this mf. this ain't workin for cretain test cases.
    }

}
