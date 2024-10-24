package Lesson2;

import java.util.Scanner;                           //DUBLIKAT OLAN ANCAQ 1 DEYISENI SILIR.

public class DublikatlariSilen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char[] arr = new char[a];
        String s="";
        for (int k=0;k<a;k++) {
            arr[k]=sc.next().charAt(0);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                System.out.print(arr[i]);
                break;

                }

            }
        }
    }

