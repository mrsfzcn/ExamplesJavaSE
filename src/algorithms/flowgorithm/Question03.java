package algorithms.flowgorithm;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int sayi = input.nextInt();

		if (sayi != 0) {
			System.out.println("Isik acik");
		} else {
			System.out.println("Isik Kapali");
		}
		input.close();
	}

}
