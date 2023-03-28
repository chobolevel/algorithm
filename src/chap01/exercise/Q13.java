package chap01.exercise;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("변의 길이: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }
}
