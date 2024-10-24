package Lesson2;

import java.util.Scanner;                               //ISHLEYIR amma her bir elementi yoxlayib qiymet qaytarir.

public class ArraydaElementinOlubOlmamasiniYoxlamaq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        System.out.println("Elementi daxil edin : ");
        char element = sc.next().charAt(0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == element) {
                    System.out.println(j);break;
                } else  {
                    System.out.println("-1");
                }
            }
        }
    }
}


