package L_15;

public class L_15_2 {
	public static void main(String[] args) {
		int[] dt = {1,2,3,4,5};
		try {
			for(int i = 0; i < dt.length+1; i++) {
				System.out.println(dt[i]);
			}
		} catch( ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		}
	}
}
