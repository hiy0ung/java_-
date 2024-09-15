package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 다음카페 > 자바수업 > 반복문 연습문제1
		 * while문과 scanner를 이용해 키보드로부트 입력된 데이터로
		 * 예금, 출금, 조회, 종료 기능을 제작하세요 !!~~
		 */
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 |2. 출금 |3. 잔금 |4. 종료");
			System.out.println("-------------------------------");
			System.out.println(">> ");
			int num = sc.nextInt();
			
			if(num == 1) {
				System.out.println("예금액 : ");
				int money = sc.nextInt();
				balance = balance + money;
			} else if(num == 2) {
				System.out.println("출금액 : ");
				int money = sc.nextInt();
				if(balance < money) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance = balance - money;
				}
			} else if(num == 3) {
				System.out.println("잔고 : " + balance);
			} else if(num == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
	}
}
