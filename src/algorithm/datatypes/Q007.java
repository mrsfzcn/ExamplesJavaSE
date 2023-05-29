package algorithm.datatypes;

import java.util.Scanner;

public class Q007 {

	/*
	 * Kullanıcıdan alınan sayıya göre hangi günde olduğunu ve hafta içi mi hafta
	 * sonu mu olduğunu bulan programı yazınız
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Bir deger giriniz: ");
		int sayi = input.nextInt();

		switch (sayi) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		}

		switch (sayi) {
		case 1, 2, 3, 4, 5:
			System.out.println("Hafta ici");
			break;
		case 6, 7:
			System.out.println("Hafta sonu");
			break;
		default:
			System.out.println("Hatali bir deger girdiniz. \nLutfen 1-7 arasi bir deger giriniz.");
			break;
		}
		input.close();
	}
}
