package array;

public class Q006 {

	public static void main(String[] args) {

		/*
		 * ÇARPIM TABLOSU Çift boyutlu bir array 10 10 1x1=1 1x2=2 . . . 2x1=2 2x2=4 . .
		 * .
		 * 
		 */

		String[][] carpim = new String[10][10];

		for (int i = 0; i < carpim.length; i++) {

			for (int j = 0; j < carpim[i].length; j++) {
				carpim[i][j] = (i + 1) + "x" + (j + 1) + "=" + ((i + 1) * (j + 1));
			}
		}

	}

}
