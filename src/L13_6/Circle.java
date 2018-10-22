package L13_6;

public class Circle extends Shape{
	private Point center;
	private int radius;

	 public Circle() {

		 Point point = new Point();
		 center = point;
		 radius = 0;
	}

	 public Circle(int x, int y, int r) {
		 Point point = new Point(x, y);
		 center = point;
		 radius = r;
	 }
	 @Override
	 public void draw() {
		 System.out.printf("[円を描写]中心点(%d, %d)から半径%d\n", center.getX(), center.getY(), radius);
	 }

	 @Override
	 public double perimeter() {
		 double perimeter = radius * 2 * Math.PI;
		 return perimeter;
	 }
	public String returnName() {
		return "円";
	}

	public String returnInstitution() {
		return "コンマ区切りで中心点のx座標, 中心点のy座標, 半径を入力してください";
	}

}