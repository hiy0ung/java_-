package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		// 카페 반복문연습문제 -> 수정된 거 풀기
		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random() * 100) + 1;
		System.out.println("컴퓨터가 1~100 중 랜덤숫자 하나를 정합니다.");
		System.out.println("이 숫자를 맞춰 주세요!!");
		int count = 0;
		System.out.println(com);
			while(true) {
				try {
				System.out.println("1~100까지 숫자 입력 >> ");
				int num = sc.nextInt();	
				count++;
				if(num > com) {
					System.out.println(num + " DOWN");
				} else if(num < com) {
					System.out.println(num + " UP");
				} else if (num == com) {
					System.out.println(num);
					System.out.println("정답입니다! " + count + "회만에 맞췄어요.");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("다시 입력해주세요!!");
				sc.nextLine();
			} 
		}
	}
}
