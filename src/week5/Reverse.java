package week5;

public class Reverse {


    public static  String reverse (String str){
        String result = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return str +" ==> "+ result;
    }
    public static void main(String[] args) {

        System.out.println(reverse("IALOCIN"));


    }

}
/*
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
 */
