package Lesson2;

import java.util.Scanner;                                                //ISHLEYIR.

public class ArrayElemenleriMueyyenAraliqlaraGoreQruplasdirma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{5,12,19,22,8,25,30};
        int say=0,say1=0,say2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0 && arr[i]<=10) {
                say=say+1;}
            else if (arr[i]>=11 && arr[i]<=20) {
                say1=say1+1;
            }
            else if (arr[i]>=21 && arr[i]<=30) {
                say2=say2+1;}
            }
            System.out.println("[0-10] : "+say+"element");
            System.out.println("[11-20] : "+say1+"element");
            System.out.println("[21-30] : "+say2+"element");
        }
    }
