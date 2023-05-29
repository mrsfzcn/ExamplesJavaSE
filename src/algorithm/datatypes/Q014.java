package algorithm.datatypes;

import java.util.Scanner;

public class Q014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Bir dikdörtgenin boyutlarına göre çizdiren program.
//		*****
//		*   *
//		*****

		Scanner sc = new Scanner(System.in);
		System.out.println("yukseklik giriniz.");
		int yukseklik = sc.nextInt();
		System.out.println("genislik giriniz.");
		int genislik = sc.nextInt();

		char karakter = '*';

// BOSLUKSUZ KARE
//		for (int i = 0; i < yukseklik; i++) {
//			
//			for (int j = 0; j < genislik; j++) {
//				
//				if(i==0 || i== yukseklik-1) {
//					System.out.print(karakter);
//				}
//				else {
//					if(j==0 || j==genislik-1) {
//						System.out.print(karakter);
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				
//			}
//			System.out.println();
//
//		}

// BOSLUKLU NORMAL KARE
//		for (int i = 0; i < yukseklik; i++) {
//
//			for (int j = 0; j < genislik; j++) {
//
//				if (i == 0 || i == yukseklik - 1) {
//					System.out.print("* ");
//				} else {
//					if (j == 0 || j == genislik - 1) {
//						System.out.print("* ");
//					} else {
//						System.out.print("  ");
//					}
//				}
//
//			}
//			System.out.println(" ");
//
//		}

//		3 FORLU ÇÖZÜM
//		KARENİN TAVANI

		for (int i = 0; i < genislik; i++) {
			System.out.print("*");
		}
		System.out.println();

//		KARENİN ORTA KISMI

		for (int i = 0; i < yukseklik - 2; i++) {
			System.out.print("*");
			for (int j = 0; j < genislik - 2; j++) {
				System.out.print(" ");

			}
			System.out.println("*");
		}

//		KARENİN TABANI
		for (int i = 0; i < genislik; i++) {
			System.out.print("*");
		}

		sc.close();

	}

}
