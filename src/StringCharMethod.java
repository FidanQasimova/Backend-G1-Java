import java.util.Scanner;

public class StringCharMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sozu daxil edin: ");
        String word = sc.nextLine();
        StringCharMethod(word);
    }
    public static void StringCharMethod (String word){
        String a=" ";
        for (int i = 0; i < word.length(); i++){
            a=word.charAt(i)+a;
        }System.out.println(a);
}
}
