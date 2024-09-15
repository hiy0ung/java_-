package exam;

public class Example07 {
	public static void main(String[] args) {
		// 실수 표현
		double a = 1.1;
		System.out.printf("%f\n", a);
		System.out.printf("%f\n", 1.23);
		
		System.out.printf("%.1f", 1.1234567);
		System.out.println();
		System.out.printf("%.2f", 1.1234567);
		System.out.println();
		System.out.printf("%.3f", 1.1234567);
		
		// 문자열
		String str = "Hello Jave";
		System.out.printf("%s", str);
		System.out.println();
		
		// 문자 출력
		char c = 'A';
		System.out.printf("%c\n", c);
		
		// 출력문을 통해 자신의 이름, 나이, 성별을 출력하세요
		System.out.println("이름 : " + "선하영");
		System.out.println("나이 : " + "27");
		System.out.println("성별 : " + "여자");		
	}
}
