package Lesson2;

import java.util.Locale;
import java.util.Scanner;                                    //ISHLEYIR

public class CumledeSozlerinBasHerfleriniBoyukYazan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cumleni daxil edin : ");
        String[] cumle = new String[1];
        cumle = sc.nextLine().split(" ");
        CumledeSozlerinBasHerfleriniBoyukYazan(cumle);
    }
    public static void CumledeSozlerinBasHerfleriniBoyukYazan(String[] cumle) {
        for (int i = 0; i < cumle.length; i++) {
            cumle[i]=cumle[i].substring(0,1).toUpperCase()+cumle[i].substring(1);
            }
        for (int i = 0; i < cumle.length; i++) {
        System.out.print(cumle[i]+" ");}
    }

        }
