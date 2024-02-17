package array2;

import java.util.Arrays;

public class FizzBuzz {


    public static void main(String[] args) {

        System.out.println(Arrays.toString(fizzBuzz(50, 56))); // → ["Buzz", "Fizz", "52", "53", "Fizz", "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(1, 6))); // → ["1", "2", "Fizz", "4", "Buzz"]
        System.out.println(Arrays.toString(fizzBuzz(1, 8))); // → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
        System.out.println(Arrays.toString(fizzBuzz(1, 11))); // → ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]


    }

    public static String[] fizzBuzz(int start, int end) {

        String[] finStr = new String[end - start];

        for (int i = 0; i < finStr.length; i++) {

            boolean isMod5 = start % 5 == 0;
            boolean isMod3 = start % 3 == 0;
            boolean isMod15 = start % 15 == 0;

            if (isMod15) {
                finStr[i] = "FizzBuzz";
                start++;

            } else if (isMod3) {
                finStr[i] = "Fizz";
                start++;

            } else if (isMod5) {
                finStr[i] = "Buzz";
                start++;

            }else {

                finStr[i] = String.valueOf(start);
                start++;

            }


        }

        return finStr;
    }

}
