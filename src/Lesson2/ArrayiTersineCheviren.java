package Lesson2;

import java.util.Scanner;                                  //ISHLEYIR.

public class ArrayiTersineCheviren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s="";
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();}
        for (int j = 0; j < arr.length; j++) {
            s =arr[j]+s;}
            System.out.println(s);


    }
}
