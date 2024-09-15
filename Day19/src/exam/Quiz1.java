package exam;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		/*
		 * 영문을 입력받아 엔터를 입력하면 영문을 소문자는 대문자로 대문자는 소문자로 변경하여 출력하는
		 * 프로그램을 작성하세요
		 * 단) 사용자가 END, end 라는 문자열을 입력받으면 프로그램 종료
		 * 
		 * 입력 >>
		 * dfesDED
		 * 대소문자변환 : EFESded
		 * 입력 >>
		 * dfdvcrEFDF
		 * 대소문자변환 : DFDVCRefdf
		 * 입력 >>
		 * dfds efrEED
		 * 대소문자변환 : DFDS EFReed
		 * 입력 >>
		 * end
		 * 프로그램 종료 !!
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("입력 >> ");
			String word = sc.nextLine();
			String answer = ""; // 루프 돌면서 바뀌는 값을 집어넣을 용도
			
			if(word.equals("END") || word.equals("end")) {
				System.out.println("프로그램 종료 !!");
				break;
			}
			
//			for(int i = 0; i < word.length(); i++) {
//				char c = word.charAt(i);
//				if(Character.isUpperCase(c)) {
//					answer += Character.toLowerCase(c);
//				} else {
//					answer += Character.toUpperCase(c);
//				}
//			}
			
			for(char a : word.toCharArray()) { // 향상된 for문
				if(Character.isLowerCase(a)) {
					answer = answer + Character.toUpperCase(a);
				} else {
					answer = answer + Character.toLowerCase(a);
				}
			}
			System.out.println("대소문자변환 : " + answer);
			System.out.println();
		}
	}
}
