package L13_5;

public class Flute extends Item {
	static String inst = "フルート";
	protected String message;

	public Flute(String sirialNo, int price, Model model, String message) {
		super(sirialNo, price, model);
		this.message = message;
	}

	public String description() {
		return message;
	}

	public String toString() {
		return inst + "\n" + "シリアルNo：" + super.sirialNo + "価格：" + super.price + "\n" + super.model;
	}
}
