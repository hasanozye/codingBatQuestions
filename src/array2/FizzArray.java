package array2;

import java.util.Arrays;

public class FizzArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArray(4))); //→ [0, 1, 2, 3]
        System.out.println(Arrays.toString(fizzArray(1))); //→ [0]
        System.out.println(Arrays.toString(fizzArray(10))); //→ [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    }


    public static int[] fizzArray(int n) {

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {

            arr[i] = i;

        }

        return arr;

    }
}
