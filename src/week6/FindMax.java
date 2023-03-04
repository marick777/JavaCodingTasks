package week6;

public class FindMax {


    public static int findMax (int[] arr){

        int max = arr[0];

        for (int each : arr) {

            if(each > max){
                max = each;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(findMax(new int[]{1, 2, 3, 4, 55, 6, 7, 8, 9}));
    }
}
