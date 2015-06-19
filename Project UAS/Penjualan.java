import java.util.*;
import java.io.*;

public class Penjualan{
		public static final Vector<String>jualID = new Vector<String>();
		public static final Vector<String>jualNAMA = new Vector<String>();
		public static final Vector jualQTY = new Vector();
		public static final Vector jualHARGA = new Vector();
		public static final Vector subTOTAL = new Vector();
		public static final Vector kodeTRANS = new Vector();
		public static final Vector JTRANS = new Vector();

	public static void transaksi() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Vector<String>ID = new Vector<String>(BrgMng.barangID);
		Vector<String>NAMA = new Vector<String>(BrgMng.barangNAMA);
		Vector<String>HARGA = new Vector<String>(BrgMng.barangHARGA);
		boolean ada = false;
		int urutan = 0;
		int pil = 0;
		int st = 0;
		int idtr = 0;
		do{
		Database.menukasir();
		pil = Integer.parseInt(br.readLine());
		switch(pil){
			case 1:
			idtr= kodeTRANS.size()+1;
			for(int i = 0; i<kodeTRANS.size();i++){
				if(idtr == Integer.parseInt(kodeTRANS.elementAt(i).toString())){
				idtr++;
				}
			}
			kodeTRANS.add(idtr);
			System.out.println("Kode Transaksi : "+idtr);
				int jum_trans=0;
				do{
				System.out.print("Masukan ID Barang : ");
				String idbarang = br.readLine();
				if(ID.contains(idbarang)){
					urutan = ID.indexOf(idbarang);
					System.out.println("Nama  Barang : "+NAMA.elementAt(urutan));
					System.out.println("Harga Barang : "+HARGA.elementAt(urutan));
					System.out.print("Jumlah yang ingin dibeli : ");
					int qtybarang = Integer.parseInt(br.readLine());
					st = qtybarang * Integer.parseInt(HARGA.elementAt(urutan));
					jualID.add(idbarang);
					jualNAMA.add(NAMA.elementAt(urutan));
					jualQTY.add(qtybarang);
					jualHARGA.add(HARGA.elementAt(urutan));
					subTOTAL.add(st);
					jum_trans++;
					}else{
					ada = false;
					System.out.println("ID Barang "+idbarang+" tidak ditemukan!");
					}
					System.out.print("Transaksi lagi ?[Y/N] : ");
					String again = br.readLine();
					if(again.equalsIgnoreCase("y")){
					ada = false;
					}else{
					ada = true;
					System.out.println("Terima kasih telah berbelanja.");
					JTRANS.add(jum_trans);
					}
				}while(ada==false);
			break;
			
			case 2 :
			break;
			
			}
		}while(pil<2);
	}
}