package exam;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 입력받은 숫자가 70점 이상이면 합격
		 * 그렇지 않으면 불합격을 출력하세요 (삼항연산자)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >> ");
		int score = sc.nextInt();
		String result = score >= 70 ? "합격" : "불합격";
		System.out.println(result);
}
}
