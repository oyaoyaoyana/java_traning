package L13_6;

public class Rectangle extends Polygon {
	Point p;
	int width;
	int height;
	public Rectangle() {
		this(0, 0, 100, 200);
	}
	public Rectangle(int x, int y, int width, int height) {
		Point p = new Point(x, y);
		this.p = p;
		this.width = width;
		this.height = height;
		super.angle = 4;
	}
	@Override
	public void draw() {
		String message =
				String.format("[長方形を描写]点(%d,%d)を基準として"
						+ "幅%d,、"
						+ "高さ%dの長方形",
						p.getX(), p.getY(),
						width, height);
		System.out.println(message);
	}

	@Override
	public double perimeter() {
		// TODO 自動生成されたメソッド・スタブ
		int intPerimeter = (width + height) * 2;
		return (double) intPerimeter;
	}
	public String returnName() {
		return "長方形";
	}
	public String returnInstitution() {
		return "コンマ区切りで基準点のx座標, 基準点のy座標, 幅, 高さを入力してください";
	}
}
