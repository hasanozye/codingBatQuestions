package array2;

public class CenteredAverage {
    public static int centeredAverage(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        // Find the minimum and maximum values while calculating the sum
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
            sum += num;
        }

        // Subtract the minimum and maximum values from the sum, and divide by the remaining count
        return (sum - min - max) / (nums.length - 2);
    }

    public static void main(String[] args) {
        System.out.println(centeredAverage(new int[] {1, 2, 3, 4, 100}));  // Output: 3
        System.out.println(centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));  // Output: 5
        System.out.println(centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));  // Output: -3
    }
}
