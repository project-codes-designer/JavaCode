import java.util.Scanner;

public class HavalıİsimYazma {
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen adınızı giriniz");
	String ad = scan.nextLine();
	System.out.println("Lütfen soyadınızı giriniz");
	String soyad = scan.nextLine();
	
	int aduzunluk = ad.length();
	while (aduzunluk % 12 != 0) {
		ad = ad + "*";
		aduzunluk = ad.length();
		
	}
	
	int soyaduzunluk = soyad.length();
	while (soyaduzunluk % 12 != 0) {
		soyad = soyad + "+";
		soyaduzunluk = soyad.length();
	}
	int adparçauzunluk;
	int adboşluksayısı;
	
	 adparçauzunluk = ad.length()/4;
	 adboşluksayısı = adparçauzunluk - 2;
	String adboşluk = " ";
	while(adboşluk.length()< adboşluksayısı) {
		adboşluk += " ";
	}
	
	String adparça1 = ad.substring(0 , adparçauzunluk);
	String adparça2= ad.substring(adparçauzunluk , 2*adparçauzunluk);
	String adparça3 = ad.substring(2*adparçauzunluk , 3*adparçauzunluk);
	String adparça4 = ad.substring(3*adparçauzunluk , 4*adparçauzunluk);

	System.out.println(adparça1);
	
	for(int i = 0 ; i < adparçauzunluk ; i++) {
		int j = adparçauzunluk-1-i;
		System.out.println(adparça2.substring(i, i+1) + adboşluk + adparça4.substring(j, j+1));
	}
	
	System.out.println(adparça3);
	
	System.out.println("-----------------------------");
	
	int soyadparçauzunluk = soyad.length()/3;
	int soyadboşluksayısı = soyadparçauzunluk-2;
	String soyadboşluk = " ";
	while(soyadboşluk.length()< soyadboşluksayısı) {
		soyadboşluk += " ";
	}
	String soyadparça1 = soyad.substring(0 , soyadparçauzunluk);
	String soyadparça2= soyad.substring(soyadparçauzunluk , 2*soyadparçauzunluk);
	String soyadparça3 = soyad.substring(2*soyadparçauzunluk , 3*soyadparçauzunluk);
	
	for(int k = 0 ; k < soyadparçauzunluk ; k++) {
		int l = soyadparçauzunluk-1-k;
		System.out.println(soyadparça1.substring(k, k+1) + soyadboşluk + soyadparça3.substring(l, l+1));
	}
	System.out.println(soyadparça2);
	
	
			
	 
	}}
 