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

        int bigInch = big * 5;
        int i = 0;

        if (big >= 1) {
            for (i = 5; i < bigInch; i += 5) {

                if (i + small == goal || big == goal || bigInch == goal) {
                    return true;
                }
            }
        }
        
        
        for (int j = 1; j <= small; j++) {

            if (i+j == goal){
                return true;
            }

        }

        return false;
    }
}
