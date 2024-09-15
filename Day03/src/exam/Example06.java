package exam;

import java.util.Scanner;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * Scanner() : 사용자가 데이터를 입력받을 때 사용하는 클래스
		 * 
		 * 형식)
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * sc.nextByte() : byte형 입력 및 리턴
		 * sc.nextShort() : Short형 입력 및 리턴
		 * sc.nextInt() : Int형 입력 및 리턴
		 * sc.nextLong() : Long형 입력 및 리턴
		 * 
		 * sc.nextFloat() : Float형 입력 및 리턴
		 * sc.nextDouble() : Double형 입력 및 리턴
		 * 
		 * sc.next() : String형 입력 및 리턴 (공백을 기준으로 단어 하나를 읽어들임)
		 * sc.nextLine() : String형 입력 및 리턴 (개행을 기준으로 한 줄을 읽어들임)
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자입력 >> ");
		int a = sc.nextInt(); // 변수 a라고 선언한 곳에 내가 입력한 값을 넣겠다는 뜻
		System.out.println(a);
		
	}
}
