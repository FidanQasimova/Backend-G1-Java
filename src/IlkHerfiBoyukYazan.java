import java.util.Scanner;

public class IlkHerfiBoyukYazan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sozu daxil edin : ");
        String soz = sc.nextLine();
        IlkHerfiBoyukYazan(soz);

    }
public static void IlkHerfiBoyukYazan(String soz) {
        String s=soz.substring(0,1).toUpperCase();
            System.out.print(s+soz.substring(1));
        }
}

