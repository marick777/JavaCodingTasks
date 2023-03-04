package week4;

public class SameLet {

    public static boolean same(String str, String str1) {

        if (!(str.length() == str1.length())) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!(str1.contains(""+str.charAt(i)))) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(same("abcd", "bcad"));

    }
}
/*
String -- Same letters
        Write a return method that check if a string is build out of the
        same letters as another string.
        Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:
*/
