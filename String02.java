package chap05;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 개의 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int max = findMax(num1, num2, num3);
        System.out.println("최대값은 " + max + "입니다.");

        scanner.close();
    }

    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
}