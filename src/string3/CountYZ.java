package string3;

public class CountYZ {

    public static void main(String[] args) {
        System.out.println(countYZ("fez day")); // 2
        System.out.println(countYZ("day fez")); // 2
        System.out.println(countYZ("day fyyyz")); // 2
    }


    public static int countYZ(String str) {

        int count = 0;
        str = str.toLowerCase(); // Convert to lower case to make it case insensitive

        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is 'y' or 'z'
            if (str.charAt(i) == 'y' || str.charAt(i) == 'z') {
                // Check if it's the last character or not followed by a letter
                if (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))) {
                    count++;
                }
            }
        }

        return count;
        /*String[] arr = str.split(" ");
        int count = 0;

        for (int i = 0; i < arr.length-1; i++) {

            if ((arr[i].endsWith("z") || arr[i].endsWith("y")) && (!Character.isLetter(str.charAt(i+1)))) {
                count++;
            }
        }

        return count;
*/
    }
}
