package exam;

public class Example01 {
	public static void main(String[] args) {
		/*
		 * 중첩 반복문
		 * - 바깥쪽반복문
		 * - 안쪽반복문
		 * 
		 * for문을 중첩해서 사용할 수록 효율이 나빠진다
		 * 반복문이 중첩될수록 반복문을 위한 연산의 부하가 커짐!!
		 * 
		 * 형식)
		 * for(초기식; 조건식; 증감식) {
		 * 		for(초기식; 조건식; 증감식) {
		 * 		
		 * 		}
		 * }
		 */
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i * j);
			}
			System.out.println();
		}
	}
}
