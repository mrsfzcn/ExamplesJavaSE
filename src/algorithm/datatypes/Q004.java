package algorithm.datatypes;

import java.util.Scanner;

public class Q004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Dogdugunuz ay: ");
		int ay = input.nextInt();
		System.out.println("Dogdugunuz gun: ");
		int gun = input.nextInt();

		switch (ay) {
		case 1:
			if (gun < 21 && gun > 0) {
				System.out.println("Oglak");
			} else if (gun >= 21 && gun <= 31) {
				System.out.println("Kova");
			} else {
				System.out.println("Balik");
			}
			break;
		case 2:
			if (gun < 19 && gun > 0) {
				System.out.println("Kova");
			} else if (gun > 19 && gun <= 31) {
				System.out.println("Balik");
			} else {
				System.out.println("Gecerli bir gun (1-30 arası) giriniz.");
			}

		default:
			break;
		}
		input.close();

	}

}
