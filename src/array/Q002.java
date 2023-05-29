package array;

import java.util.Arrays;

public class Q002 {

	public static void main(String[] args) {

		/*
		 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3 katı
		 * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int start=2; int
		 * end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge]
		 */

		// int[] dizi = new int[22];
		int start = 2;
		int end = 22;
		String[] dizi = new String[end - start + 1];

		for (int i = 0; i < dizi.length; i++) {
			int sayi = i + start;

			if (i % 15 == 0) {
				dizi[i] = "bilgeadam";

			} else if (i % 3 == 0) {
				dizi[i] = "bilge";

			} else if (i % 5 == 0) {
				dizi[i] = "adam";

			} else {
				dizi[i] = sayi + ""; // Integer.toString(sayi);
			}
		}
		System.out.print("[");
		for (String string : dizi) {
			System.out.print(string + ",");
		}
		System.out.print("]");

		System.out.println();
		System.out.println(Arrays.toString(dizi));

	}

}
