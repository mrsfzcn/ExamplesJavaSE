package array;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		// Dışardan bir ülke ismi çekip bu dizide olup olmadıgını kontrol edelim.
		// yoksa girdiğiniz ülke bulunamadı bastır
		// varsa girdiğiniz ülke bulundu bastır.

		String[] dizi = { "Türkiye", "Japonya", "Moğolistan", "Fransa", "Danimarka", "Norveç" };

		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir ülke giriniz :");
		String ulke = scanner.next();
		String temp = "";

		for (int i = 0; i < dizi.length; i++) {
			temp = dizi[i];

			if (dizi[i].equalsIgnoreCase(ulke)) {
				System.out.println("Ülke bulundu");
				break;
			} else {
				if (i == dizi.length - 1) {
					System.out.println("Ülke bulunamadı!!!");
				}
			}
		}
		scanner.close();
	}
}
