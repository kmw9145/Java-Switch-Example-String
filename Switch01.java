package chap05;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = input.nextInt();
		
		switch (num % 2) {
		case 0 :
			System.out.println("입력한 숫자는 짝수입니다.");
			break;
		case 1:
			System.out.println("입력한 숫자는 홀수입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		
		}
		
		

	}

}
