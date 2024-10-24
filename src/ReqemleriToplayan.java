import java.util.Scanner;

public class ReqemleriToplayan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("sozu daxil edin : ");
        String soz = sc.nextLine();
        ReqemleriToplayan(soz);

    }

    public static void ReqemleriToplayan(String soz) {
        int cem=0;
        char[] ededler=new char[]{'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < soz.length(); i++) {
            for (int j = 0; j < ededler.length; j++) {
                Integer.parseInt(soz.substring(i,soz.length()));
                if (soz.charAt(i) == ededler[j]) {

                    cem=cem+1;
                    System.out.println("cem= "+cem);

                }
            }

        }


    }
}
