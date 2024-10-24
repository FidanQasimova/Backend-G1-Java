package Lesson2;

import java.util.Scanner;

public class CumleniikiFormadaTersineChevirmek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cumleni daxil edin : ");
        String cumle = sc.nextLine();
        Metod1(cumle);
        Metod2(cumle);
    }

    public static void Metod1(String cumle) {
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                String a = cumle.substring(0, i);
                String b = cumle.substring(i + 1);
                System.out.println(b +" "+ a);
            }
            //cumle.replaceAll(" ", "");
        }

    }// BURDAN SONRASI ALINMIR.
    public static void Metod2(String cumle) {
        for (int i = 0; i < cumle.length(); i++) {
            if (cumle.charAt(i) == ' ') {
                String a = cumle.substring(0, i);
                String b = cumle.substring(i + 1);
                for (int j = 0; j < a.length(); j++) {
                    String soz1 = " ";
                    soz1=a.charAt(j)+soz1;
                System.out.print(soz1);}
                for (int j = 0; j < b.length(); j++) {
                    String soz2 = " ";
                    soz2=b.charAt(j)+soz2;
                System.out.print(soz2);}

                }

            }
        }
    }

