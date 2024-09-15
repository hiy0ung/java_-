package exam;

public class Example05 {
	public static void main(String[] args) {
		// 강제 타입 변환
		int intVar = 48149; //'박'의 유니코드 정수값
		char charVar = (char) intVar;
		System.out.println(charVar);
		
		intVar = 300; //byte타입이 가질 수 있는 수의 범위(-128 ~ 127) 초과 => 예상치 못한 값이 나옴
		byte byteVar = (byte) intVar;
		System.out.println(byteVar);
		
		double doubleVar = 3.14;
		intVar = (int) doubleVar; //소수점 이하의 손실 발생
		System.out.println(intVar);
	}
}
