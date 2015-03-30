import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class TestToko{
	public static void main (String [] argx){
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	Scanner sc = new Scanner (System.in);
	String [] DAFTAR_MENU = {"Soto Ayam","Nasi Pecel","Nasi Rawon","Nasi Goreng","Mie Bihun"};
	int [] DAFTAR_HARGA = {10000,8000,9000,7500,8500};
	String [] nama_makan = new String [10];
	int [] harga_makan = new int [10];
	int [] qty_makan = new int [10];
	int i;
	int pil = 0;
	int milih = 0;
	int qty = 0;
	int a = 0;
	int total = 0;
	int subtotal = 0;
		    do{
				System.out.println("=========================");
				System.out.println("=      MENU MAKANAN     =");
				System.out.println("=    WARUNG SEDERHANA   =");
				System.out.println("=      RAYMOND A.S      =");
				System.out.println("=========================");
					for(i = 0; i<DAFTAR_MENU.length; i++)
					{
						System.out.println((i+1)+". " + DAFTAR_MENU[i] +"\tRp."+ DAFTAR_HARGA[i]);
					}
			}while(i<DAFTAR_MENU.length);
				do{
					System.out.println();
					System.out.print("Masukkan menu pilihan anda : ");
					pil = sc.nextInt();
					if(pil==1){
						nama_makan[milih] = DAFTAR_MENU[0];
						harga_makan[milih] = DAFTAR_HARGA[0];
						pil = harga_makan[milih];
						System.out.print("Masukkan jumlah porsi yang ingin anda pesan : ");
						qty_makan[milih] = sc.nextInt();
						total = pil*qty_makan[milih];
						milih++;
					}
					else if(pil==2){
						nama_makan[milih] = DAFTAR_MENU[1];
						harga_makan[milih] = DAFTAR_HARGA[1];
						pil = harga_makan[milih];
						System.out.print("Masukkan jumlah porsi yang ingin anda pesan : ");
						qty_makan[milih] = sc.nextInt();
						total = pil*qty_makan[milih];
						milih++;
					}
					else if(pil==3){
						nama_makan[milih] = DAFTAR_MENU[2];
						harga_makan[milih] = DAFTAR_HARGA[2];
						pil = harga_makan[milih];
						System.out.print("Masukkan jumlah porsi yang ingin anda pesan : ");
						qty_makan[milih] = sc.nextInt();
						total = pil*qty_makan[milih];
						milih++;
					}
					else if(pil==4){
						nama_makan[milih] = DAFTAR_MENU[3];
						harga_makan[milih] = DAFTAR_HARGA[3];
						pil = harga_makan[milih];
						System.out.print("Masukkan jumlah porsi yang ingin anda pesan : ");
						qty_makan[milih] = sc.nextInt();
						total = pil*qty_makan[milih];
						milih++;
					}
					else if(pil==5){
						nama_makan[milih] = DAFTAR_MENU[4];
						harga_makan[milih] = DAFTAR_HARGA[4];
						pil = harga_makan[milih];
						System.out.print("Masukkan jumlah porsi yang ingin anda pesan : ");
						qty_makan[milih] = sc.nextInt();
						total = pil*qty_makan[milih];
						milih++;
					}
					System.out.println();
					System.out.print("Apakah anda ingin memesan lagi ?(Ya = 1, Tidak = 0) : ");
					a = sc.nextInt();
					subtotal+=total;
				}while(a!=0);
					System.out.println("================================================");
					System.out.println("=              WARUNG SEDERHANA                =");
					System.out.println("=                 RAYMOND A.S                  =");
					System.out.println("================================================");
					System.out.println("Tanggal : "+dateFormat.format(date));
					System.out.println("No\tNama Makanan\tQty\tHarga");
					for(int j = 0;j<milih;j++){
					System.out.println((j+1)+"\t"+ nama_makan[j] +"\t"+ qty_makan[j] +"\t"+ harga_makan[j]*qty_makan[j]);
					}
					System.out.println("================================================");
					System.out.println("Total : \t\t\t"+subtotal+"          =");
					System.out.println("================================================");
		}
}