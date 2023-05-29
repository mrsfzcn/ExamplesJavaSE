package string;

import java.util.Scanner;

public class Q001 {

	public static void main(String[] args) {

		// Dışardan bir kelime al ve sonra her harfi
		// başına index numarası gelecek şekilde alt alta yazdır.

		Scanner sc = new Scanner(System.in);
		System.out.println("Kelime giriniz : ");
		String kelime = sc.nextLine();

		for (int i = 0; i < kelime.length(); i++) {
			System.out.println(i + "-" + kelime.charAt(i));
		}
		sc.close();
	}
}
