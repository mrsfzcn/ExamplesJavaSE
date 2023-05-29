package array;

public class ArrayCalisma {

	public static void main(String[] args) {

		// Bir dizideki min ve max değerleri yazdır.

//		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };

//		int min = sayilar[0];
//		int max = sayilar[0];
		
//		int max2=Integer.MAX_VALUE; 
//		int max3=Integer.MIN_VALUE;
//		
//		for (int i = 0; i < sayilar.length; i++) {
//			
//			if (sayilar[i] <min) {
//				min=sayilar[i];
//			}
//			if (sayilar[i]>max) {
//				max=sayilar[i];
//			}
//		}
//		System.out.println("max: " +max+" "+"min: " + min);
		
		//2. en büyük sayıyı bul...
		//Problem var sonra izle
		
//		for (int i = 0; i < sayilar.length; i++) {
//			if (sayilar[i]>max2) {
//				max2=sayilar[i];
//			}
//		}
//		for (int i = 0; i < sayilar.length; i++) {
//			if (sayilar[i]>max3 && sayilar[i]<max2) {
//				max3=sayilar[i];
//			}
//		}
//		System.out.println("En büyük sayi: "+max2);
//		System.out.println("2. En büyük sayi: "+max3);
		
		//Soru3: Bir dizide ard arda gelen iki indexteki sayı değeri "2" ise
		//true yazdırıp dongu sonlansın else false yazdır.
		
//		int[] sayilar = { 2,-256,2,129,2,2 };
//		boolean kontrol=false;
//		
//		for (int i = 0; i < sayilar.length; i++) {
//			if (sayilar[i]==2 && sayilar[i+1]==2) {
//				kontrol=true;
//				break;
//			}
//		}
//		System.out.println(kontrol);
		
		/*
		 * bir dizideki tüm sayıların toplamı
		 * ve her sayı için bu sayı tektir bu sayı çifttir diye bir çıktı verelim
		 * 2 sayısı çifttir
		 * 5 sayısı tektir gibi
		 */
		
		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };
		int toplam=0;
		
		for (int i = 0; i < sayilar.length; i++) {
			toplam+=sayilar[i];
			if ((sayilar[i])%2==0) {
				System.out.println("dizi["+i+"]: "+sayilar[i]+" sayısı çifttir.");
			}else {
				System.out.println("dizi["+i+"]: "+sayilar[i]+" sayısı tektir.");
			}
		}System.out.println("toplam: "+toplam);
	}
}
