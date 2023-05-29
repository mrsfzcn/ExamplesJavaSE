package algorithms.flowgorithm;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int sayi1; int sayi2; Bu şekilde tanımlandıktan sonra Sayi1= input.nextInt();
		 * ... Yapılabilir.
		 */

		Scanner input = new Scanner(System.in);
		System.out.println("Enter Value One: ");
		int sayi1 = input.nextInt();
		System.out.println("Enter Value Two: ");
		int sayi2 = input.nextInt();
		int sum = sayi1 + sayi2;
		if (sayi1 > 50 && sayi2 > 50) {
			System.out.println("Sum of Values: " + sum);
		} else {
			System.out.println("Enter a value that lower than 50!");
		}
		input.close();
	}
}
