package algorithm.datatypes;

import java.util.Scanner;

public class Q002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TL-DOLAR-EURO KUR HESAPLAYICI
		// TL değerini kullanıcıdan al.
		// Bu değerin bugünkü dolar ve euro kuru üzerinden
		// ne kadar oldugunu bulunuz.

		double tl, dolar, euro;

		Scanner input = new Scanner(System.in);
		System.out.println("TL giriniz: ");

		tl = input.nextDouble();

		dolar = tl / 18.98f;
		euro = tl / 20.37;

		System.out.println("TL= " + tl);
		System.out.println("Dolar= " + dolar);
		System.out.println("Euro= " + euro);

		input.close();
	}

}
