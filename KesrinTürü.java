import java.util.Scanner;

public class KesrinTürü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Pay değerini giriniz: ");
		int pay = scan.nextInt();
		System.out.println("Payda değerini giriniz: ");
		int payda = scan.nextInt();
		
		if(payda>pay)
			System.out.println("Basit kesir girdiniz.");
		else if (payda == pay)
			System.out.println("Girdiğiniz değer bir tamsayıdır ve bire eşittir. ");
		else if (payda < pay)
			System.out.println("Birleşik kesir girdiniz... \nKesir değeri  " + (pay/payda) + " tam " + (pay%payda) + "/"+ payda);

	}

}
