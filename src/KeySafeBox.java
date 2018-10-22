
public class KeySafeBox extends SafeBox {
	private String keyNo;

	public KeySafeBox(String keyNo) {
		super();
		this.keyNo = keyNo;
	}
	@Override
	public void lock() {
		System.out.print(keyNo + "の番号のカギを使用");
		super.lock();
	}
}
