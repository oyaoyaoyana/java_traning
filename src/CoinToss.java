public class CoinToss {
	public static void main(String[] args) {
		System.out.println("何回トスしますか？");
		int i = new java.util.Scanner(System.in).nextInt();
		int omote = 0;
		int ura = 0;
		for(int j = 0; j < i; j++) {
			int r = new java.util.Random().nextInt(2);
			if (r == 0) {
				omote++;
			} else {
				ura++;
			}
		}
		System.out.println(i + "回投げました");
		System.out.println("表は" + omote);
		System.out.println("裏は" + ura);
	}
}
