package exam;

public class Example06 {
	public static void main(String[] args) {
		/*
		 * 정수형 (byte, short, int, long)
		 * 
		 * 크기가 작은순에서 큰순
		 * byte -> short -> int ->  long
		 * (1byte) (2byte)  (4byte) (8byte)
		 * 
		 * byte : -128 ~ 127
		 * short : -32768 ~ 32767
		 * int : -2147483648 ~ 2147483647
		 * long : -9223372036854775808 ~ 9223372036854775807
		 */
		
		// 정수형에는 2진수, 8진수, 16진수도 표현 가능하다
		// 출력은 전부 10진수로 출력됨
		byte num1 = 0110;
		short num2 = 0107;
		int num3 = 0x46;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		byte rValue1 = 20;
		short rValue2 = 30;
		int rValue3 = 40;
		long rValue4 = 500;
		System.out.println(rValue1);
		System.out.println(rValue2);
		System.out.println(rValue3);
		System.out.println(rValue4);
		
		// long 타입의 큰 정수를 표현하고자 하면 (int형 범위를 벗어났을시)
		// 숫자 뒤에 소문자 l이나 대문자 L을 반드시 붙인다
		long rValue5 = 10000000000L;
		System.out.println(rValue5);
		// long 타입 사용시 그냥 l, L을 붙이는 게 낫다
		long rValue6 = 5000L;
		System.out.println(rValue6);
	}
}
