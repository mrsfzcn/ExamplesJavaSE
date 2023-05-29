package algorithm.datatypes;

import java.util.Scanner;

public class Q013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input= new Scanner (System.in);
		System.out.println("Bir sayı giriniz.");
		int sayi= input.nextInt();
		
//WHILE ÇÖZÜM		
		int top=0;
		int i=1;
		
		while (i<=sayi) {
			top=top+i;
			i+=2;
		}
		System.out.println(top);
		input.close();
	}
}

//FOR ÇÖZÜM
//		int top = 0;
//
//		for (int i = 1; i <= sayi; i += 2) {
//			top += i;
//		} 
//		System.out.println(top);