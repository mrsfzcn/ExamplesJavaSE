package algorithm.datatypes;

import java.util.Scanner;

public class Q012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char ch = sc.next().charAt(0);
		int ascii = ch;

		switch (ascii) {

		case 65, 69, 73, 79, 85, 97, 101, 105, 111, 117:
			System.out.println(ch + "Sesli harftir.");
			break;
		default:
			System.out.println("Sessiz harftir.");
			break;

		}
		sc.close();
	}

}
