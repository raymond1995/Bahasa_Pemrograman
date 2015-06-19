import java.util.*;
import java.io.*;

public class BrgMng {
	public static final Vector<String> barangID = new Vector<String>(
			Arrays.asList(Database.DBbarangID));
	public static final Vector<String> barangNAMA = new Vector<String>(
			Arrays.asList(Database.DBbarangNAMA));
	public static final Vector<String> barangHARGA = new Vector<String>(
			Arrays.asList(Database.DBbarangHARGA));

	public static void brgmng() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pil = 0;
		do {
			System.out.println("==========================");
			System.out.println("||     KONTROL BARANG   ||");
			System.out.println("==========================");
			System.out.println("1. Tambah barang");
			System.out.println("2. Hapus barang");
			System.out.println("3. Ubah barang");
			System.out.println("4. Cari data barang");
			System.out.println("5. Tampilkan semua barang");
			System.out.println("6. Exit");

			System.out.print("Pilihlah menu [1-5] : ");
			pil = Integer.parseInt(br.readLine());

			switch (pil) {

			case 1:
				boolean muter = false;
				System.out.println();
				System.out.println();
				do{
				System.out.print("ID Barang : ");
				String idbarang = br.readLine();
				if (barangID.contains(idbarang)) {
					System.out
							.println("ID Barang " + idbarang + " sudah ada !");
							muter=false;
				} else {
					barangID.add(idbarang);
					System.out.print("Nama Barang : ");
					barangNAMA.add(br.readLine());
					System.out.print("Harga Barang : ");
					barangHARGA.add(br.readLine());
					System.out.println();
					System.out.println();
					System.out.print("Tambahkan barang lagi ? [Y/N] : ");
					String again = br.readLine();
					if(again.equalsIgnoreCase("y")){
					muter=false;
					}else{
					muter=true;
					}
					}
				}while(muter==false);
				break;

			case 2:
				int indexunhapus;
				String userhapus;
				String userhapuspil;
				int indexpwhapus;

				do {
					System.out.print("Masukkan ID barang yang akan dihapus : ");
					userhapus = br.readLine();
					indexunhapus = cari(barangID, userhapus);
					indexpwhapus = indexunhapus;
				} while (indexunhapus == -1);

				System.out.print("Apakah anda akan menghapus barang "
						+ userhapus + "? [y/t] ");
				userhapuspil = br.readLine();

				if (userhapuspil.equalsIgnoreCase("y")) {
					barangID.removeElementAt(indexunhapus);
					barangNAMA.removeElementAt(indexpwhapus);
					barangHARGA.removeElementAt(indexpwhapus);
					System.out.println("Barang ID " + userhapus
							+ " berhasil dihapus");
				}
				break;

			case 3:
				boolean ubahbarang = false;
				int urutan = 0;
				do {
					System.out
							.println("Masukan ID Barang yang ingin diubah : ");
					String idubah = br.readLine();
					if (barangID.contains(idubah)) {
						ubahbarang = true;
						urutan = barangID.indexOf(idubah);
						System.out.println("Mengganti Data Barang");
						System.out.println("ID Barang\t Nama Barang\t Harga");
						System.out.println(barangID.elementAt(urutan) + "\t"
								+ barangNAMA.elementAt(urutan) + "\t\t"
								+ barangHARGA.elementAt(urutan));
						System.out.print("[Y/N]");
						String ganti = br.readLine();
						if (ganti.equalsIgnoreCase("y")) {
							System.out.print("Masukan nama barang  : ");
							barangNAMA.setElementAt(br.readLine(), urutan);
							System.out.print("Masukan harga barang : ");
							barangHARGA.setElementAt(br.readLine(), urutan);
						} else {
							System.out.println("Data barang " + idubah
									+ " tidak diubah.");
						}
					} else {
						System.out.println("Data ID Barang " + idubah
								+ " tidak ditemukan !");
						ubahbarang = false;
					}
				} while (ubahbarang == false);
				break;
				
			case 4:
			boolean ulangi = false;
			System.out.println("=============================");
			System.out.println("  ID BARANG YANG TERDAFTAR   ");
			System.out.println("=============================");
			for(int i = 0 ; i<barangID.size(); i++){
				System.out.print(" "+barangID.elementAt(i)+" ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
			do{
			System.out.print("Masukan ID Barang : ");
			String cari = br.readLine();
			int urut = 0;
			if(barangID.contains(cari)){
			urut = barangID.indexOf(cari);
			System.out.println("Nama  Barang : "+barangNAMA.elementAt(urut));
			System.out.println("Harga Barang : Rp."+barangHARGA.elementAt(urut)+",-");
			System.out.println();
			ulangi = true;
			}else{
			System.out.println("Data barang dengan ID '"+cari+"' tidak ditemukan!");
			System.out.println();
			ulangi = false;
				}
			}while(ulangi==false);
			break;

			case 5:
				int i;
				System.out
						.println("=====================================================================");
				System.out.println("ID Barang\t Nama Barang\t\t\t\t Harga");
				System.out
						.println("=====================================================================");
				for (i = 0; i < barangID.size(); i++) {
					System.out.print(barangID.elementAt(i).toString() + "\t\t "
							+ barangNAMA.elementAt(i) + "\t\t "
							+ barangHARGA.elementAt(i));
					System.out.println("");
				}
				break;

			default:
				break;
			}
		}

		while (pil < 6);
	}

	public static int cari(Vector v, String kata) {
		int i = -1;
		int j = 0;

		do {
			if (v.elementAt(j).equals(kata))
				i = j;
			j++;
		} while ((j < v.size()) && (i == -1));
		return i;
	}
}