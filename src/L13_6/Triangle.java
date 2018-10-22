package L13_6;

public class Triangle extends Polygon {
	Point p1;
	Point p2;
	Point p3;
	public Triangle() {
		this(0,0,100,100,200,200);
	}
	public Triangle(int x1, int y1,
					int x2, int y2,
					int x3, int y3) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		Point p3 = new Point(x3, y3);
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		super.angle = 3;
	}
	@Override
	public void draw() {
		String message =
				String.format("[三角形を描写]点1(%d,%d)から"
						+ "点2(%d,%d)、"
						+ "点3(%d,%d)の三角形",
						p1.getX(), p1.getY(),
						p2.getX(), p2.getY(),
						p3.getX(), p3.getY());
		System.out.println(message);
	}

	@Override
	public double perimeter() {
		return getPerimeter();
	}

	public double getPerimeter() {
		double length1 = getLength(p1, p2);
		double length2 = getLength(p2, p3);
		double length3 = getLength(p3, p1);
		return length1 + length2 + length3;
	}

	public double getLength(Point pointA, Point pointB) {
		double x1 = (double) pointA.getX();
		double y1 = (double) pointA.getY();
		double x2 = (double) pointB.getX();
		double y2 = (double) pointB.getY();
		double distanceX = x2 - x1;
		double distanceY = y2 - y1;
		double p1 = Math.pow(distanceX, 2);
		double p2 = Math.pow(distanceY, 2);
		double sumP = p1 + p2;
		double result = Math.sqrt(sumP);
		return result;
	}
	public String returnName() {
		return "三角形";
	}
	public String returnInstitution() {
		return "コンマ区切りで点1のx座標, 点1のy座標,点2のx座標, 点2のy座標,点3のx座標, 点3のy座標,を入力してください";
	}
}
