package algorithm.datatypes;

import java.util.Scanner;

public class Q008 {

	/*
	 * Kullanıcıdan dogdugu ay ve dogdugu gün alınacak Koc burcu: 21 mart - 20 nisan
	 * boga burcu: 21 nisan - 21 mayıs ikizler burcu 22 mayıs - 22 haziran yengec
	 * burcu 23 haziran - 22 temmuz aslan burcu 23 temmuz - 22 agustos başak burcu
	 * 23 agustos - 22 eylül terazi burcu 23 eylül - 22 ekim akrep burcu 23 ekim -
	 * 22 kasım yay burcu 23 kasım - 21 aralık Oglak burcu: 22 aralık - 21 ocak Kova
	 * burcu : 22 ocak - 19 şubat Balık burcu: 20 şubat - 20 mart
	 * 
	 * kaçıncı ayda doğdunuz 4. hangi günde doğdunuz ayın 20sinde
	 * 
	 * switch case kullanalım default lütfen 1-12 arasında girin
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Hangi kacinci ayda dogdunuzu girin.");
		int ayNo = sc.nextInt();
		System.out.println("Hangi gunde dogdunuzu girin.");
		int gunNo = sc.nextInt();

		if (gunNo <= 0 || gunNo >= 32)
			System.out.println("Lutfen gecerli bir gun girin(1-30 arasi)");
		else {
			switch (ayNo) {
			case 1:
				if (gunNo <= 20 && gunNo > 0) {
					System.out.println("Oglak");
				} else if (gunNo >= 21 && gunNo <= 31)
					System.out.println("Kova");
				break;
			case 2:
				if (gunNo <= 19 && gunNo > 0) {
					System.out.println("Kova");
				} else if (gunNo >= 20 && gunNo <= 31)
					System.out.println("Balik");
				break;
			case 3:
				if (gunNo <= 20 && gunNo > 0)
					System.out.println("Balik");
				else if (gunNo >= 21 && gunNo <= 31)
					System.out.println("Koc");
				break;
			case 4:
				if (gunNo <= 20 && gunNo > 0)
					System.out.println("Koc");
				else if (gunNo >= 21 && gunNo <= 31)
					System.out.println("Boga");
				break;
			case 5:
				if (gunNo <= 21 && gunNo > 0)
					System.out.println("Boga");
				else if (gunNo >= 22 && gunNo <= 31)
					System.out.println("Ikizler");
				break;
			case 6:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Ikizler");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Yengec");
				break;
			case 7:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Yengec");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Aslan");
				break;
			case 8:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Aslan");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Basak");
				break;
			case 9:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Basak");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Terazi");
				break;
			case 10:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Terazi");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Akrep");
				break;
			case 11:
				if (gunNo <= 22 && gunNo > 0)
					System.out.println("Akrep");
				else if (gunNo >= 23 && gunNo <= 31)
					System.out.println("Yay");
				break;
			case 12:
				if (gunNo <= 21 && gunNo > 0)
					System.out.println("Yay");
				else if (gunNo >= 22 && gunNo <= 31)
					System.out.println("Oglak");
				break;
			default:

				System.out.println("Lutfen 1-12 arasi deger girin");
			}
			sc.close();

		}
	}

}