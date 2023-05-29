package algorithm.datatypes;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanıcıdan 2 sayı al.
		// Bu iki sayının toplamı çift ise true yazsın tek ise false yazsın
		// En son toplamın yarısını ekrana yazdır.

		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		int a = input.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		int b = input.nextInt();

		float toplam = a + b; // devamı 34. satır
		// Eğer toplam int ise sonucun float çıkması için 2'nin
		// sonuna 'f' eklenmelidir.
		// (int toplam = a+b) --> int sayininYarisi=toplam/2f

		if (toplam % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		System.out.println(toplam);

		float sayininYarisi = toplam / 2;
		System.out.println("Toplamin yarisi: " + sayininYarisi);

		input.close();

	}

}
