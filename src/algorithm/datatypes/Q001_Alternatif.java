package algorithm.datatypes;

import java.util.Scanner;

public class Q001_Alternatif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float kdv = 0.18f;
		float kar = 0.15f;

		Scanner input = new Scanner(System.in);
		System.out.println("Satis fiyatini giriniz: ");

		float satisFiyati = input.nextFloat();

		float hamFiyat;
		hamFiyat = (satisFiyati * (0.82f)) * (0.85f);
		System.out.println("Satis Fiyati= " + satisFiyati);
		System.out.println("Ham Fiyat= " + hamFiyat);

		input.close();
	}

}
