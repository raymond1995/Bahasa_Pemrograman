import java.util.*;
public class ProgramBelajarPenjumlahan{
	public static void main (String [] argx){
		Scanner sc = new Scanner(System.in);
		int jumlah_soal = 0;
		int bil1 = 0;
		int bil2 = 0;
		int jawab = 0;
		int soal = 0;
		int benar = 0;
		int salah = 0;
		int score = 10;
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println("-Program Belajar Penjumlahan-");
		System.out.println("-----------------------------");
		System.out.print("Masukkan jumlah soal : ");
		jumlah_soal = sc.nextInt();
		for(int i=0;i<jumlah_soal;i++){
		bil1 = (int)(Math.random()*10.0);
		bil2 = (int)(Math.random()*10.0);
		System.out.print(bil1+" + "+bil2+" = ");
		soal = bil1+bil2;
		jawab = sc.nextInt();
		if(soal==jawab){
				benar++;
				score=score*benar;
			}else{
				salah++;
			}
		}
		System.out.println("Jawaban benar = "+benar);
		System.out.println("Jawaban salah = "+salah);
		System.out.println("Skor anda = "+score);
	}
}