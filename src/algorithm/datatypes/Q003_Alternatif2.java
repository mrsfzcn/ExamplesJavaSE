package algorithm.datatypes;

import java.util.Scanner;

public class Q003_Alternatif2 {
	// Kullanıcan 2 sayı alalım
	// Bu iki sayının toplamı çift ise true yazsın tek ise false yazsın(if-else)
	// En son toplamın yarısını ekrana yazdıralım

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		int sayi1 = scanner.nextInt();

		System.out.println("Ikinci sayiyi giriniz: ");
		int sayi2 = scanner.nextInt();

		// --> eğer toplam int ise sonucun float çıkması için 2'nin sonuna 'f'
		// eklenmelidir(28.satır)
		// int toplam = sayi1 + sayi2;
		float toplam = sayi1 + sayi2; // (devamı 30. satır)

//		if (toplam % 2!=0) {
//			System.out.println(true);
//		}else {
//			System.out.println(false);
//		}
		// true-false durumları için if-else şartına alternatif
		boolean durum = toplam % 2 == 0;

		// float sayininYarisi = toplam/2f;
		float sayininYarisi = toplam / 2;

		System.out.println("Sayinin durumu: " + durum);
		System.out.println("Toplam sayinin yarisi: " + sayininYarisi);

		// Toplamın yarısı kontrolünü doğrudan 'sout' içerisinde yapabiliriz.
		// Ancak bir değişkene atayarak daha sonra bu değeri sout' a vermek daha
		// doğrudur.
		// System.out.println(toplam % 2 == 0);
		scanner.close();
	}

}
