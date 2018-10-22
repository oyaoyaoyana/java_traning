
public class CardSafeBox extends KeySafeBox {
	private int cardNo;
	public CardSafeBox(String keyNo, int cardNo){
		super(keyNo);
		this.cardNo = cardNo;
	}

	public void lock() {
		System.out.print(this.cardNo + "の暗証番号入力、");
		super.lock();
	}
}
