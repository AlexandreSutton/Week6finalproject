package week6finalproject;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList <Card> cards;
	
	public Deck() {
		cards = new ArrayList <Card> ();
		for (int i = 0; i < 52; i++) {
			cards.add(new Card(i));
			
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	public Card draw() {
		Card cardDrawn = cards.get(0);
		cards.remove(0);
		
		return cardDrawn;
	}

}
