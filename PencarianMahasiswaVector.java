import java.util.*;
import java.io.*;

public class PencarianMahasiswaVector {
	
	private static void tampilanMenu(){
		System.out.println();
		System.out.println("===============================");
		System.out.println("||                           ||");
		System.out.println("||   PROGRAM PENCARIAN       ||");
		System.out.println("||                           ||");
		System.out.println("===============================");		  
		System.out.println("1. Cari berdasarkan NIM");
		System.out.println("2. Tambah data mahasiswa");
		System.out.println("3. Ubah   data mahasiswa");
		System.out.println("4. Hapus  data mahasiswa");
		System.out.println("5. Lihat semua data");
		System.out.println("6. Keluar");
		System.out.print("Masukan pilihan Anda : ");
	}
	
	public static void main (String [] args) throws IOException{
	Vector<String> nimV = new Vector<String>();
	Vector<String> namaV = new Vector<String>();
	int pil = 0;
	int urutan = 0;
	String cari = "";
	boolean inputlagi = false;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	for(int i = 0 ; i<DbMhs.daftarNim.length; i++){
			nimV.addAll(Arrays.asList(DbMhs.daftarNim));
		}
	for(int i = 0 ; i<DbMhs.daftarNama.length; i++){
			namaV.addAll(Arrays.asList(DbMhs.daftarNama));
		}
			do{
			tampilanMenu();
			pil = Integer.parseInt(br.readLine());
			switch(pil){
				case 1:
				System.out.println();
				System.out.print("Masukan NIM yang ingin dicari : ");
				cari = br.readLine();
				if(nimV.contains(cari)){
				urutan = nimV.indexOf(cari);
				System.out.println();
				System.out.println("NIM  : "+nimV.elementAt(urutan));
				System.out.println("Nama : "+namaV.elementAt(urutan));
				}else{
				System.out.println("Data dengan NIM '"+cari+"' tidak ditemukan!");
				}
				break;
				
				case 2:
				inputlagi = false;
				do{
				System.out.println();
				System.out.print("Masukan NIM : ");
				String nimbaru = br.readLine();
				System.out.print("Masukan Nama : ");
				String namabaru = br.readLine();
				if(nimbaru=="" && namabaru==""){
				System.out.println("Data tidak boleh kosong!");
				inputlagi = false;
				}else{
				nimV.add(nimbaru);
				namaV.add(namabaru);
				System.out.println("-DATA BERHASIL DITAMBAHKAN-");
				System.out.println();
				System.out.print("Ingin menambah data lagi ? [Y/N] : ");
				String lagi = br.readLine();
				if(lagi.equalsIgnoreCase("y")){
					inputlagi = false;
				}else{
					inputlagi = true;
					}
				}
				}while(inputlagi==false);
				break;
				
				case 3:
				do{
				System.out.println();
				System.out.print("Masukan NIM : ");
				String nimubah = br.readLine();
				if(nimV.contains(nimubah)){
				urutan = nimV.indexOf(nimubah);
				System.out.println("Nama : "+namaV.elementAt(urutan));
				System.out.print("Masukan nama baru : ");
				String ubah = br.readLine();
					if(ubah==""){
						System.out.println("Nama tidak boleh kosong!");
						inputlagi=false;
					}else{
						namaV.setElementAt(ubah,urutan);
						System.out.println("Data berhasil diubah !");
						inputlagi=true;
					}
				}else{
					System.out.println("NIM '"+nimubah+"' tidak ditemukan!");
					inputlagi=false;
					}
				}while(inputlagi==false);
				break;
				
				case 4:
				do{
				System.out.println();
				System.out.print("Masukan NIM : ");
				String nimhapus = br.readLine();
				if(nimV.contains(nimhapus)){
				urutan = nimV.indexOf(nimhapus);
				System.out.print("Anda yakin menghapus data NIM '"+nimhapus+"' ?[Y/N] : ");
				String cek = br.readLine();
					if(cek.equalsIgnoreCase("y")){
					nimV.removeElementAt(urutan);
					namaV.removeElementAt(urutan);
					System.out.println("-DATA '"+nimhapus+"' BERHASIL DIHAPUS-");
					inputlagi = true;
					}else{
						System.out.println();
						inputlagi = true;
					}
				}else{
					System.out.println("Data '"+nimhapus+"' tidak ditemukan!");
					inputlagi = false;
				}
				}while(inputlagi==false);
				break;
				
				case 5:
				for(int i = 0 ; i<nimV.size(); i++){
				System.out.println(nimV.elementAt(i)+"\t"+namaV.elementAt(i));
				}
				break;
				}
			}while(pil<6);
	}
}