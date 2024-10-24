package Lesson2;

import java.util.Scanner;

public class PolindromOlmasiniYoxlamaq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ededi daxil edin : ");
        int eded = sc.nextInt();
        int b=0;
        int c=eded;
        while (eded > 0) {
            int a=eded%10;
            eded=eded/10;
            b=b*10+a;}
        if(b==c){
            System.out.println("Bu eded polindromdur !");}
        else{
            System.out.println("Bu eded polindrom deyil !");
        }

    }
}
