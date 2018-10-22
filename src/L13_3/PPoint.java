package L13_3;

public class PPoint {
	private int x;
	private int y;

	public PPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int new_x, int new_y) {
		this.x = new_x;
		this.y = new_y;
	}

	public void clear() {
		this.x = 0; this.y = 0;
	}
	@Override
	public String toString() {
		return "x:" + this.x + "y:" + this.y;
	}
}
