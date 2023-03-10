package week4;

public class FrequencyOfChar {

    public static void frequencyOfChar(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (!(result.contains("" + str.charAt(i)))) {
                result += "" + str.charAt(i) + count;
            }
        }
        System.out.println(result);

    }

    public static void main(String[] args) {

        frequencyOfChar("XXXXYYYZZZAAABBBC");

    }
}

/*
String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */