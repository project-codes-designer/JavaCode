import java.util.Scanner;

public class RakamdanYazıyaDönüşüm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Dört basamaklı bir sayı giriniz : ");
		int sayı = scan.nextInt();
		if (sayı>9999 && sayı<0)
			System.out.println("Girdiğiniz sayı dört basamaklı değil!");
		else {
			int birler = sayı % 10;
			sayı= sayı /10;
			int onlar = sayı % 10;
			sayı = sayı /10;
			int yüzler = sayı % 10;
			sayı = sayı / 10;
			int binler = sayı % 10;
			
			String sonuç="";
			String []dizi1 = {"","","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
			String[] dizi2 = {"","on","yirmi","otuz","kırk","elli","altmış","yetmiş","seksen","doksan"};
	
			
			if (yüzler !=0)
				sonuç += dizi1[binler] + " bin "+ dizi1[yüzler]+ " yüz "+ dizi2[onlar]+ " "+ dizi1[birler];
			else 
				sonuç += dizi1[binler] + " bin "+ dizi2[onlar]+ " "+ dizi1[birler];
			
			if(birler == 1)
				sonuç += "bir";
			
			
			System.out.println(sonuç);
			
		}
			
		

	}

}
