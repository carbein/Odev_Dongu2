package com.sercan;

import java.util.Scanner;

public class Odev_UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Taban değerini giriniz : ");
        int taban = inp.nextInt();
        System.out.println("Üs değerini giriniz : ");
        int us = inp.nextInt();
        int sonuc=usAlma(taban, us);
        System.out.println(sonuc);

    }
    static int usAlma(int taban,int us) {
        if (us==0) {
            return 1;
        }else {
            return taban*usAlma(taban,us-1);
        }



    }
}
