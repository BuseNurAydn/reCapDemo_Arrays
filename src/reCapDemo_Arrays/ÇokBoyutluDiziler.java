package reCapDemo_Arrays;

public class �okBoyutluDiziler {

	public static void main(String[] args) {
		String [][] sehirler = new String [3][3]; //matris yap�s�
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Edirne";
		sehirler[0][2] = "�anakkale";
		sehirler[1][0] = "Sinop";
		sehirler[1][1] = "Trabzon";
		sehirler[1][2] = "Rize";
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Konya";
		sehirler[2][2] = "Kayseri";
		
		for(int i =0;i<3;i++) {
			for(int j =0 ;j <3;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
				
				

	}

}
