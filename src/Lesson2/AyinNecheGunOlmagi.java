package Lesson2;

import java.util.Scanner;

public class AyinNecheGunOlmagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ayin nomresini daxil edin : ");
        int ay = Integer.parseInt(sc.nextLine());
        switch (ay) {
            case 1: System.out.println("Yanvar"+"- "+"31 gun");break;
            case 2: System.out.println("Fevral"+"- "+"28/29 gun");break;
            case 3: System.out.println("Mart"+"- "+"31 gun");break;
            case 4: System.out.println("Aprel"+"- "+"30 gun");break;
            case 5: System.out.println("May"+"- "+"31 gun");break;
            case 6: System.out.println("Iyun"+"- "+"30 gun");break;
            case 7: System.out.println("Iyul"+"- "+"31 gun");break;
            case 8: System.out.println("Avqust"+"- "+"31 gun");break;
            case 9: System.out.println("Sentyabr"+"- "+"30 gun");break;
            case 10: System.out.println("Oktyabr"+"- "+"31 gun");break;
            case 11: System.out.println("Noyabr"+"- "+"30 gun");break;
            case 12: System.out.println("Dekabr"+"- "+"31 gun");break;
            default: System.out.println("Daxil edilen melumat yanlishdir !");break;

        }
    }
}
