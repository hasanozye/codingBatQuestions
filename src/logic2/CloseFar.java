package logic2;

public class CloseFar {

    public static void main(String[] args) {

        System.out.println(closeFar(1, 2, 3)); // false
        System.out.println(closeFar(1, 2, 10)); // true
        System.out.println(closeFar(4, 1, 3)); // true
    }


    public static boolean closeFar(int a, int b, int c) {

        /*boolean isbClose = false;
        boolean iscClose = false;
        boolean isFar = false;

        if (Math.abs(a - b) <= 1) {

            isbClose = true;

        } else if (Math.abs(a - c) <= 1) {

            iscClose = true;

        }
        if (isbClose && Math.abs(c - a) >= 2) {

            isFar = true;
        } else if (iscClose && Math.abs(b - a) >= 2) {
            isFar = true;

        }

        return (iscClose && isFar) || (isbClose && isFar);*/

        boolean bClose = Math.abs(a - b) <= 1;
        boolean cClose = Math.abs(a - c) <= 1;

        boolean bFarFromAC = Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2;
        boolean cFarFromAB = Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2;

        return (bClose && cFarFromAB) || (cClose && bFarFromAC);


    }
}
