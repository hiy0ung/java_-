package exam;

public class Example14 {
	public static void main(String[] args) {
		/*
		 * 산술연산자
		 * - 산술연산자는 사칙연산자와 나머지 연산자가 있다
		 * - 일반적으로 정수, 실수 등 숫자를 연산할 때 사용
		 * 
		 * * 연산의 결과값이 자료형의 범위 안에 있어야 하고 만약 범위 밖으로 값이 넘어가면 오버플로우 혹은 쓰레기 값이 출력된다
		 * * 피연산자의 자료형이 일치하지 않을 경우 크기가 큰 자료형으로 자동 형 변환이 일어난 후 연산 실행
		 */
		int x = 200;
		int y = 100;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y); // x를 y로 나눴을 때 나머지
		
		// double이 int 보다 크므로 자동으로 double 타입에 맞춰서 형 변환된 후 출력
		double num1 = 1.2345;
		int num2 = 6;
		System.out.println(num1 + num2);
		
		// int 타입 범위의 수를 벗어나서 오버플로우 일어남 (쓰레기값 출력됨)
		// int result = 1000000 * 1000000;
		// System.out.println(result);
		
		long result = 1000000L * 1000000L; // long 타입 사용시 int 값의 범위를 벗어나면 l or L 붙여줘야함 (그냥 다 붙여주는 게 나음...)
		System.out.println(result);
	}
	
}
