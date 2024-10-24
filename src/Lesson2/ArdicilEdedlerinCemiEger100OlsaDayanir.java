package Lesson2;

import java.util.Scanner;

public class ArdicilEdedlerinCemiEger100OlsaDayanir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cem = 0;
        do {
            System.out.println("ededleri daxil edin : ");
            int eded = sc.nextInt();
            cem = cem + eded;


        } while (cem < 100);

        System.out.println("cem = " + cem);
        System.out.println("emeliyyat sonlandi !");



    }
}






