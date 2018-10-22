package L13_5;

public abstract class Item {
	protected String sirialNo;
	protected int price;
	protected Model model;

	public Item(String sirialNo, int price, Model model) {
	    this.sirialNo = sirialNo;
	    this.price = price;
	    this.model = model;
	}

	public abstract String description();
}
