package week2;

import java.util.Scanner;


    public class DivisibleBy3_5_15 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String divide15 = "",
                    divide3 = "",
                    divide5 = "";

            System.out.println("Enter number: ");
            int num = input.nextInt();
            input.close();

            for (int i = 1; i <= num; i++) {

                if (i % 15 == 0) {
                    divide15 += i + " ";
                } else if (i % 3 == 0) {
                    divide3 += i + " ";
                } else if (i % 5 == 0) {
                    divide5 += i + " ";
                }

            }
            System.out.println("divide15 = " + divide15);
            System.out.println("divide5  = " + divide5);
            System.out.println("divide3  = " + divide3);
            input.close();


        }
    }

    /*
    Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

eX:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
     */



