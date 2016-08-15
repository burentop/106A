/**
 * File: Card.java
 * ---------------
 * This class defines a playing card.
 * @author perramount
 *
 */

import acm.program.*;

public class Card {
	
	/* Constructor */
	public Card(String suit, int rank) {
		this.suit = suit;
		this.rank = rank;
	}
	
	/* Getters */
	public String getSuit() {
		return this.suit;
	}
	
	public int getRank() {
		return this.rank;
	}
	
	/* toString() */
	public String toString() {
		String rank_string = "";
		switch(this.rank) {
		case 1:
			rank_string = "Ace";
			break;
		case 11:
			rank_string = "Jack";
			break;
		case 12:
			rank_string = "Queen";
			break;
		case 13:
			rank_string = "King;";
			break;
		default:
			rank_string = "" + this.rank;
			break;
		}
		return rank_string + " of " + this.suit;
	}
	
	
	/* Private instance variables */
	private String suit;
	private int rank;
	
	/* Named constants */
	private static final String CLUBS = "Clubs";
	private static final String DIAMONDS = "Diamonds";
	private static final String HEARTS = "Hearts";
	private static final String SPADES = "Spades";
	private static final int ACE = 1;
	private static final int JACK = 11;
	private static final int QUEEN = 12;
	private static final int KING = 13;
}
