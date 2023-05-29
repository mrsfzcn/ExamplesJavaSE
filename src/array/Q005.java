package array;

public class Q005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1-Stringi bir arraya çevir. array[0]="01-Adana"... 2-Array dönerken her şehir
		 * için bir çıktı vereceğiz Adananın plaka kodu: 01...
		 */
		String sehirler = "01-Adana;02-Adıyaman;03-Afyonkarahisar;04-Ağrı;05-Amasya;06-Ankara;"
				+ "07-Antalya;08-Artvin;09-Aydın;10-Balıkesir;42-Konya";

		String[] dizi = sehirler.split(";"); // ";" noktalı virgül gördüğü yerden aşağıya atar.

		for (int i = 0; i < dizi.length; i++) {
			int index = dizi[i].indexOf("-");
			System.out.println(dizi[i].substring(index + 1) + " plaka kodu: " + dizi[i].substring(0, index));

		}

	}

}
