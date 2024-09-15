package exam;

public class Example01 {
	public static void main(String[] args) {
		// 복합대입연산자 +=, -=, *=, /=, %=
		int x = 10;
		int y = 1;
		
		y += x; // y = y + x
		System.out.println("y : " + y);
		
		y *= x; // y = y * x
		System.out.println("y : " + y); // 9줄에서 y값이 11로 초기화 되었으모로 110이됨
		
		y %= x; // y = y % x
		System.out.println("y : " + y);
		
		// 가독성이 떨어져서 보통 다 풀어서 씀
	}
}
