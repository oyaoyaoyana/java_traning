package L13_6;

public class Point {
	private int x;
	private int y;
	/**
	 * コンストラクタの定義.
	 * <p>
	 * 引数なしのコンストラクタの定義
	 * x座標、y座標ともに0で初期化する。
	 * </p>
	 * @param 無し
	 */
	public Point(){
		this.x = 0;
		this.y = 0;
	};
	/**
	 * int型の引数が2つある場合のコンストラクタの定義.
	 * <p>
	 * x座標、y座標を受け取りその値で初期化するコンストラクタの定義
	 * 第1引数で渡された値をxフィールドに代入する
	 * 第2引数で渡された値をyフィールドに代入する
	 * </p>
	 * @param x int
	 * @param y int
	 */
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String returnName() {
		return "点";
	}
}
