
public class Dice {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(7);
		int i = r % 2;
		System.out.println("サイコロの目は：" +r);
		switch (i) {
		case 0:
			System.out.println("偶数");
			break;
		case 1:
			System.out.println("奇数");
			break;
		}
	}
}
