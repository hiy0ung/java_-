package book;

public class BookMain {
	public static void main(String[] args) {
		/*
		 * ComicBook 클래스에서 구현하지 않은 멤버와 메소드들이지만
		 * Book에 있는 요소들을 사용할 수 있다
		 * * Book 클래스를 상속받았기 때문에
		 */
		ComicBook comicbook = new ComicBook();
		comicbook.title = "포켓몬";
		comicbook.price = 4500;
		comicbook.info();
	}
}
