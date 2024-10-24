package Lesson2;

import java.util.Arrays;                                      //ISHLEYIR.
import java.util.Scanner;

public class ArrayElemenleriArtanSiraylaDuzmek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();}
        ArrayElemenleriArtanSiraylaDuzmek(arr);
        }
        public static void ArrayElemenleriArtanSiraylaDuzmek(int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");

            }

        }

}
