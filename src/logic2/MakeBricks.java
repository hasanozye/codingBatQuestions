package logic2;

import string2.GetSandwich;

public class MakeBricks {

    public static void main(String[] args) {

        System.out.println(makeBricks(3, 1, 7)); // → true
        System.out.println(makeBricks(6, 0, 11)); // → false
        System.out.println(makeBricks(3, 1, 8)); // → true
        System.out.println(makeBricks(3, 1, 9)); // → false
        System.out.println(makeBricks(3, 2, 10)); // → true
        System.out.println(makeBricks(3, 2, 8)); // → true


    }


    public static boolean makeBricks(int small, int big, int goal) {

        // Calculate the max number of big bricks that can be used
        int maxBigBricksNeeded = goal / 5;
        int bigBricksUsed = Math.min(maxBigBricksNeeded, big);

        // Calculate the remaining goal after using big bricks
        int goalRemaining = goal - (bigBricksUsed * 5);

        // Check if we have enough small bricks to cover the remaining goal
        return small >= goalRemaining;
    }
}
