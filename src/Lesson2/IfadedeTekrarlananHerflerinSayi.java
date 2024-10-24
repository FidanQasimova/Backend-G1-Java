package Lesson2;

import java.util.Scanner;                                   //Alinmadi

public class IfadedeTekrarlananHerflerinSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ifadeni daxil edin : ");
        String ifade = sc.nextLine();
        IfadedeTekrarlananHerflerinSayi(ifade);
    }

    public static void IfadedeTekrarlananHerflerinSayi(String ifade) {
        int say = 0;
        for (int i = 0; i < ifade.length(); i++) {
            for (int j = 0; j < ifade.length(); j++) {
                //char ch = ifade.charAt(i);
                if (ifade.charAt(i) == ifade.charAt(j)) {
                    say++;
                    break;
                }
                System.out.println(ifade.charAt(j) + " " + say);
            }
            }
            //if (say > 1) {
            // System.out.print(ifade.charAt(i)) ;
            //System.out.print("-");
            //System.out.print(say);
        }

}



