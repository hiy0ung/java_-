package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 국어점수 85점
		 * 수학점수 85점
		 * 영어점수 75점
		 * 국사점수 88점
		 * 
		 * 네 과목의 합계(정수)와 평균(실수) 를 출력하세요 !!
		 * 
		 * 합계 : 333
		 * 평균 : 83.25
		 * 
		 * 두 수를 입력받아 덧셈, 뺄셈, 곱셈, 나눗셈 출력하세요 !!~~
		 */
		
		int kor = 85;
		int mat = 85;
		int eng = 75;
		int his = 88;
		// 합계
		int sum = kor + mat + eng + his;
		System.out.println("합계 : " + sum);
		//평균
		double avg = sum / (double) 4;
		System.out.println("평균 : " + avg);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int x = sc.nextInt();
		System.out.println("숫자 입력 >> ");
		int y = sc.nextInt();
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
	}
}
