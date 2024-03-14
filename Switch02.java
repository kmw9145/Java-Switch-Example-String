package chap05;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("등급을 입력하세요 : ");
		 char grade = scanner.next().charAt(0);
		 
		 switch (grade) {
		 case 'A':
			 System.out.println("아주 열심히 하셨군요");
			 break;
		 case 'B':
			 System.out.println("아주 열심히 하셨군요");
			 break;
         case 'C':
             System.out.println("남들만큼 하셨네요.");
             break;
         case 'D':
             System.out.println("조금더 노력 이 필요합니다.");
             break;
         case 'F':
             System.out.println("교수님을 찾아오세요..");
             break;
         default:
             System.out.println("잘못된 등급입니다.");
		 }
	}

}
