package week1;

public class DivideNum {

    public static void DivideWithout(double dividend, double divisor){
        if (divisor == 0) throw new IllegalArgumentException("Can not divide by 0");
        int res = 0;
        while (dividend >= divisor){
            dividend -= divisor;
            res++;
        }
        System.out.println("Result: "+ res);
    }

    public static void main(String[] args) {

        DivideWithout(45,3);



    }


}
/*
Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
 */

