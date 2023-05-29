package algorithm.datatypes;

import java.util.Scanner;

public class Q011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir karakter giriniz: ");
		char ch = sc.next().charAt(0);
		int ascii = ch;

		// int türüne dönüşürüp de gösterebilirsiniz.
		int asciiKod = (int) ch;

		sc.close();

//		if ((ascii >= 65 && ascii <= 90)) {
//			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakterdir.");
//		} else if (ascii >= 97 && ascii <= 122) {
//			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakterdir.");
//		} else {
//			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakter degildir.");
//		}
		
// Diğer Yöntem
		
		if ((ch >= 'a' && ch <= 'z')) {
			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakterdir.");
		}else if (ch >= 'A' && ch <='Z' ) {
			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakterdir.");
		}else {
			System.out.println(ch + " Harfinin Ascii Kodu: " + ascii + " Alfabetik bir karakter degildir.");
		}

	}

}
