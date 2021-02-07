package ch07;

class CaptionTv extends Tv{
	boolean caption;	// subtitle on/off
	void displayCaption(String text) {
		if (caption) {	// when caption is on, shows text.
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	public static void main(String args[]) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;	// 조상 클래스로부터 상속받은 멤버.
		ctv.channelUp();	// ""
		System.out.println(ctv.channel);
		ctv.displayCaption("Hello, World !!"); // turn on the subtitle
		ctv.caption = true;		// turn on the subtitle
		ctv.displayCaption("Czesc, Swiat !!");
	}
}
