package week6;

public class SumOfDigits {

    public static int SumOfDigits(String str) {
        int result = 0;

        //String[] arr = str.split(" ");
        char[] arr = str.toCharArray();

        for (char each : arr) {
            if (Character.isDigit(each)){
                //result += Integer.parseInt(String.valueOf(each));
                result += Integer.valueOf(""+each);
        }


    }
    return result;
}

    public static void main(String[] args) {
        System.out.println("SumOfDigits(235) = " + SumOfDigits("235"));

    }

}
