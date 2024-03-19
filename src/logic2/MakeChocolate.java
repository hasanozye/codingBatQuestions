package logic2;

public class MakeChocolate {

    public static void main(String[] args) {
        System.out.println(makeChocolate(1, 2, 5)); // 0
        System.out.println(makeChocolate(6, 2, 7)); // 2
        System.out.println(makeChocolate(4, 1, 9)); // 4
        System.out.println(makeChocolate(4, 1, 10)); // -1
        System.out.println(makeChocolate(4, 1, 7)); // 2
    }


    public static int makeChocolate(int small, int big, int goal) {

        /*int divided = goal / (5);

        int bigBarKg = divided * 5;
        if (bigBarKg == goal) {
            return -1;
        }else if ()

        if (small > goal - bigBarKg) {
            return (goal - bigBarKg);
        } else if (small == goal - bigBarKg) {
            return small;
        } else {
            return -1;
        }
*/

        // Calculate the maximum number of big bars we can use
        int maxBigBars = goal / 5;

        // If the maximum number of big bars is greater than the available big bars,
        // use all available big bars, otherwise use the maximum number of big bars
        int usedBigBars = Math.min(maxBigBars, big);

        // Calculate the remaining goal after using big bars
        int remainingGoal = goal - (usedBigBars * 5);

        // If the remaining goal can be reached using small bars, return the number of small bars needed
        if (remainingGoal <= small) {
            return remainingGoal;
        }

        // If the remaining goal cannot be reached using small bars, return -1
        return -1;

    }
}
