package algorithm.datatypes;

import java.util.Scanner;

public class Q009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kullanıcıdan 2 sayı al
		// Çift ise true tek ise false yazdır
		// En son bu toplamı 2ye böldür.

		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayiyi giriniz: ");
		int a = sc.nextInt();
		System.out.println("Ikinci sayiyi giriniz: ");
		int b = sc.nextInt();
		int top = a + b;

		if ((top) % 2 == 0) {
			System.out.println("true");
		} else {
			System.out.println("false ");
		}
		System.out.println("Toplamın Yarisi: " + top / 2);

		sc.close();
	}

}
