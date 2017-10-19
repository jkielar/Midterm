
package pkgCore;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import pkgEnum.eRank;

public class DeckTest {

	@Test
	public void TestDeck() {
		Deck d = new Deck(1);
		int[] deck = new int[52];
		ArrayList<String> suits1 = new ArrayList<>();
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack","Queen",
				"King"};
		System.out.println(ranks);
		
		for (int i = 0; i < deck.length; i++) 
			deck[i] = i;
 		
		for (int i = 0; i < deck.length; i++) {
			int index = (int) (Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}		
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + " : " + rank + " of " + suit);
		}
	
	
		assertArrayEquals(52, deck.length);
		//	TODO: Build a deck(6), make sure there are 312 cards in the deck 
	}

	private void assertArrayEquals(int i, int length) {
		// TODO Auto-generated method stub
		
	}
}
