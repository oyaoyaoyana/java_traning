
public class SafeBoxAP {

	public static void main(String[] args) {
		Box[] sBox = new SafeBox[3];
		sBox[0] = new SafeBox();
		sBox[1] = new KeySafeBox("002");
		sBox[2] = new CardSafeBox("2-09-3", 34444);
		for(Box box : sBox) {
			box.lock();
		}
	}

}
