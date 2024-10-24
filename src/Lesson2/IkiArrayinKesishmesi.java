package Lesson2;

import java.util.Scanner;                       //ISHLEYIR.

public class IkiArrayinKesishmesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[]{1,2,3,4,5};
        int[] array2 = new int[]{3,4,5,6,7};
        IkiArrayinKesishmesi(array1, array2);
    }
    public static void IkiArrayinKesishmesi(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    break;
                }
            }

        }
    }

}
