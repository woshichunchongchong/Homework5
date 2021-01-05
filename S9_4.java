package U9_one_star;

import java.util.Random;

public class S9_4 {
	public static void main(String[] args) {
		Random rd = new Random(1000);
		for (int i = 0; i < 50; ++i) {
			System.out.print(rd.nextInt(100) + " ");
		}
		System.out.println();
	}
}
