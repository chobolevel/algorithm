package chap01.exercise;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("   | ");
        for(int i = 1; i < 10; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();

        System.out.print("---+");
        for(int i = 0; i < 10; i++) {
            System.out.print("---");
        }
        System.out.println();

        for(int i = 1; i < 10; i++) {
            System.out.print(i + "  | ");
            for(int j = 1; j < 10; j++) {
                System.out.printf("%3d", i + j);
            }
            System.out.println();
        }
    }
}
