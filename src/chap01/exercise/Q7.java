package chap01.exercise;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n: ");
        int n = sc.nextInt();

        int first = n % 2 == 0 ? n + 1: n;
        int second = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int sum = first * second;

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
