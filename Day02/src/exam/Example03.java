package exam;

public class Example03 {
	public static void main(String[] args) {
		int myAge = 20; // myAge 변수에 20을 넣음
		int yourAge = myAge; // yourAge에 myAge에 저장되어 있는 값을 넣음
		System.out.println(myAge);
		System.out.println(yourAge);
		
		System.out.println("====================");
		
		int x = 10;
		int y = 20;
		System.out.println(x);
		System.out.println(y);
		
		int temp = 0; // x의 값을 저장할 임시 변수 선언
		temp = x; // temp에 x의 값을 넣는다
		x = y; // y에 x의 값을 넣는다
		y = temp; // y에 temp의 값을 넣는다
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
