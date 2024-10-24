package Lesson2;

import java.util.Scanner;

public class EdedinReqemlerCemi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ededi daxil edin : ");
        int eded = sc.nextInt();
        int cem=0;
        while(eded > 0){
            cem= cem + eded%10;
            eded=eded/10;}
            System.out.println("cem = "+cem);


        }


    }
