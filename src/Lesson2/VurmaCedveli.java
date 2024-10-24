package Lesson2;

import java.util.Scanner;

public class VurmaCedveli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ededi daxil edin : ");
        int number = scanner.nextInt();
        for (int j = 1; j <= number; j++) {
            System.out.println("  ");
            for (int i = 0; i <= 10; i++) {
                System.out.println(j + " x " + i + " = " + (j * i));
            }
        }
            }
        }
