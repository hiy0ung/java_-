package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * Scanner 클래스를 이용하여 원을 입력받아 달러로 바꾸어 
		 * 다음과 같이 출력하세요
		 * $1 = 1100원으로 가정하세요
		 * 원화를 입력하세요 >> 3300
		 * 3300원은 $3.0 입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원화를 입력하세요 >> ");
		int num1 = sc.nextInt();
		double dol = num1 / 1100;
		System.out.println(num1 + "원은 " + "$" + dol + " 입니다.");
	}
}
