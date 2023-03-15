package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveValues {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,20,30,40,50,88,95,101,123,154,178,250,256,512,1024,2048));

        System.out.println("all numbers = " + numbers);

        numbers.removeIf(number -> number>100);

        System.out.println("numbers less then 100 = " + numbers);


    }
}
