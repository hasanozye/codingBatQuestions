package string2;

public class GetSandwich {

    public static void main(String[] args) {

        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy")); // → ""

    }

    public static String getSandwich(String str) {

        // Find the indices of the first and last occurrences of "bread"
        int firstBreadIndex = str.indexOf("bread");
        int lastBreadIndex = str.lastIndexOf("bread");

        // Check if there are two pieces of bread
        if (firstBreadIndex != -1 && lastBreadIndex != -1 && firstBreadIndex != lastBreadIndex) {
            // Extract the string between the first and last occurrences of "bread"
            return str.substring(firstBreadIndex + 5, lastBreadIndex);
        } else {
            // Return an empty string if there are not two pieces of bread
            return "";
        }


    }
}