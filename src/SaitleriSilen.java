import java.util.Scanner;

public class SaitleriSilen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu ve ya cumleni daxil : ");
        String soz = sc.nextLine();
        SaitlerinSayi(soz);
    }
    public static void SaitlerinSayi(String soz) {
        char[] saitler=new char[]{'a','A','o','O','u','U','i','e','E','ı','I','ə','Ə','İ','ö','Ö','ü','Ü'};
        String saitsiz="";String a;
        for (int i = 0; i < saitler.length; i++) {
            for (int j = 0; j < soz.length(); j++) {

                if (soz.charAt(j) != saitler[i]) {
                   a= soz.replace(saitler[i],soz.charAt(j));
                    saitsiz=saitsiz+a;
                    }
                }

            }
        System.out.println(saitsiz);
        }
                }