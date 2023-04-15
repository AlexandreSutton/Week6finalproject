package week6finalproject;

public class Card {
	
	private int value;
	private int name;
	
	// Making the cards for the game
	
	public Card (int value, int name) {
		super();
		this.name = name;
		this.value = value;
	}
	
	public Card (int num) {
		this.name = num / 13;
		this.value = num % 13;
	}
	// This portion is the getters and setters for the names and values
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	// The arrays that will hold the values and names of the cards
	
	public String describe() {
		String[] suits = {"Spades", "Clubs", "Diamonds", "Hearsts"};
		String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		return values[value] + " of " + suits[name];
		}
	}


