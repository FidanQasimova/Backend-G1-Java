package Lesson2;

import java.util.Scanner;

public class YashKateqoriyalari {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Yasinizi daxil edin : ");
        int yas =sc.nextInt();
        if(yas>=0 && yas<=12){
            System.out.println("Ushaq");}
            else if(yas>=13 && yas<=30){
                System.out.println("Genc");}
                else if(yas>=31 && yas<=59){
                    System.out.println("Yetgin");}
                    else{
                        System.out.println("Yashli");}
            }
        }



