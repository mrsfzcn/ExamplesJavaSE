package string;

public class StringTest {

	public static void main(String[] args) {
		// ctrl+alt+down -->üst satır kopyalama

		// String oluşturduk.
		// 0123456..
		String value = "Merhaba Dünya";
		String value2 = " Merhaba Dünya ";
		// Dizinin ilk karakterini bulduk.
		System.out.println("İlk karakter: " + value.charAt(1));
		// Dizinin son karakterini bulduk.
		System.out.println("Son karakter: " + value.charAt(value.length() - 1));
		// Dizinin karakter sayısını bulduk.
		System.out.println("dizinin uzunlugu: " + value.length());
		// Seçilen karakterin yerini belirledik
		System.out.println(value.indexOf("r"));
		// Boşlukları sildik-trim
		System.out.println(value2.trim());
		// ilk buldugu index değerini +1 verirsek sonraki "a" değerini bulur.
		System.out.println(value.indexOf("a", 5));
		// Son geçtiği index değerini bulur.
		System.out.println(value.lastIndexOf("a"));
		// Belirlenen indexten itibaren yazıyı yazdırır.
		System.out.println(value.substring(7));
		// Belirlenen indexler arasında kalan yazıyı yazdırır. Başı dahil eder sonu
		// dahil etmez.
		System.out.println(value.substring(0, 5));
		// Seçilen karakteri belirlenen karakter ile değiştirir.
		System.out.println(value.replace("a", "x"));
		// Yazının son karakterini kontrol eder True/false //Bu kontrolde büyük küçük
		// harf önemlidir.
		System.out.println(value.endsWith("a"));
		// Yazının ilk karakterini kontrol eder. True/False //Bu kontrolde büyük küçük
		// harf önemlidir.
		System.out.println(value.startsWith("M"));
		// concat gibi + işareti de iki stringi birleştirme işlemi yapar.
		System.out.println(value.concat(" xxxxx"));
		// Contains stringin içinden belirlenen harfi ya da harf grubunun olup
		// olmadıgını kontrol eder.
		System.out.println(value.contains("ha"));
		// Büyük harfe çevirir.
		System.out.println(value.toUpperCase());
		// Küçük harfe çevirir.
		System.out.println(value.toLowerCase());
		// Yazılan ile Stringi karşılaştırır.
		System.out.println(value.equals("Merhaba Dünya"));
		System.out.println(value.equals("Merhaba dünya"));
		//Büyük küçük bakmaz sadece yazılanı kontrol eder.
		System.out.println(value.equalsIgnoreCase("merhaba dünya"));

		System.out.println("************************");
		
		String value3 = "Mustafa";
		String value4 = "Mustafa";
		String value5 = new String("Mustafa");
		
		//== operatörü referans kontrol eder.
		System.out.println(value3==value4);
		System.out.println(value5==value4);
		//Equals içeriği kontrol eder.
		System.out.println(value5.equals(value4));
		
		// Burada (==) referans kontrolü false verecektir.
		// Ancak (equals() içerik kontrolü true verir. Çünkü trimlenen hafızada tutulur.
		// "Merhaba Dünya" == " Merhaba Dünya " (false) // "Merhaba Dünya" equals " Merhaba Dünya " (true)
		System.out.println(value2.trim()==value);
		System.out.println(value2.trim().equals(value));
		
		
		

	}

}
