package exam;

public class Example05 {
	public static void main(String[] args) {
	/*
	 * 비트 연산자
	 * - 비트(bit) 단위로 연산한다
	 * byte, short, char 타입을 비트 연산하면 int 타입으로 자동타입변환되어 계산됨
	 * 
	 * 종류) ~, &, ^, |, <<, >>
	 * &(논리곱) AND 연산자 : 두 비트가 모두 1일 경우 1
	 * |(논리합) OR 연산자 : 두 비트중 하나만 1이면 결과는 1 
	 * ^(배타적 논리합) : 두 비트가 다를 경우 결과 1
	 * <<(쉬프트연산자) : 왼족으로 지정한 숫자만큼 비트 이동
	 * >>(쉬프트연산자) : 오른쪽으로 지정한 숫자만큼 비트 이동
	 */
	 int num1 = 15;
	 int num2 = 20;
	 int result1 = num1 & num2;
	 System.out.println(result1);
	 
	 int result2 = num1 | num2;
	 System.out.println(result2);
	 
	 int result3 = num1 ^ num2;
	 System.out.println(result3);
	 
	 int result4 = num1 << 2;
	 System.out.println(result4);
	 
	 int result5 = num1 >> 2;
	 System.out.println(result5);
	 
	 int result6 = ~num1;
	 System.out.println(result6);
	}
}
