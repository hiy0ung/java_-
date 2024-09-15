package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 숫자 하나를 입력받아 입력받은 수의 구구단을 출력하세요
		 * 입력 >> 5
		 * 5단이 출력되어야 한다
		 * 5 x 1 = 5
		 * 5 x 2 = 10
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}
}
