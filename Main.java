
public class Main {

	public static void main(String[] args) {
		// ilk index bir b�lgede ka� tane �ehir?
		// ikinci index ka� tane b�lge?
		String[][] sehirler = new String[3][3];
		// basit matematik 3x3 = 9 tane de�i�kenimiz var.
		sehirler[0][0] = "�stanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Kocaeli";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbak�r";
		sehirler[2][1] = "�anl�urfa";
		sehirler[2][2] = "Gaziantep";
		for (int i = 0; i <=2; i++) {
			System.out.println("======================");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);
			}
		}
	}

}
