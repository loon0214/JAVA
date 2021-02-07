package ch07;

class Deck {
	final int CARD_NUM = 52;	// 카드의 갯수
	Card cardArr[] = new Card[CARD_NUM];	// Card 객체 배열을 포함.
	
	Deck() {	// Deck의 카드를 초기화 한다.
		int i = 0;
		
		for(int k = Card.KIND_MAX; k > 0; k--)
			for(int n =0; n < Card.NUM_MAX; n++)
				cardArr[i++] = new Card(k, n+1);
		}
	
	Card pick(int index) { // 지정된 위치 (index)에 있는 카드 하나를 꺼내서 반환
		return cardArr[index];
	}
	
	Card pick() {	// Deck에서 카드 하느를 선택한다.
		int index = (int)(Math.random()*CARD_NUM);
		return pick(index);
	}
	
	void shuffle() {
		for(int i=0; i< cardArr.length; i++) {
			int r = (int)(Math.random()* CARD_NUM);
			
			Card tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
}