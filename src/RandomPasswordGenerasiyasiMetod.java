import java.util.Random;
import java.util.Scanner;

public class RandomPasswordGenerasiyasiMetod {
    public static void main(String[] args) {
       // Random rand = new Random();
        //System.out.println((char)rand.nextInt(10));
        //RandomPasswordGenerasiyasiMetod();



    }

    public static void RandomPasswordGenerasiyasiMetod(String[] args) {
        String boyukededler="AQWERTYUIOPSDFGHJLZXCVBNM";
        String kicikededler="qwertyuiopasdfghjklzxcvbnm";
        String reqemler="123456789";
        String isareler=",.!-_";
        Scanner sc = new Scanner(System.in);
        System.out.println("simvol sayini daxil edin :");
        int say= sc.nextInt();
        int a=0;
            for (int i=0;i<=say;i++){
                for (int j=0;j<=boyukededler.length();j++){
                    String s=" ";
                    s=s+boyukededler.charAt(i);

                    for (int k=0;k<=kicikededler.length();k++){
                        s=s+kicikededler.charAt(k);

                        for (int m=0;m<=reqemler.length();m++){
                            s=s+reqemler.charAt(m);

                            for (int n=0;n<=isareler.length();n++){
                                s=s+isareler.charAt(n);


                            }
                        }
                    }

                }


        }

    }
}
