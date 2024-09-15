package quiz;

class Song{
	public String title;
	public String artist;
	public int year;
	public String country;
	
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	
	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

public class SongMain {
	public static void main(String[] args) {
		/*
		 * 노래 한 곡을 나타내는 Song 클래스를 작성하세요
		 * Song는 다음 필드로 구성된다
		 * 
		 * 노래의 제목을 나타내는 title
		 * 가수를 나타내는 artist
		 * 노래가 발표된 연도를 나타내는 year
		 * 국적을 나타내는 country
		 * 
		 * 또한 Song 클래스에 다음 생성자와 메소드를 작성하세요
		 * 그리고 노래 정보를 출력하는 show() 메소드 작성
		 * 
		 * 출력 결과)
		 * 1987년 스웨덴국적의 ABBA가 부른 Dancing Queen
		 */
		Song s = new Song("Dancing Qeen", "ABBA", 1978, "스웨덴");
		s.show();
	}
}
