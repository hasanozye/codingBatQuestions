package string2;

import java.util.regex.Pattern;

public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop")); //→ "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
    }


    public static String zipZap(String str) {
            String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                    result += "zp";
                    i += 2;
                } else {
                    result += str.charAt(i);
                }
            }
            return result;
        }
        /*
        public String zipZap(String str): This line defines a public method named zipZap that takes a String as an argument and returns a String.

String result = "";: This line initializes an empty String named result. This String will be used to build the final result.

for (int i = 0; i < str.length(); i++): This line starts a for loop that iterates over each character in the input String str. The variable i is the index of the current character.

if (i < str.length() - 2 && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p'): This line is a conditional statement that checks three conditions:

i < str.length() - 2: This condition checks if the current index i is less than the length of the string minus 2. This is to ensure that there are at least two more characters after the current character. This prevents IndexOutOfBoundsException from being thrown when accessing str.charAt(i + 2).
str.charAt(i) == 'z': This condition checks if the current character is ‘z’.
str.charAt(i + 2) == 'p': This condition checks if the character two positions after the current character is ‘p’.
result += "zp";: If all three conditions in the if statement are true, this line adds “zp” to the result string.

i += 2;: This line increments the index i by 2. This is done because we’ve already processed the current character and the two characters after it, so we can skip them in the next iteration.

else { result += str.charAt(i); }: If the conditions in the if statement are not met, this line simply adds the current character to the result string.

return result;: After the for loop has finished executing, this line returns the final result.
         */



    }


