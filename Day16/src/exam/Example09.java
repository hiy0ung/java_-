package exam;

class MyThread extends Thread {
	@Override
	public void run() { // 스레드 동작을 위해 run() 메소드 구현
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + (i + 1);
		}
		System.out.println("sum = " + sum);
		String threadName = Thread.currentThread().getName();
		System.out.println("현재 스레드 이름 : " + threadName);
	}
}

public class Example09 {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();
	}
}
