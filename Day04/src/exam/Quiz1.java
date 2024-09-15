package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 10 ~ 99 사이의 숫자하나를 입력받아 입력받은 수의
		 * 십의자리와 일의자리를 구분하여 출력해 주세요
		 * 
		 * 입력 >> 16
		 * 출력결과)
		 * 십의자리 : 1
		 * 일의자리 : 6
		 * 
		 * 입력 >> 84
		 * 출력결과)
		 * 십의자리 : 8
		 * 일의자리 : 4
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력 >> ");
		int num1 = sc.nextInt();
		int ten1 = num1 / 10;
		int one1 = num1 % 10;
		System.out.println("십의 자리 : " + ten1);
		System.out.println("일의 자리 : " + one1);
	}
}
