import java.lang.reflect.Array;

public class MethodPractice {
	public static void main(String[] args) {
		int[] arrays1 = {96, 45, 31, 29, 84, 77};
		display(arrays1, false);
	}

//	第１引数で与えられた配列の各値で、第２引数で指定された順番にソートする
	private void arraysSort(int[] array, boolean orderType) {
		Array.Sort(array, index);
	}

//	第１引数で与えられた配列の各値を表示する。
//	なお、この表示が並べ替え前か後かを配列データ表示前にメッセージとして表示する。
//	メッセージ文は第２引数の値により決定する。
	private static void display(int[] array, boolean isSorted) {
		if(isSorted == true) {
			System.out.println("****並び替え後****");
		} else {
			System.out.println("****並び替え前****");
		}
		for(int i = 0; i < array.length; i++) {
			if(i == array.length - 1) {
				System.out.print(array[i]);
			} else {
				System.out.print(array[i] + ",");
			}
		}
	}
//	第１引数で与えられた配列のi番目とj番目を入れ替える。
	private void change(int[] array, int i, int j) {

	}
}
