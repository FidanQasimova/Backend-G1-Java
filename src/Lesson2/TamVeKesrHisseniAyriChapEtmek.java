package Lesson2;

import java.util.Scanner;

public class TamVeKesrHisseniAyriChapEtmek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kesr ededi daxil edin : ");
        double eded=sc.nextDouble();
        int tam=(int) eded;
        double kesr=eded-tam;
        System.out.println("tam hisse = "+tam);
        System.out.println("kesr hisse = "+kesr);

    }
}
