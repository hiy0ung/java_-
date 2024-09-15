package exam;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1~100 숫자(정수 범위) 중 하나를 랜덤으로 정합니다. (이를 알려주지 않습니다.)
		 * 사용자는 이 숫자를 맞추어야 합니다. 입력한 숫자보다 정답이 크면 → "UP" 출력, 
		 * 입력한 숫자보다 정답이 작으면 → "DOWN" 출력. 정답을 맞추면 → "정답"을 출력하고, 
		 * 지금까지 숫자를 입력한 횟수를 알려줍니다.
		 * 
		 * 실행예시) 
		 * 컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.
		 * 1~100 숫자 입력:50 DOWN
		 * 1~100 숫자 입력:25 UP
		 * 1~100 숫자 입력:38 DOWN
		 * 1~100 숫자 입력:32 UP
		 * 1~100 숫자 입력:35 UP
		 * 1~100 숫자 입력:37 DOWN
		 * 1~100 숫자 입력:36
		 * 정답입니다! 7회 만에 맞췄어요.
		 */
		Scanner sc = new Scanner(System.in);
		int computer = (int)(Math.random() * 100) + 1;
		int count = 0;
		System.out.println("컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.");
//		System.out.println(computer);
		while(true) {
		System.out.println("1~100 숫자 입력 : ");
		int user = sc.nextInt();
		count++;
		if (user > computer) {
			System.out.println("DOWM");
		} else if(user < computer) {
			System.out.println("UP");
		} else if(user == computer) {
			System.out.println("정답입니다! " + count + "회 만에 맞췄어요");
			break;
			}
		}
	}
}
