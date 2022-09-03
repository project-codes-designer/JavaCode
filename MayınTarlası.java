import java.util.Random;
import java.util.Scanner;

public class MayınTarlası {
	
	
	public static int  [][] haritadoldur (int satır,int sütun){
		
		Random scan = new Random();
		
		int [][]matris = new int[satır][sütun];
		
		for(int i = 0 ; i<satır ; i++) {
			for(int j = 0; j<sütun ; j++) {
				matris [i][j] = scan.nextInt(2); // 0 ile 1 de�erini ister
			}
		}
		for(int i1 = 0 ; i1<satır ; i1++) {
			for(int j1 = 0; j1<sütun ; j1++) 
				System.out.print(matris[i1][j1] + " ");
			System.out.println("");
			
		}
		
		return matris;
	}

	
		/* sat�r ve s�t�n say�s� kullan�c�dan al�nacak : int
		 * rastgale random say�s� at 0 ve 1 de�eri -> 0 temiz 1 may�nl� b�lge
		 * kullan�c�dan lokasyon istenilecek
 		 * puan ba�lang��ta : 0: int 
 		 * e�er 0 gelirse +10 puan oyun devam eder ve kullan�c� yeni lokasyon veririr ...
 		 * 1 geldi�i anda oyun biter puan g�sterilir.
		 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MayınTarlası a = new MayınTarlası();
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Satır sayısını giriniz: ");
		int yenisatır = scan.nextInt();
		System.out.println("Sütun sayısını giriniz: ");
		int yenisütun = scan.nextInt();
		
		int [][] oyunmatrisi = a.haritadoldur(yenisatır, yenisütun);
		
		
		int puan= 0;
		
		boolean kontrol = true;
		
		while (kontrol) {
			System.out.println("Konum satır değerini giriniz: ");
			int konumsatır = scan.nextInt();
			System.out.println("Konum sütun değerini giriniz: ");
			int konumsütun = scan.nextInt();
			
			if(oyunmatrisi[konumsatır][konumsütun] == 1) {
				kontrol= false ;
				System.out.println("Oyun bitti! Puanınız: " +puan);
			}
			else {
				puan += 10;
				System.out.println("Hala hayattasınız... Oyuna devam edebilirsiniz...");
			}
		}
		

	}

}
