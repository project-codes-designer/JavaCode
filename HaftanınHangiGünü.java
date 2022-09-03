import java.util.Scanner;

public class HaftanınHangiGünü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("1 ile 365 arasında bir değer giriniz: ");
		int değer = scan.nextInt();
		
		
		while (değer<0 || değer > 365) {
			System.out.println("Lütfen belirtilen koşula uygun değer giriniz");
			System.out.println("1 ile 365 arasında bir değer giriniz: ");
		    değer = scan.nextInt();
		
		}
		
		int gündeğeri = değer % 7;
		String günadı = "";
		
		if (gündeğeri == 0)
			günadı = "Cumatesi";
		else if (gündeğeri == 1) 
			günadı = "Pazar";
		else if (gündeğeri== 2) 
			günadı = "Pazartesi";
		else if (gündeğeri == 3) 
			günadı = "Salı";
		else if (gündeğeri == 4) 
			günadı = "Çarşamba";
		else if (gündeğeri == 5) 
			günadı = "Perşembe";
		else if (gündeğeri == 6) 
			günadı = "Cuma";
		
		System.out.println("Bugün cumartesi "+ değer+ " gün sonra haftanın " + günadı + " günüdür.");
		
		
		
	}

}
