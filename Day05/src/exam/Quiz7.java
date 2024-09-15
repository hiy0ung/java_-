package exam;

public class Quiz7 {
	public static void main(String[] args) {
		/*
		 * 100점 만점 중 100 ~ 90점이면 "A"학점
		 * 89 ~ 80 점이면 "B"학점
		 * 79 ~ 70 점이면 "C"학점
		 * 69 ~ 60 점이면 "D"학점
		 * 60점 미만이면 "F"학점을 출력하세요
		 */
		int score = 67;
		if (score < 60) {
			System.out.println("F학점");
		} else if (score >= 90 && score <= 100) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		}
	}
}
