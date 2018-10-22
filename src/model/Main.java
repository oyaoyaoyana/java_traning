package model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = Integer.MAX_VALUE;
		int d = Integer.MIN_VALUE;
		long e = 0;
		for(int i = 0; i < a; i++) {
			int f = sc.nextInt();
			c = Math.min(c, f);
			d = Math.max(d, f);
			e += f;
		}
		System.out.println(String.format("%d %d %d", c, d, e));
	}
}