package L13_6;
/**
 * Line class.
 * 2つの座標データを指定することで、線を描写するクラス
 *
 * @author oya
 * @see Figure
 */
public class Line implements Figure {
	private Point p1;
	private Point p2;
	/**
	 * 引数を受け取らないコンストラクタ.
	 * 全て0で初期化する
	 */
	public Line() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(0, 0);
		this.p1 = p1;
		this.p2 = p2;
	}
	/**
	 * 引数を2つ受け取るコンストラクタ.
	 *
	 * @param x1 int p1のx座標
	 * @param y1 int p1のy座標
	 * @param x2 int p2のx座標
	 * @param y2 int p2のy座標
	 */
	public Line(int x1, int y1, int x2, int y2) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
		this.p1 = p1;
		this.p2 = p2;
	}
	/**
	 *
	 */
	public void draw() {
		System.out.printf("[線を描写]始点(%s,%s)から終点(%s,%s)まで", p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}

	/**
	 * p1とp2の距離を計算するメソッド
	 * @return double p1,p2間の距離
	 */
	public double perimeter() {
		double x1 = (double) p1.getX();
		double y1 = (double) p1.getY();
		double x2 = (double) p2.getX();
		double y2 = (double) p2.getY();
		double distanceX = x2 - x1;
		double distanceY = y2 - y1;
		double p1 = Math.pow(distanceX, 2);
		double p2 = Math.pow(distanceY, 2);
		double sumP = p1 + p2;
		double result = Math.sqrt(sumP);
		return result;
	}
	public String returnName() {
		return "線";
	}
	public String returnInstitution() {
		return "コンマ区切りで始点のx座標, 始点のy座標,  終点のx座標, 終点のy座標,を入力してください";
	}
}
