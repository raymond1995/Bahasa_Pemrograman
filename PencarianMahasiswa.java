import java.util.*;
import java.io.*;
public class PencarianMahasiswa{
  public static String db[][]={
	{"08410100375", "Purwanto"},
    {"10410100146","Noer Hidayat"}, 
    {"10410100162","Sandy Perdana"},
    {"11410100142","Himawan Pradipta Utama"},
    {"12410100049","Sujatmiko Hadinugroho"},
    {"12410100070","Denny Kusuma"},
    {"12410100088","Mochammad Afri Fitriansyah"},
    {"12410100131","Pradita Satria Prima"},
    {"12410100159","Fajriyan Nurli"},
    {"12410100160","Hazvi Fahlevi"},
    {"13410100006","Nico Stephanus Kuncoro"},
    {"13410100007","Ramdhani Kurniawan"},
    {"13410100048","Alanvianto Mukti Tamtomo"},
    {"13410100049","Satryo Widodo"},
    {"13410100058","Khamim Ahsanu Amala"},
    {"13410100060","Arfiansyah Agma"},
    {"13410100061","Candra Dwi Prasetya"},
    {"13410100069","Mohammad Rangga Nurcahyo"},
    {"13410100083","Raymond Andreas Soebijantoro"},
    {"13410100153","Dwiki Rizwan Nizar"},
    {"13410100155","Anggy Pranindya Sudarmadji"},
	{"13410100157","Wahyu Alfiyanda"},
	{"13410100180","Rayana Suryatama"},
    {"13410100190","Bryan Asril Zani"},
    {"13410100192","Eko Amiyantho"},
    {"13410100200","Kristin Lebdaningrum"},
	{"13410100206","RB. Nuriana Alim Putra"},
	{"13410100216","Sabdo Wicaksono Putra"},
    {"14410100170","Rizky Akbar"},
    {"14410100172","Abdul Haris"},
    {"14410100173","Ach Nofal Kurniawan"},
    {"14410100174","Andri Anggara"},
    {"14410100175","Auda Rizqi Aulany"},
    {"14410100176","Noppy Wahyono Suwoto"},
    {"14410100177","Arya Teja"},
    {"14410100178","Nuari Imas Masita"},
	{"14410100179","Afif Lutfian Fahmi Chudlori"},
    {"14410100181","Novita Perdani"},
    {"14410100182","Dheta Amelya Kurniawendy"}
	};
/*   public static String []daftarNama = {
    "Purwanto",
"Noer Hidayat",
"Sandy Perdana",
"Himawan Pradipta Utama",
"Sujatmiko Hadinugroho",
"Denny Kusuma",
"Mochammad Afri Fitriansyah",
"Pradita Satria Prima",
"Fajriyan Nurli",
"Hazvi Fahlevi",
"Nico Stephanus Kuncoro",
"Ramdhani Kurniawan",
"Alanvianto Mukti Tamtomo",
"Satryo Widodo",
"Khamim Ahsanu Amala",
"Arfiansyah Agma",
"Candra Dwi Prasetya",
"Mohammad Rangga Nurcahyo",
"Raymond Andreas Soebijantoro",
"Dwiki Rizwan Nizar",
"Anggy Pranindya Sudarmadji",
"Wahyu Alfiyanda",
"Rayana Suryatama",
"Bryan Asril Zani",
"Eko Amiyantho",
"Kristin Lebdaningrum",
"RB. Nuriana Alim Putra",
"Sabdo Wicaksono Putra",
"Rizky Akbar",
"Abdul Haris",
"Ach Nofal Kurniawan",
"Andri Anggara",
"Auda Rizqi Aulany",
"Noppy Wahyono Suwoto",
"Arya Teja",
"Nuari Imas Masita",
"Afif Lutfian Fahmi Chudlori",
"Novita Perdani",
    "Dheta Amelya Kurniawendy"}; */

    
  public static int cariByNim(String nim){
	int idx =-1;
   for(int i =0;i<db.length;i++){
	   if(nim.equalsIgnoreCase(db[i][0])){
		   idx = i;
	   }
   }
   return idx;
  }
  
  public static int cariByNama(String nim){
  int idx =-1;
   for(int i =0;i<db.length;i++){
	   if(nim.equalsIgnoreCase(db[i][1])){
		   idx = i;
	   }
   }
   return idx;
  } 
  
  public static String [] filterNama(String nama){
	int counter = 0;
	for(int i = 0; i<db.length; i++){
		if(db[i][1].contains(nama))
		counter++;
	}
	String arr[] = new String [db.length];
	counter = 0;
	for(int i=0; i<db.length; i++){
		if(db[i][1].contains(nama)){
			arr[i]=db[i][1];
			//counter;
		}
	}
	return arr;
  }
  
    public static String [] filterNim(String nim){
	int counter = 0;
	for(int i = 0; i<db.length; i++){
		if(db[i][0].contains(nim))
		counter++;
	}
	String arr[] = new String [db.length];
	counter = 0;
	for(int i=0; i<db.length; i++){
		if(db[i][0].contains(nim)){
			arr[i]=db[i][0];
			//counter;
		}
	}
	return arr;
  }
  
  public static void menu(){
		  System.out.println("PROGRAM PENCARI DATA MAHASISWA");
		  System.out.println("1. Cari berdasarkan NIM");
		  System.out.println("2. Cari berdasarkan Nama");
		  System.out.println("3. Cari berdasarkan Angkatan (NIM)");
		  System.out.println("4. Melihat Semua Data Mahasiswa");
		  System.out.println("5. Exit");
		  System.out.print("Masukan pilihan anda : ");
  }

  public static void main(String []str) throws IOException{
	  String nim="";
	  int pil = 0;
	  int ketemu = 0;
	  String nama="";
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  do{
		  menu();
		  pil = Integer.parseInt(br.readLine());
		  switch(pil){
			  case 1:
					do{
						  System.out.println();
						  System.out.print("Masukkan Nim : ");
						  nim = br.readLine();
						  ketemu = cariByNim(nim);
						  if(ketemu == -1){
							System.out.println();
							System.out.println("Tidak ditemukan!");
							System.out.println();
							}
							else{
								System.out.println();
								System.out.println("NIM : " + db[ketemu][0]);
								System.out.println("Nama : " + db[ketemu][1]);
								System.out.println();
							}
					  }while(ketemu==-1);	  
			  break;
			  case 2:
			  do{
						  System.out.println();
						  System.out.print("Masukkan Nama : ");
						  nim = br.readLine();
						  ketemu = cariByNama(nim);
						  if(ketemu == -1){
							System.out.println();
							System.out.println("Tidak ditemukan!");
							System.out.println();
							}
							else{
								System.out.println();
								System.out.println("NIM : " + db[ketemu][0]);
								System.out.println("Nama : " + db[ketemu][1]);
								System.out.println();
							}
					  }while(ketemu==-1);	
			  break;
			  case 3:
				//FILTER BERDASARKAN ANGKATAN (NIM)
				do{
				System.out.println();
				System.out.print("Masukan NIM : ");
				nim = br.readLine();
				String NimMhs [] = filterNim(nim); 
				boolean found = false;
				int ketemux = 1;
				for(int i = 0; i < NimMhs.length ; i++ ){
					if(NimMhs[i] == null){
					System.out.print("");
					found = true;
					}
					else{
					System.out.println("NIM : " +NimMhs[i]);
					found = true;
					ketemux++;
					}
				}
				System.out.println();
				if((found != false) &&(ketemux ==1)){
					System.out.println("Data tidak ditemukan!");
					System.out.println();
					}
				}while(ketemu==1);
			  break;
			  case 4:
				//TAMPILKAN SELURUH DATA
				System.out.println();
				for(int i = 0 ; i<db.length; i++){
					System.out.print("");
					for(int j = 0; j<db[i].length; j++){
						System.out.print(" "+db[i][j]);
					}
					System.out.println();
				}
				System.out.println();
			  break;
		  }
		  
	  }while(pil<5);
  }
}