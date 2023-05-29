package array;

public class Q003 {

	public static void main(String[] args) {
		/*
		 * dizi içerisinde 1 ve 4 kaç defa geçtiğini ve 1 sayısının adeti
		 * 4 sayısının adedinden büyük ise true değil ise false yaz
		 */
		
		int[] sayilar= {1,4,5,6,1,1,4,4,8};
		int adet1=0;
		int adet4=0;
		boolean kontrol=false;
		
		for (int i = 0; i < sayilar.length; i++) {
			if (sayilar[i]==1) {
				adet1++;
			}else if(sayilar[i]==4) {
				adet4++;
			}
		}
		//1. Çözüm:
		if (adet1>adet4) {
			kontrol=true;
			
		}else if (adet4==adet1) {
			System.out.println("Eşit");
		}
		System.out.println("kontrol1: "+kontrol);
		
		//2.Çözüm:
		boolean kontrol2=adet1>adet4;
		System.out.println("kontrol2: "+kontrol2);
		System.out.println("1lerin adedi: "+adet1);
		System.out.println("4lerin adedi: "+adet4);
	}

}
