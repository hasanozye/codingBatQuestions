package array2;

public class Sum13 {

    public static void main(String[] args) {

        System.out.println(sum13(new int[]{1, 2, 13, 2, 1, 13}));// → 4
        System.out.println(sum13(new int[]{1, 2, 2, 1}));// → 6
        System.out.println(sum13(new int[]{1, 1}));// → 2
        System.out.println(sum13(new int[]{1, 2, 2, 1, 13}));// → 6
        System.out.println(sum13(new int[]{13}));// → 0
    }

    public static int sum13(int[] arr) {

        int sum = 0;
        if(arr.length != 0 && arr[0] != 13){
            sum = arr[0];

        }
        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1] == 13) {
                continue;
            }

            if (arr[i] == 13){
                continue;
            }
            sum += arr[i];

        }

/*        for(int n: arr){

            if (n == 13){

                continue;

            }
            sum += n;

        }
*/
        return sum;
    }

}
