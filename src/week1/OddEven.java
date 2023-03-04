package week1;

public class OddEven {
    public static void OddOrEven(int num){

        if (num%2==0) System.out.println("Number" +num+ " is: Even");
        else System.out.println("Number "+num+ " is: Odd");
    }

    public static void main(String[] args) {

        OddOrEven(3);


    }

}
/*
Write a method which can identifies given number is even or odd
EX:
identify(5) -> "Odd" identify(6) -> "Even"
 */
