package chap01.exercise;

import java.util.Scanner;

public class Q8 {
    static int sumOf(int a, int b) {
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        int sum = 0;
        for(int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("a부터 b까지의 합을 구합니다.");
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();

        System.out.println(a + "부터 " + b + "까지의 합은 " + sumOf(a, b) + "입니다.");
    }
}
