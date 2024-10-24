import java.util.Scanner;

public class SaitleriSayan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sözü və ya cümləni daxil edin : ");
        String soz = sc.nextLine();
        SaitleriSayan(soz);
    }
    public static void SaitleriSayan(String soz){
        int say=0;
        char[] saitler=new char[]{'a','A','o','O','u','U','i','e','E','ı','I','ə','Ə','İ','ö','Ö','ü','Ü'};
        for(int i = 0; i < soz.length(); i++){
            for(int j = 0; j < saitler.length; j++){
            if(soz.charAt(i)==saitler[j]){
                say=say+1;
            }
            }
        }
        System.out.println("saitlerin sayi = "+say);

    }
}
