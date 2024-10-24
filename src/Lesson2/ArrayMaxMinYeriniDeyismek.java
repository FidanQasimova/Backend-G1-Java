package Lesson2;

import java.util.Scanner;                             //ISHLEYIR .

public class ArrayMaxMinYeriniDeyismek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        ArrayMaxMinYeriniDeyismek(arr);
    }
    public static void ArrayMaxMinYeriniDeyismek(int[] arr) {
        int max = arr[0];
        int min = arr[1];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            } else if (arr[j] < min) {
                min = arr[j];
            }
        }
            System.out.println("max= "+min+", "+"min= "+max);
        }
    }


