package L13_6;

public class Square extends Rectangle {
	public Square() {
		this(0, 0, 100);
	}
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	public void draw() {
		String message =
				String.format("[正方形を描写]点(%d,%d)を"
						+ "基準として幅・高さ%dの正方形",
						this.p.getX(),
						this.p.getY(),
						this.width);
		System.out.println(message);
	}
	public String returnName() {
		return "正方形";
	}
	public String returnInstitution() {
		return "コンマ区切りで基準点のx座標, 基準点のy座標, 一辺の長さを入力してください";
	}
}
