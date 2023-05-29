package algorithm.datatypes;

import java.util.Scanner;

public class Q002_Alternatif {
	// türk lirası değerini kullanıcıdan alınız
	// bu değerin bugünkü dolar ve euro kuru üzerinden
	// ne kadar dolar ve euroya karşılık geldiğini bulunuz

	public static void main(String[] args) {
		double turkLirasi, dolar, euro;
		Scanner input = new Scanner(System.in);
		System.out.println("Kur hesaplama(TL): ");
		turkLirasi = input.nextDouble();
		dolar = turkLirasi / 18.5;
		euro = turkLirasi / 20;

		System.out.println("Turk lirasi: " + turkLirasi + "\nDolar: " + dolar + "\nEuro: " + euro);
//		System.out.println("Dolar: " + dolar);
//		System.out.println("Euro: " + euro);
		input.close();
	}

}
