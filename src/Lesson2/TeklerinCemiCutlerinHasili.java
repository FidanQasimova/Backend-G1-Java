package Lesson2;
                                            //ISHLEYIR AMMA PRINTDE MUXTELIFLIK VAR.1 CAVAB CHIXMIR.
import java.util.Scanner;

public class TeklerinCemiCutlerinHasili {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int hasil=1;
        int cem=0;
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();}
            for (int j = 0; j <= arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    hasil = hasil * arr[j];
                } else {
                    cem = cem + arr[j];
                }
                System.out.println("cem= " + cem + " " + "hasil= " + hasil);
            }
    }
}

