package Example;

import java.util.Scanner;

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner iuput = new Scanner(System.in);
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 카푸치노");
		System.out.println("메뉴 번호를 선택하세요 : ");
		
		Scanner input = new Scanner(System.in);
		int numMeum = input.nextInt();
		
		switch (numMeum) {
		case 1:
			System.out.println("아메리카노를 선택하였습니다.");
			break;
		case 2:
			System.out.println("카페라떼를 선택하였습니다.");
			break;
		case 3:
			System.out.println("카푸치노를 선택하였습니다.");
			break;
			
		}
		
	}

}
