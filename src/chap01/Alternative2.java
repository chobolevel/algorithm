package chap01;

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("+와 -를 번갈아 n개를 출력합니다.");

        do {
            System.out.print("n: ");
            n = sc.nextInt();
        } while(n <= 0);

        for(int i = 1; i <= n / 2; i++) {
            System.out.print("+-");
        }

        if(n % 2 != 0) {
            System.out.print("+");
        }
    }
}
