import java.util.*;
import java.io.*;

public class PLAY {

	public static int cari(Vector v, String kata) {
		int i = -1;
		int j = 0;

		do {
			if (v.elementAt(j).equals(kata)) {
				i = j;
				break;
			}
			j++;
		} while ((j < v.size()));
		return i;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean ceklogin = false;
		Vector<String> username = new Vector<String>();
		Vector<String> password = new Vector<String>();
		Vector<String> status = new Vector<String>();
		username.add("admin");
		password.add("admin");
		status.add("admin");
		username.add("kasir");
		password.add("kasir");
		status.add("kasir");
		do {
			Database.menuLogin();
			System.out.print("Masukan username anda : ");
			String id = br.readLine();
			System.out.print("Masukan password anda : ");
			String pass = br.readLine();
			if (username.contains(id) && password.contains(pass)) {
				if (username.indexOf(id) == password.indexOf(pass)) {
					int urutan = username.indexOf(id);
					String ceksts = status.elementAt(urutan);
					if (ceksts.equalsIgnoreCase("admin")) {
						int pil = 0;
						ceklogin = true;
						do {
							Database.menuadmin();
							pil = Integer.parseInt(br.readLine());
							switch (pil) {
							case 1:
								BrgMng.brgmng();
								break;

							case 2:

								do {
									System.out
											.println("==========================");
									System.out
											.println("||     KONTROL USER     ||");
									System.out
											.println("==========================");
									System.out.println("1. Tambah user");
									System.out.println("2. Hapus user");
									System.out.println("3. Ubah password & status");
									System.out.println("4. Tampilkan semua user");
									System.out.println("5. Exit");

									System.out.print("Pilihlah menu [1-5] : ");
									pil = Integer.parseInt(br.readLine());

									switch (pil) {

									case 1:
										boolean muter1 = false;
										boolean muter2 = false;
										boolean muter3 = false;
										System.out.println("================");
										System.out.println("Tambah User Baru");
										System.out.println("================");
										do{
											System.out.print("Masukkan username : ");
											String cek = br.readLine();
											if(username.contains(cek)){
											System.out.println("Username "+cek+" telah terdaftar, gunakan username lainnya!");
											System.out.println();
											
											}else{
											username.add(cek);
											
											do{
											String pass1,pass2;
											System.out.print("Masukkan password : ");
											pass1 = br.readLine();
											System.out.print("Ulangi   password : ");
											pass2 = br.readLine();
											System.out.println();
													if(pass1.equals(pass2)){
													   password.add(pass2);
													   do{
													   System.out.print("Masukkan status user "+cek+" [admin/kasir] : ");
													   String sts = br.readLine();
														   if(sts.equalsIgnoreCase("admin") || sts.equalsIgnoreCase("kasir")){
																status.add(sts);
																System.out.println("User "+cek+" telah dibuat.");
																System.out.println();
																muter3=true;
																muter2=true;
																muter1=true;
																/* System.out.print("Buat user lagi ?[Y/N] : ");
																String again = br.readLine();
																	if(again.equalsIgnoreCase("y")){

																	}else{
																	muter3=true;
																	muter2=true;
																	muter1=true;
																	} */
														   }else{
																System.out.println("Tidak terdapat pilihan status '"+sts+"'");
																muter3=false;
																System.out.println();
														   }
													   }while(muter3==false);
													}else{
														System.out.println("Password tidak sama, coba ulangi kembali!");
														muter2=false;
													}
												}while(muter2==false);
											}
										}while(muter1==false);
										
										break;

									case 2:
										System.out.println("================");
										System.out.println("    Hapus User  ");
										System.out.println("================");
										int indexunhapus;
										String userhapus;
										String userhapuspil;
										int indexpwhapus;
										int indexstshapus;

										do {
											System.out
													.print("Masukkan username yang akan dihapus : ");
											userhapus = br.readLine();
											indexunhapus = cari(username,
													userhapus);
											indexpwhapus = indexunhapus;
											indexstshapus = indexunhapus;
										} while (indexunhapus == -1);

										System.out
												.print("Apakah anda akan menghapus user "
														+ userhapus
														+ "? [y/t] ");
										userhapuspil = br.readLine();

										if (userhapuspil.equalsIgnoreCase("y")) {
											username.removeElementAt(indexunhapus);
											password.removeElementAt(indexpwhapus);
											status.removeElementAt(indexstshapus);
											System.out.println("User "
													+ userhapus
													+ " berhasil dihapus");
										}
										break;

									case 3:
										String usernameubah;
										int iunpwubah;
										int ipwpwubah;
										int istsubah;
										String pwakanubah;
										String stsakanubah;
										int isamapw;
										int isamasts;
										int j;

										System.out.println("========================");
										System.out.println("Ubah Password dan Status");
										System.out.println("========================");

										do {
											System.out
													.print("Masukkan username : ");
											usernameubah = br.readLine();
											iunpwubah = cari(username,
													usernameubah);
											ipwpwubah = iunpwubah;
											istsubah = iunpwubah;
										} while (iunpwubah == -1);

										do {
											System.out
													.print("Masukkan password : ");
											pwakanubah = br.readLine();
											isamapw = cari(password, pwakanubah);
											System.out
													.print("Masukan status : ");
											stsakanubah = br.readLine();
											isamasts = cari(status, stsakanubah);
										}

										while (isamapw == -1 && isamasts == -1);

										password.removeElementAt(isamapw);
										status.removeElementAt(isamasts);
										System.out
												.print("Masukan status baru : ");
										String stsbaru = br.readLine();
										status.add(stsbaru);
										System.out
												.print("Masukkan password baru : ");
										String pwbaru = br.readLine();
										password.add(pwbaru);
										System.out
												.println("password dan status anda sudah terganti");

										break;

									case 4:
										int i;
										System.out.println("========================================");
										System.out.println("|USERNAME \t PASSWORD \tSTATUS|");
										System.out.println("========================================");
										for (i = 0; i < username.size(); i++) {
											System.out.print(" "+username.elementAt(i)+ "\t\t "+ password.elementAt(i)+ "\t\t"+ status.elementAt(i));
											System.out.println("");
										}
										break;

									default:
										break;
									}
								}

								while (pil < 5);

								break;

							case 3:
								// REPORT ZONE
								int z=0;
								int y=0;
								int total = 0;
								for(int j = 0 ; j<Penjualan.kodeTRANS.size(); j++){
								System.out.println("Kode Transaksi : "+Penjualan.kodeTRANS.elementAt(j));
								System.out.println("=====================================================================");
								System.out.println("ID Barang\tNama Barang\t\t\tQty\tSatuan\tHarga");
								System.out.println("=====================================================================");
								
								y=y+Integer.parseInt(Penjualan.JTRANS.elementAt(j).toString());
								while(z<y){
									System.out.println(Penjualan.jualID.elementAt(z)+"\t\t"+Penjualan.jualNAMA.elementAt(z)+"\t"+Penjualan.jualQTY.elementAt(z)+"\t"+Penjualan.jualHARGA.elementAt(z)+"\t"+Penjualan.subTOTAL.elementAt(z));
									z++;
									}
									System.out.println("=====================================================================");
								}
								for(int k = 0 ; k<Penjualan.subTOTAL.size(); k++){
									total += Integer.parseInt(Penjualan.subTOTAL.elementAt(k).toString());
								}
								System.out.println("Total Omset : "+total);
								System.out.println();
								break;
							}
						} while (pil < 4);

					} else if (ceksts.equalsIgnoreCase("kasir")) {
						ceklogin = true;
						Penjualan.transaksi();
					}
				} else {
					System.out.println("Data tidak valid !");
				}
			} else {
				System.out.println("Data tidak valid !");
			}
		} while (ceklogin = true);
	}
}