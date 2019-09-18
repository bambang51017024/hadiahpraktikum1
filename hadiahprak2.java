import java.util.Scanner;
public class hadiahprak2 {

  public static void main (String[] args) {
  	Scanner input = new Scanner(System.in);
	double LL, JJ;
		
		System.out.println("=====HADIAH NO 02=====");
		System.out.println("Menghitung Luas Lingkaran");
		System.out.print("Masukkan Nilai Jari-Jari: ");
		JJ=input.nextInt();
		System.out.println();
		
		LL=3.14*JJ*JJ;
		System.out.println("Hasil Dari Perhitungan Luas Lingkaran Adalah: "+LL);
	}
	
}