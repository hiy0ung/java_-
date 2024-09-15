package exam;

import java.util.Scanner;

class MethodTest {
	public int getSum(int num1, int num2) {
		return num1 + num2;
	}
	public int getSum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 메소드 오버로딩과 생성자 오버로딩
		 * 
		 */
		MethodTest test = new MethodTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num2 = sc.nextInt();
		System.out.println("숫자입력 >> ");
		int num3 = sc.nextInt();
		
		System.out.println(test.getSum(num1, num2));
		System.out.println(test.getSum(num1, num2, num3));
		
	}
}
