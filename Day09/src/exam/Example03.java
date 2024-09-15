package exam;

public class Example03 {
	public static void main(String[] args) {
		/*
		 * char 배열에서 단어만 추출하기
		 * 실행결과 ) LOVE
		 */
		char[] cards = {'1','L','O','2','V','3','E'};
		for(int i = 0; i < cards.length; i++) {
			if(cards[i] >= 65 && cards[i] <= 90) { // 아스키코드 A-Z까지가 65-90
				System.out.printf("%c", cards[i]);
			}
		}
		System.out.println("");
		System.out.println("=======================");
		int[] arr = {10,20,30,40,50,60,70,80};
		// 다음 배열에서 인덱스가 3인 곳에 접근하여 해당 인덱스에 저장된 데이터를 출력 !!
			System.out.println(arr[3]);
	}
}
