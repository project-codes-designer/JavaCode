
public class YolKlavuzu {
	
	public static String yolbul(int [][] veri) {
		
		String sonuç= " ";
		int satır = veri.length;
		int sütun = veri[0].length;
		
		for(int i = 0; i<satır; i++) {
			
			for(int j = 0 ; j <sütun ; j++) {
				
				if (veri[i][j] == 1)
					sonuç = sonuç + " " + i+j;
			}
		}
		
		return sonuç;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int harita [][] = {{1,1,0,0,0}, {0,1,1,0,0 }, {0,0,1,1,0}, {0,0,0,1,1}};
		YolKlavuzu a = new YolKlavuzu();
		System.out.println(	a.yolbul(harita));
	}

}
