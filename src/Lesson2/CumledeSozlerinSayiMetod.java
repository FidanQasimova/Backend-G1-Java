package Lesson2;

import java.util.Scanner;                                   //ISHLEYIR.

public class CumledeSozlerinSayiMetod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cumleni daxil edin : ");
        String cumle=sc.nextLine();
        CumledeSozlerinSayiMetod(cumle);
    }
    public static void CumledeSozlerinSayiMetod(String cumle) {
        int say=1;
        for (int i = 0; i < cumle.length(); i++) {
            if(cumle.charAt(i)==' '){
                say=say+1;
            }
        }
        System.out.println("sozlerin sayi = "+say);
    }
}
