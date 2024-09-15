package exam;

public class Example04 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		// 1 ~ 100까지의 합을 구하고 싶어요!!
		while(i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("1 ~ 100까지의 합 : " + sum);
		
		// 1 ~ 100까지의 수 중 짝수들의 합계를 구하세요 !! (while)
		int j = 1;
		int sum1 = 0;
		while(j <= 100) {
			if(j % 2 == 0) {
				sum1 = sum1 + j;
			}
			j++;
		}
		System.out.println("1 ~ 100까지 짝수의 합 : " + sum1);
	}
}
