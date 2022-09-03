import java.util.Scanner;

public class SaatKaç {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner (System.in);
		
		System.out.println("100 ile 500 arasında bir değer giriniz: ");
		int dakika = scan.nextInt();
		
		
		while (dakika<100 || dakika > 500) {
			System.out.println("Lütfen belirtilen koşula uygun değer giriniz");
			System.out.println("100 ile 500 arasında bir değer giriniz: ");
		    dakika = scan.nextInt();
		
		}
		
		
		int saat = dakika/60;
		int yenidakika = dakika%60;
		
		
		saat = saat+8;
		yenidakika = yenidakika+30;
		
		if(yenidakika>=60) {
			
			saat = saat + (yenidakika/60);
			yenidakika = yenidakika %60;
		
		
	}
		System.out.println("Sınavın başlangıç saati 8:30'dur " + dakika + "dakika sonra saat "+ (saat) + ":"+ (yenidakika)+ " olacaktır");

	
	
	}
}
