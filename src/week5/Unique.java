package week5;



public class Unique {

    public static String unique (String str){
        String result = "";

         for (int i = 0; i < str.length(); i++) {
                if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                    result += str.charAt(i);

                }
        }
        return result;
    }




    public static void main(String[] args) {

       System.out.println(unique("AAABBBCCCDEF"));

    }
}
/*
    String -- Find the unique
    Write a return method that can find the unique characters from the String
    Ex: unique("AAABBBCCCDEF") ==> "DEF"
 */
