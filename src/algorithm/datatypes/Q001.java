package algorithm.datatypes;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Bir ürünün satış fiyatının içinde %18 ve %15 kar oldugu biliniyor.
		// Ürünün ham fiyatı nedir?
		// Satış fiyatını kullanıcıdan alalım
		// satisFiyati, kdvsizFiyat, hamFiyat(karsız)

		float satisFiyati;
		float kdvsizFiyat;
		float hamFiyat;

		Scanner input = new Scanner(System.in);
		System.out.println("Satis fiyatini giriniz: ");

		satisFiyati = input.nextInt();

		kdvsizFiyat = satisFiyati - (satisFiyati * 18 / 100);
		System.out.println("Kdvsiz Fiyat= " + kdvsizFiyat);

		hamFiyat = kdvsizFiyat - (kdvsizFiyat * 15 / 100);
		System.out.println("Ham Fiyat= " + hamFiyat);

		input.close();

	}
}