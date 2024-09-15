package tv;

public class TVMain {
	public static void main(String[] args) {
		// 자식 객체 생성
		IPTelevision iptv = new IPTelevision("LG");
		
		System.out.println("모델 : " + iptv.model);
		
		iptv.powerOn();
		iptv.changeChannel(10);
		
		iptv.settopBoxOn();
		iptv.changeContents("영화");
		
		iptv.changeSound(20);
		iptv.settopBoxOff(); iptv.powerOff();
	}
}
