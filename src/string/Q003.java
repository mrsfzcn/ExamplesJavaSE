package string;

import java.util.Scanner;

public class Q003 {

	public static void main(String[] args) {

		/*
		 *   Dışarıdan bir ıban değeri girelim TR 1001005001 ,TR 1001005002 veya OTH
		 * 2002002000 gibi daha sonra bu değerleri kontrol edelim eğer Tr ile başlıyorsa
		 * yurt içi işlemler yazsın ve Eğer 5001 ile Bitiyorsa Ziraat 5002 ile bitiyorsa
		 * Garanti 5003 ile bitiyorsa İş bankası yazdırsın eğer OTH ise Yurt dışı
		 * işlemler yazdıralım 2000 ile bitiyorsa kıta içi işelmeler ve OTH yerine  Ki
		 * 200200… değilse kıta dışı işlemler yazsın ve OTH yerine Kd 200201…  
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("IBAN giriniz : ");
		String kelime = sc.nextLine().toUpperCase();

		if (kelime.startsWith("tr".toUpperCase()) == true) {
			System.out.println("Yurtiçi işlemler");
		}

		if (kelime.endsWith("5001") == true) {
			System.out.println("Ziraat Bankası");
		} else if (kelime.endsWith("5002") == true) {
			System.out.println("Garanti Bankası");
		} else if (kelime.endsWith("5003") == true) {
			System.out.println("İş Bankası");
		} else {
			System.out.println("diğer");
		}

		if (kelime.startsWith("oth".toUpperCase()) == true) {
			System.out.println("Yurtdışı işlemler");
			if (kelime.endsWith("2000") == true)
				System.out.println("Kıta içi işlemler");
			System.out.println(kelime.replace("OTH", "Ki 200200"));
		} else {
			System.out.println("Kıta dışı işlemler");
			System.out.println(kelime.replace("OTH", "Kd 200201"));
		}
		sc.close();
	}
}
