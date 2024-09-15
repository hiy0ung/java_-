package exam;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 다음 배열의 요소에서 최대값과 최소값을 구하세요
		 */
		int arr[] = {50,100,900,250,3,7,25,40};
		int max = 0;
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			} else if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
