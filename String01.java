package chap05;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("세 개의 숫자를 입력하세요: ");
        String input1 = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();

        int num1 = parseInt(input1);
        int num2 = parseInt(input2);
        int num3 = parseInt(input3);

        int max = findMax(num1, num2, num3);
        System.out.println("최대값은 " + max + "입니다.");

        scanner.close();
    }

    public static int parseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.err.println("숫자로 변환할 수 없는 입력입니다: " + str);
            System.exit(1);
            return 0; // 이 부분은 실제로 실행되지 않지만 Java 컴파일러의 요구사항에 따라 추가되었습니다.
        }
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