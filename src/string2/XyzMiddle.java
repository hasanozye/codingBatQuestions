package string2;

public class XyzMiddle {

    public static void main(String[] args) {

        System.out.println(xyzMiddle("xyz"));// → true
        System.out.println(xyzMiddle("AxyzBB")); //→ true
        System.out.println(xyzMiddle("xyzxyzAxyzBxyzxyz"));// → true -> 17 length odd number the index 8 is = 'y';
        System.out.println(xyzMiddle("xyzAxyzBBB"));// -> true -> 10 length even number the index 5 is = 'y';
        System.out.println(xyzMiddle("AxyzBBB"));// → false
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle(""));// → false

    }


    //    alterantive approach
    public static boolean xyzMiddle(String str) {
        int len = str.length();

        // Check if the string length is less than 3
        if (len < 3) {
            return false;
        }

        // Iterate through the possible middle positions
        for (int i = 0; i <= len - 3; i++) {
            // Check if "xyz" appears around the current middle position
            if (str.substring(i, i + 3).equals("xyz")) {
                // Check if the number of chars to the left and right differs by at most one
                int leftCount = i;
                int rightCount = len - i - 3;

                if (Math.abs(leftCount - rightCount) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }
     /*
    public static boolean xyzMiddle(String str) {

        boolean flag = false;

        if (str.length() < 3) {
            return flag;
        }

        int middleIndex = str.length() / 2;

        // Check if the middle character is 'y' and the substring around the middle contains "xyz"
        if (str.charAt(middleIndex) == 'y' && str.substring(middleIndex - 1, middleIndex + 2).equals("xyz")) {
            int beforeIndex = middleIndex - 1;
            int afterIndex = middleIndex + 2;

            String beforeSub = str.substring(0, beforeIndex);
            String afterSub = str.substring(afterIndex);

            // Check if the lengths of substrings on both sides differ by at most one
            flag = Math.abs(beforeSub.length() - afterSub.length()) <= 1;
        }

        // Check if the middle character is 'z' and the substring around the middle contains "xyz"
        else if (str.charAt(middleIndex) == 'z' && str.substring(middleIndex - 2, middleIndex + 1).equals("xyz")) {
            int beforeIndex = middleIndex - 2;
            int afterIndex = middleIndex + 1;

            String beforeSub = str.substring(0, beforeIndex);
            String afterSub = str.substring(afterIndex);

            // Check if the lengths of substrings on both sides differ by at most one
            flag = Math.abs(beforeSub.length() - afterSub.length()) <= 1;
        }

        return flag;
    }
      */
        /* this solution is false
        boolean flag = false;

        if (str.length() < 3) {
            return flag;
        }

        if (str.charAt(str.length() / 2) == 'y') {

            if (str.contains("xyz")) {

                int inx = str.length() / 2;
                int beforeInx = inx - 2;
                int afterInx = inx + 3;
                String firstSub = str.substring(0, beforeInx + 1);
                String afterSub = str.substring(afterInx - 1);


                for (int i = 0; i < str.length(); i++) {

                    if (Math.abs(firstSub.length() - afterSub.length()) <= 1) {

                        flag = true;
                        break;

                    }
                }
            }

        } else if (str.charAt(str.length() / 2) == 'z') {

            if (str.contains("xyz")) {

                int inx = str.length() / 2; // 3
                int beforeInx = inx - 3;
                int afterInx = inx + 1;
                String firstSub = str.substring(0, beforeInx + 1);
                String afterSub = str.substring(afterInx);


                for (int i = 0; i < str.length(); i++) {

                    if (Math.abs(firstSub.length() - afterSub.length()) <= 1) {

                        flag = true;
                        break;

                    }
                }
            }

        }
        return flag;
    }*/


}

