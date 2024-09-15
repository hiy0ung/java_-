package exam;

public class Example05 {
	public static void main(String[] args) {
		/*
		 * 배열을 생성하기 위해서는 new와 함께 자료형과 길이를 지정한다
		 * 
		 * 형식)
		 * int[] arr = new int[크기]
		 */
		int arr1[] = new int[4];
		int arr2[] = {1,2,3,4,5};
		// System.out.println(arr1);
		// System.out.println(arr2);
		
		// 배열과 반복문은 바늘과 실같은 관계 (값 출력시 꼭 필요?)
		for(int i = 0; i < arr2.length; i++) {
			System.out.printf("%d ", arr2[i]);
		}
		System.out.println();
		System.out.println("arr2의 배열길이 : " + arr2.length);
	}
}
