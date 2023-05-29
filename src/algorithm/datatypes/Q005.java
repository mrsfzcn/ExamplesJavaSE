package algorithm.datatypes;

import java.util.Scanner;

public class Q005 {

	// Bir ürünün satış fiyatının içinde %18 kdv ve %15 kar olduğu biliniyor.
	// Ürünün ham fiyatı nedir?
	// Satış fiyatını kullanıcıdan alalım
	// satisFiyati, kdvsizFiyat, hamFiyat=alışFiyatı

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Fiyat giriniz: ");
		float satisFiyati = input.nextFloat();

		float hamFiyat;
		hamFiyat = ((satisFiyati / 1.18f) / 1.15f);
		System.out.println(hamFiyat);

		input.close();
	}

}
