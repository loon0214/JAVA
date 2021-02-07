package ch07;

class DeckTest {

	public static void main(String[] args) {
		Deck d = new Deck();	// card 한 벌(Deck)을 만든다.
		Card c = d.pick(0);		// 섞기 전에 제일 위의 카드를 뽑는다.
		System.out.println(c);  // System.out.println(c.toString()); 과 같다.
		
		d.shuffle();	// shuffle the card.
		c = d.pick(0);	// 섞은 후에 제일 위의 카드를 뽑느다.
		System.out.println(c);
	}
}