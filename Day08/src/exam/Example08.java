package exam;

import java.util.Scanner;

public class Example08 {
	public static void main(String[] args) {
		// 입력을 받아서 배열에 값을 할당하기
		int arr[] = new int[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 + "번째 입력 >> ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}
}
