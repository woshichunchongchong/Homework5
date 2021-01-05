package U9_one_star;

import java.util.GregorianCalendar;

public class S9_5 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.print(gc.get(gc.YEAR) + " ");
		System.out.print(gc.get(gc.MONTH) + 1 + " ");
		System.out.println(gc.get(gc.DAY_OF_MONTH));
		gc.setTimeInMillis(1234567898765L);
		System.out.print(gc.get(gc.YEAR) + " ");
		System.out.print(gc.get(gc.MONTH) + 1 + " ");
		System.out.println(gc.get(gc.DAY_OF_MONTH));
	}
}