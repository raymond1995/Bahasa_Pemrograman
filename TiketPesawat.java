import java.util.*;

public class TiketPesawat {
	public static void main(String[] argx) {
		String[][] classHIGH = { { "1A", "1B", "1C", "1D", "1E" },
				{ "2A", "2B", "2C", "2D", "2E" } };
		String[][] classMEDIUM = { { "3A", "3B", "3C", "3D", "3E" },
				{ "4A", "4B", "4C", "4D", "4E" } };
		String[][] classLOW = { { "5A", "5B", "5C", "5D", "5E" },
				{ "6A", "6B", "6C", "6D", "6E" } };
		String [] boking = new String [5];

		Scanner sc = new Scanner(System.in);
		int hargaHIGH = hargaMEDIUM+(hargaMEDIUM*0.75);
		int hargaMEDIUM = hargaLOW+(hargaLOW*0.5);
		int hargaLOW = 20000;
		String pesan = "";
		int total = 0;
		int pil1 = 0;
		int pil2 = 0;

		do {
			System.out.println("===================================");
			System.out.println("          PEMESANAN TIKET          ");
			System.out.println("          GARUDA SURABAYA          ");
			System.out.println("===================================");
			System.out.println("1. Pesan Kursi");
			System.out.println("2. Lihat Kursi");
			System.out.println("3. Total Penjualan");
			System.out.println("4. Keluar");
			System.out.println();
			System.out.print("Masukkan pilihan anda : ");

			pil1 = sc.nextInt();
			switch (pil1) {
			case 1:
				do {
					if (pil2 > 4) {
						System.out.println("Pilihan tidak ditemukan !");
						System.out.println();
					};
					System.out.println();
					System.out.println("1. Kelas VIP");
					System.out.println("2. Kelas Eksekutif");
					System.out.println("3. Kelas Ekonomi");
					System.out.println("4. Menu Utama");
					System.out.println();
					System.out
							.print("Masukkan kelas kursi yang ingin dipesan : ");
					pil2 = sc.nextInt();
					switch (pil2) {
					case 1:
						System.out.println();
						System.out
								.println("===================================");
						System.out
								.println("          PEMESANAN TIKET          ");
						System.out
								.println("          GARUDA SURABAYA          ");
						System.out
								.println("            KELAS VIP              ");
						System.out
								.println("===================================");
						for (int i = 0; i < classHIGH.length; i++) {
							for (int x = 0; x < classHIGH[i].length; x++) {
								System.out.print(classHIGH[i][x] + "\t");
							}
							System.out.println();
						}
						System.out.println();
						System.out
								.print("Masukan nama kursi yang ingin dipesan : ");
						pesan = sc.next();
						for (int i = 0; i < classHIGH.length; i++) {
							for (int x = 0; x < classHIGH[i].length; x++) {
								if (pesan.equalsIgnoreCase(classHIGH[i][x])) {
									boking[i] = pesan;
									classHIGH[i][x] = "X";
									total+=hargaHIGH;
									System.out.println();
									System.out.println(">>>Kursi " + pesan
											+ " Berhasil Dipesan<<<");
								}
							}
							System.out.println();
						}
						break;

					case 2:
						System.out
								.println("===================================");
						System.out
								.println("          PEMESANAN TIKET          ");
						System.out
								.println("          GARUDA SURABAYA          ");
						System.out
								.println("          KELAS EKSEKUTIF          ");
						System.out
								.println("===================================");
						System.out.println();
						for (int i = 0; i < classMEDIUM.length; i++) {
							for (int x = 0; x < classMEDIUM[i].length; x++) {
								System.out.print(classMEDIUM[i][x] + "\t");
							}
							System.out.println();
						}
						System.out.println();
						System.out
								.print("Masukan nama kursi yang ingin dipesan : ");
						pesan = sc.next();
						for (int i = 0; i < classMEDIUM.length; i++) {
							for (int x = 0; x < classMEDIUM[i].length; x++) {
								if (pesan.equalsIgnoreCase(classMEDIUM[i][x])) {
									boking[i] = pesan;
									classMEDIUM[i][x] = "X";
									total+=hargaMEDIUM;
									System.out.println();
									System.out.println(">>>Kursi " + pesan
											+ " Berhasil Dipesan<<<");
								}
							}
							System.out.println();
						}
						break;

					case 3:
						System.out.println();
						System.out
								.println("===================================");
						System.out
								.println("          PEMESANAN TIKET          ");
						System.out
								.println("          GARUDA SURABAYA          ");
						System.out
								.println("           KELAS EKONOMI           ");
						System.out
								.println("===================================");
						for (int i = 0; i < classLOW.length; i++) {
							for (int x = 0; x < classLOW[i].length; x++) {
								System.out.print(classLOW[i][x] + "\t");
							}
							System.out.println();
						}
						System.out.println();
						System.out
								.print("Masukan nama kursi yang ingin dipesan : ");
						pesan = sc.next();
						for (int i = 0; i < classLOW.length; i++) {
							for (int x = 0; x < classLOW[i].length; x++) {
								if (pesan.equalsIgnoreCase(classLOW[i][x])) {
									boking[i] = pesan;
									classLOW[i][x] = "X";
									total+=hargaLOW;
									System.out.println();
									System.out.println(">>>Kursi " + pesan
											+ " Berhasil Dipesan<<<");
								}
							}
							System.out.println();
						}
						break;
					}
				} while (pil2 > 4);

				break;

			case 2:
				for (int i = 0; i < classHIGH.length; i++) {
					for (int x = 0; x < classHIGH[i].length; x++) {
						System.out.print(classHIGH[i][x] + "\t");
					}
					System.out.println();
				}
				System.out.println("===================================");
				for (int i = 0; i < classMEDIUM.length; i++) {
					for (int x = 0; x < classMEDIUM[i].length; x++) {
						System.out.print(classMEDIUM[i][x] + "\t");
					}
					System.out.println();
				}
				System.out.println("===================================");
				for (int i = 0; i < classLOW.length; i++) {
					for (int x = 0; x < classLOW[i].length; x++) {
						System.out.print(classLOW[i][x] + "\t");
					}
					System.out.println();
				}
				break;
				
			case 3:
				System.out.println("Total Pembelian : "+total);
				System.out.print("Kursi yang dipesan : ");
				for(int z = 0; z<boking.length; z++){
				System.out.print(boking[z]+" ");
				}
				System.out.println();
			break;
			
			case 4:
			System.exit(0);
			}

		} while (pil1 < 5);
		System.out.println("Pilihan tidak ditemukan !");
	}
}