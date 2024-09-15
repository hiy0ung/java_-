package phone;

/*
 * extend 와 implement 둘 다 상속이라는 뜻
 * extend는 오버라이딩 할 필요없이 사용가능
 * implement는 무엇이든 오버라이딩을 해야함
 */
public class SamsungPhone implements Phone {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("따르르릉 ~~");
	}

	@Override
	public void recciveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	
}

