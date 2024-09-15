package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 3자리 숫자 하나를 입력받아 백으 자리 이하를 버리는 코드이다
		 * 만약 숫자를 456을 입력 받았다면 400이 되고
		 * 111을 입력받으면 100이 된다
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		System.out.println(num / 100 * 100);
	}
}
