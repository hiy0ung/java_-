package exam;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 5행 5열 크기의 2차원 배열 array를 선언하고
		 * 21 ~ 45까지 초기화 하여 다음과 같이 출력하세요
		 * 
		 * 21 22 23 24 25
		 * 26 27 28 29 30
		 * 31 32 33 34 35
		 * 36 37 38 39 40
		 * 41 42 43 44 45
		 */
		int arr[][] = new int[5][5];
		int num = 21;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
	}
}
