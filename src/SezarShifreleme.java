import java.util.Scanner;

public class SezarShifreleme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("metni daxil edin : ");
        String metn = sc.nextLine();
        System.out.println("kod addimini daxil edin : ");
        int kod = sc.nextInt();
        SezarShifreleme(metn);
    }

    public static void SezarShifreleme(String metn) {
        for (int i = 0; i < metn.length(); i++) {
            Integer.parseInt(metn.substring(i, i + 1));
            metn.charAt(i);
        }

    }
}
