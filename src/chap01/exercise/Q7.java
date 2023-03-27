package chap01.exercise;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n: ");
        int n = sc.nextInt();

        int half = n / 2;
        int sum = (1 + n) * half;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
