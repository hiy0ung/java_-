package quiz;

import java.util.Scanner;

class Calculate {
	public int a;
	public int b;
	
	public int calculate(int a, int b, char opt) {
		int result = 0;
		switch(opt) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		}
		return result;
	}
}

public class CalMain {
	/*
	 * 계산기 클래스를 만들고
	 * 더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는 클래스를 만드세요
	 * 
	 * int 타입의 필드 : a, b
	 * int calculate() : 클래스 목적에 맞는 연산을 실행하고 결과를 리턴함
	 * 
	 * 실행 )
	 * 두 정수와 연산자를 입력하세요 >>
	 * 5 7 *
	 * 35
	 * 
	 * 5 7 +
	 * 12
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수와 연산자를 입력하세요 >> ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		char opt = sc.next().charAt(0);
		Calculate cal = new Calculate();
		System.out.println(cal.calculate(num1, num2, opt));
	}
}
