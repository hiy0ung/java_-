package exam;

import java.util.Scanner;

public class Example09 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 ==0) {
				sum = sum + i;
			}
		}
		System.out.println("짝수들의 합 : " +sum);
		
		// 수를 입력받아 1부터 입력받은 수까지의 합을 구하세요 !!
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		int sum1 = 0;
		for(int i = 1; i <= num; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(num + "까지의 합 : " + sum1);
	}
}
