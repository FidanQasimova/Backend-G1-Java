package Lesson2;

import java.util.Scanner;

public class UchEdediKicikdenBoyuyeSiralama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededleri daxil edin :");
        int eded1 = sc.nextInt();
        int eded2 = sc.nextInt();
        int eded3 = sc.nextInt();
        if (eded1 > eded2 && eded2 > eded3) {
            System.out.println(eded3 + " " + eded2 + " " + eded1);
        } else if (eded2 > eded1 && eded3 > eded2) {
            System.out.println(eded1 + " " + eded2 + " " + eded3);
        } else if (eded3 > eded2 && eded1 > eded2) {
            System.out.println(eded2 + " " + eded1 + " " + eded3);
        } else if (eded3 > eded2 && eded1 > eded3) {
            System.out.println(eded2 + " " + eded3 + " " + eded1);
        } else if (eded2 > eded1 && eded1 > eded3) {
            System.out.println(eded3 + " " + eded1 + " " + eded2);
        } else {
            System.out.println(eded1 + " " + eded3 + " " + eded2);
        }
    }
}




