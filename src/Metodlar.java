import java.util.Scanner;
public class Metodlar {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("ededi daxil edin :");
         int a = sc.nextInt();int b;
         while(a>0){
             b=a%10;
             a=a/10;
             System.out.print(b);
        }
    }
}