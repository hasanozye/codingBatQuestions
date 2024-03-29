package array2;

public class BigDiff {

    public static void main(String[] args) {


        System.out.println(bigDiff(new int[]{10, 3, 5, 6})); //→ 7
        System.out.println(bigDiff(new int[]{7, 2, 10, 9})); //→ 8
        System.out.println(bigDiff(new int[]{2, 10, 7, 2})); //→ 8
    }

    public static int bigDiff(int[] nums){

        int max = nums[0];
        int min = nums[0];

        for (int num : nums){
            min = Math.min(min,num);
            max = Math.max(max,num);

        }

        return max - min;


    }
}
