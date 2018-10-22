package trump;

public class Card {

	private String suit;
	private int number;
	boolean visible;

	public Card(String suit, int number) {
		this(suit, number, false);
	}
	public Card(String suit, int number, boolean visible) {
		this.suit = suit;
		this.number = number;
		this.visible = visible;
	}

	public void reverse() {
		this.visible = !this.visible;
	}
	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public String toString() {
		String message =
				String.format("%s/%d/%b", this.suit, this.number, this.visible);
		return message;
	}

}
