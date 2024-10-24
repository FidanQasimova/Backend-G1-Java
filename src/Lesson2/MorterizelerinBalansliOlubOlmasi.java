package Lesson2;

import java.util.Scanner;

public class MorterizelerinBalansliOlubOlmasi {
    public static void main(String[] args) {                             //   ?
        Scanner sc = new Scanner(System.in);
        System.out.println("cumleni daxil edin : ");
        String cumle=sc.nextLine();
        //int n=cumle.length();
        String[] arr=cumle.split(" ");
        char[] morterizeler =new char[]{'{','}','[',']','(',')'};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<morterizeler.length;j++){
                if(arr[i].equals(morterizeler[j])){
                    System.out.println("balanslidir !");
                }
                else{
                    System.out.println("balansli deyil !");
                }
            }
        }



    }
}
