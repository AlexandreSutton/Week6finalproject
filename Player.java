package week6finalproject;

import java.util.ArrayList;

public class Player {
	
	private ArrayList <Card> hand;
	private String name;
	private int score;
	
	public Player(String name) {
		super();
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList <Card> ();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	
	public void describe() {
		System.out.println("\n" + name + " has these cards:");
		for (Card card : hand) {
			System.out.println(card.describe());
		}
	}
	
	public Card flip() {
		Card cardDrawn = hand.get(0);
		hand.remove(0);
		System.out.println(name + " Has " + cardDrawn.describe());
		return cardDrawn;
	}
	
	public void draw(Deck deck) {
		Card cardDrawn = deck.draw();
		hand.add(cardDrawn);
	}
	
	public void incrementScore() {
		this.score++;
		
	}
}
