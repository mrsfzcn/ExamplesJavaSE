package string;

public class Q002 {

	public static void main(String[] args) {

		// Hayat, Kısa, Kuşlar, Uçuyor
		// Bu string değeri virgüllerden ayırıp her kelimeyi alt alta yazdıralım
//		Hayat
//		Kısa
//		Kuslar
//		Uçuyor

		String kelime = "Hayat,Kısa,Kuşlar,Uçuyor";

		int index = 0;

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == ',') {
				System.out.println(kelime.substring(index, i));
				index = i + 1;
			}
		}
		System.out.println(kelime.substring(index));
		//////////////////////////////////////////////////////////
		System.out.println("****2. Yöntem****");

		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i) == ',') {
				System.out.println();
			} else {
				System.out.print(kelime.charAt(i));
			}
		}
		System.out.println();
		// replace yöntemi ile virgül karakterini görüğünde \n(boşluk) ile yer
		// değiştirir.
		System.out.println("****3. Yöntem****");

		System.out.println(kelime.replace(",", "\n"));

	}
}
