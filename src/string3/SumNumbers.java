package string3;

public class SumNumbers {

    public static void main(String[] args) {

        System.out.println(sumNumbers("abc123xyz")); // -> 123
        System.out.println(sumNumbers("aa11b33")); // -> 44
        System.out.println(sumNumbers("7 11")); // -> 18

    }


    public static int sumNumbers(String str) {

        int result = 0;
        String temp = ""; // Sayıları geçici olarak tutmak için bir string

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isDigit(currentChar)) {
                // Karakter bir sayıysa, temp'e ekle
                temp += currentChar;
            } else if (!temp.isEmpty()) {
                // Karakter bir sayı değilse ve temp boş değilse, temp'teki sayıyı ekle ve temp'i sıfırla
                result += Integer.parseInt(temp);
                temp = "";
            }
        }

        // Döngü bittikten sonra temp'te kalan son sayıyı da ekle
        if (!temp.isEmpty()) {
            result += Integer.parseInt(temp);
        }

        return result;

    }

}
