package Lesson2;

import java.util.Scanner;                                 //ISHLEYIR.

public class AnagramMetod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1ci Sozu daxil edin : ");
        String word = sc.nextLine();
        System.out.println("2ci Sozu daxil edin : ");
        String word2 = sc.nextLine();
        anagramMetod(word, word2);
    }
    public static void anagramMetod(String word,String word2) {
        int say=0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word2.length(); j++) {
                if (word.charAt(i) == word2.charAt(j)) {
                    say=say+1;}

                }}
            if (say==word2.length()) {
                System.out.println("Bu sozler Anagramdir !");}
            else {
                System.out.println("Bu sozler Anagram deyil !");
            }



    }
}
