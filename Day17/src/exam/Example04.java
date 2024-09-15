package exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 시험 점수를 입력받아 65점 이상이면 합격 아니면 불합격을 출력하고
		 * 만약 숫자가 아닌 값을 입력받으면 그에 해당하는 예외처리를 하세요 !!
		 */
		System.out.println("점수입력 >> ");
		
		try {
			int score = sc.nextInt();
			if(score >= 65) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} catch (InputMismatchException e) { 
			System.out.println("숫자 형태로 다시 입력하세요.");
		}
		
	}
}
