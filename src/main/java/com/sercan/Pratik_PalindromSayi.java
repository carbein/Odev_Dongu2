package com.sercan;

import java.util.Scanner;

public class Pratik_PalindromSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number=inp.nextInt();
        isPalindrom(number);
    }
    public static boolean isPalindrom(int number) {
        int originalNumber = number;
        int reverseNumber = 0,lastNumber;
        while (number != 0) {
             lastNumber=number%10;
            reverseNumber=reverseNumber*10+lastNumber;
            number/=10;

        }
        if(reverseNumber==number){
            System.out.println("Palindrom sayidir.");
        }
        return true;
    }
}
