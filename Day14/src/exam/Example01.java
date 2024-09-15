package exam;

import java.util.Scanner;

public class Example01 {
	public static int solution(int number, int n, int m) {
		int result = 0;
		if(number % n == 0 && number % m == 0) {
			result = 1;
			return result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		/*
		 * 정수 number와 n, m이 주어진다. number가 n의 배수이면서 m의 배수이면 1
		 * 아니라면 0을 return 하도록 solution 함수를 구현하세요
		 * 
		 * 제한사항)
		 * 10 <= number <= 100
		 * 2 <= n, m < 10
		 * 
		 * 입출력 예시)
		 * number		n		m		result
		 * 60			2		3		  1
		 * 55			10		5		  0
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 >> ");
		int number = sc.nextInt();
		System.out.println("숫자 입력 >> ");
		int n = sc.nextInt();
		System.out.println("숫자 입력 >> ");
		int m = sc.nextInt();
		
		System.out.println(solution(number, n, m));
	}
}
