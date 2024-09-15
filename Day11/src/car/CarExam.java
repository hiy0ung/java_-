package car;

public class CarExam {
	public static void main(String[] args) {
		Car car = new Car(); // 클래스를 이용해 인스턴스 생성
		System.out.println("wheel의 개수는 " + car.wheel); // 생성된 인스턴스 이름으로 접근해야함
		
		car.wheel = 5; // wheel의 값을 다른 값으로 초기화 
		System.out.println("wheel의 개수는 " + car.wheel);
		
		// car 클래스 메소드 불러오기
		car.ride();
		car.stop();
	}
}
