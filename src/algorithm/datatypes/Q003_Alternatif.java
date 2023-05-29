package algorithm.datatypes;

import java.util.Scanner;

public class Q003_Alternatif {

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

		boolean durum = toplam % 2 == 0;
		// true- false durumları için if-else şartına alternatif çözüm.

		float sayininYarisi = toplam / 2;
		// float sayininYarisi = toplam/2f;

		System.out.println("Sayinin durumu: " + durum);
		System.out.println("Toplamin yarisi: " + sayininYarisi);
		input.close();

	}

}
