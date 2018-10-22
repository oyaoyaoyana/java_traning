
public class Janken {
//	じゃんけん勝負ができるプログラムを作成してください。
//	キーボードから0(グー) or 1(チョキ) or 2(パー)の数値を入力することで手を選択し、
//	ユーザと相手(コンピュータ)が選んだ手、じゃんけんの勝敗を表示してください。
	public static void main(String[] args) {
		int i = new java.util.Random().nextInt(3);
		System.out.println("じゃんけんゲーム");
		System.out.println("何を出しますか？0(グー) or 1(チョキ) or 2(パー)");
		int j = new java.util.Scanner(System.in).nextInt();

		if (i == j) {
			//	あいこ
			System.out.println("コンピューターは、" +i);
			System.out.println("私は、" + j);
			System.out.println("あいこです");
		} else if (
			// コンピュータの勝ち
				(i == 0 && j == 1) ||
				(i == 1 && j == 2) ||
				(i == 2 && j == 0)
				) {
			System.out.println("コンピューターは、" +i);
			System.out.println("私は、" + j);
			System.out.println("負けです");
		} else {
			// あなたの勝ち
			System.out.println("コンピューターは、" +i);
			System.out.println("私は、" + j);
			System.out.println("勝ちです");
		}
	}
}
