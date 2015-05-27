import java.lang.System.*;
import java.util.Scanner;

public class search_sequensial {
	
	
	public static String daftarNim[] = {"08410100375","10410100146","10410100162","11410100142","12410100049",
										"12410100070","12410100088","12410100131","12410100159","12410100160",
										"13410100006","13410100007","13410100048","13410100049","13410100058",
										"13410100060","13410100061","13410100069","13410100083","13410100153",
										"13410100155","13410100157","13410100180","13410100190","13410100192",
										"13410100200","13410100206","13410100216","14410100170","14410100172",
										"14410100173","14410100174","14410100175","14410100176","14410100177",
										"14410100178","14410100179","14410100181","14410100182"};
										
										
	public static String []daftarNama = {"Purwanto","Noer Hidayat","Sandy Perdana","Himawan Pradipta Utama","Sujatmiko Hadinugroho",
										 "Denny Kusuma","Mochammad Afri Fitriansyah","Pradita Satria Prima","Fajriyan Nurli","Hazvi Fahlevi",
										 "Nico Stephanus Kuncoro","Ramdhani Kurniawan","Alanvianto Mukti Tamtomo","Satryo Widodo","Khamim Ahsanu Amala",
										 "Arfiansyah Agma","Candra Dwi Prasetya","Mohammad Rangga Nurcahyo","Raymond Andreas Soebijantoro","Dwiki Rizwan Nizar",
										 "Anggy Pranindya Sudarmadji","Wahyu Alfiyanda","Rayana Suryatama","Bryan Asril Zani","Eko Amiyantho",
										 "Kristin Lebdaningrum","RB. Nuriana Alim Putra","Sabdo Wicaksono Putra","Rizky Akbar","Abdul Haris",
										 "Ach Nofal Kurniawan","Andri Anggara","Auda Rizqi Aulany","Noppy Wahyono Suwoto","Arya Teja",
										 "Nuari Imas Masita","Afif Lutfian Fahmi Chudlori","Novita Perdani","Dheta Amelya Kurniawendy"};
	
	
	public static boolean cariByNim(String [] data_nim, String cari){
		int i = 0; 
		boolean ketemu = false;
		for (i=0; i<data_nim.length; i++) {
			if (data_nim[i].equalsIgnoreCase(cari)) {
			ketemu = true;
			}
		}
		return ketemu;
	}
  
  
	public static boolean cariByNama(String [] data_nama, String cari2){   
		int j = 0; 
		boolean ketemu2 = false;
		for (j=0; j<data_nama.length; j++) {
			if (data_nama[j].equalsIgnoreCase(cari2)) {
				ketemu2 = true;
			}
		}
		return ketemu2;
	}
	
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("=================== INPUT ===================");
		System.out.print("Inputkan Nim : "); String nim = input.nextLine();
		System.out.print("Inputkan Nama : "); String nama = input.nextLine();
		
		System.out.println();
		System.out.println("================== OUTPUT ===================");
		if(cariByNim(daftarNim,nim)==true){
			System.out.println("NIM " +nim+ " KETEMU");
			}else{
				System.out.println("NIM " +nim+ " TIDAK KETEMU");
		}
		
		if(cariByNama(daftarNama,nama)==true){
			System.out.println("NAMA " +nama+ " KETEMU");
			}else{
				System.out.println("NAMA " +nama+ " TIDAK KETEMU");
		}
		
	 }
	 
	 
}