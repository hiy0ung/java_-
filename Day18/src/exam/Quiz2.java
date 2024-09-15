package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Quiz2 {
	public static void main(String[] args) {
		/*
		 * 랜덤 함수를 이용해 10개의 수를 추출하여 (1 ~ 30까지 랜덤 숫자 지정)
		 * list에 저장한 후 저장된 값들 중 최대값과 최소값을 구하는 코드를 작성하세요 !!
		 */
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		for(int i = 0; i < 10; i++) {
			int num = (int)(Math.random() * 30) + 1;
			list.add(num);
		}
		System.out.println(list);

		int max = Collections.max(list);
		int min = Collections.min(list);
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}
