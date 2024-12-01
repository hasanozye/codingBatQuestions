package warmup1;

public class sleepIn {

    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));  // → true
        System.out.println(sleepIn(true, false)); //→ false
        System.out.println(sleepIn(false, true)); //→ true


    }


    private static boolean sleepIn(boolean weekDay, boolean vacation) {
        return !weekDay || vacation;

    }

}
