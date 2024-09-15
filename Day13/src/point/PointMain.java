package point;

public class PointMain {
	public static void main(String[] args) {
		Point p = new Point();
		p.setX(10);
		p.setY(20);
		p.showPoint();
//		p.showColorPoint(); -> 자식클래스에 부모클래스가 접근 하려고 해서 오류
		
		ColorPoint cp = new ColorPoint();
		cp.setX(30);
		cp.setY(40);
		cp.setColor("검은색");
		cp.showColorPoint();
	}
}
