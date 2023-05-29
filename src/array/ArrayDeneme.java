package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeneme {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		String[] dizi = new String[3]; // Default değerler null
//		// Default değerler null
//		dizi[0] = "java";
////		dizi[3]="xxx";
//
//		String dizi2[] = new String[4];
//
//		String[] dizi3 = { "Java", "Spring", "React" };
//
//		boolean[] dizi4 = new boolean[10];
//		// Default değer: false
//		int[] dizi5 = new int[6];
//
//		Integer[] dizi6 = new Integer[6];

		String[] array = new String[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println(i + 1 + ". soruyu yazınız: ");
			String soruIcerik = sc.nextLine();
			array[i] = soruIcerik;
		}
		System.out.println(Arrays.toString(array));
		sc.close();
	}

}
