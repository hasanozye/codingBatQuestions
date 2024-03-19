package logic2;

public class EvenlySpaced {

    public static void main(String[] args) {

        System.out.println(evenlySpaced(2, 4, 6)); // true
        System.out.println(evenlySpaced(4, 6, 2)); // true
        System.out.println(evenlySpaced(4, 6, 3)); // false

    }


    public static boolean evenlySpaced(int a, int b, int c) {

        /*int maybeMin = Math.min(b, c);
        int minnest = Math.min(maybeMin, a);

        int maybeMax = Math.max(b, c);
        int maxest = Math.max(maybeMax, a);*/


        int small, medium, large;

        // Find the small number
        if (a <= b && a <= c) {
            small = a;
            medium = Math.min(b, c);
            large = Math.max(b, c);
        } else if (b <= a && b <= c) {
            small = b;
            medium = Math.min(a, c);
            large = Math.max(a, c);
        } else {
            small = c;
            medium = Math.min(a, b);
            large = Math.max(a, b);
        }

        return (medium - small == large - medium);

    }
}
