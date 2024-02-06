package array2;

import java.util.Arrays;

public class FizzArray2 {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzArray2(4))); //→ ["0", "1", "2", "3"]
        System.out.println(Arrays.toString(fizzArray2(10)));// → ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
        System.out.println(Arrays.toString(fizzArray2(2))); //→ ["0", "1"]

    }


    public static String[] fizzArray2(int n) {

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {

            arr[i] = String.valueOf(i);

        }

        return arr;


    }
}
