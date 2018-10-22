package L13_3;

public class CPoint extends PPoint {
	private String color;

	public CPoint(int x, int y) {
		super(x, y);
		this.color = "transparent";
	}

	public String getColor() {
		return this.color;
	}

	public void changeColor(String new_color) {
		this.color = new_color;
	}

	public void clear() {
		super.clear();
		this.color = "transparent";
	}

	public String toString() {
		return super.toString() + "color:" + this.color;
 	}
}
