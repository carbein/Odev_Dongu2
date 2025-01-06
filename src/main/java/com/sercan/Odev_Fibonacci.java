package com.sercan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Odev_Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = input.nextInt();
        int a=0,b=1;
      for (int i = 1; i <= 9; i++) {
          System.out.println(a+" ");
          int toplam=a+b;
          a=b;
          b=toplam;
      }
    }
}