public class Database {
	public static final String[] DBbarangID = { "ADW01", "ADI02", "ADR01",
			"AFI01", "AGS01" };

	public static final String[] DBbarangNAMA = { "Kapsul Minyak Ikan Salmon",
			"Madu Sweet Kaliandra 300 ml", "Cing Cing Al Biruni 100 ml",
			"STOP Ngompol For Kids Al", "Madu Bunga Randu Plus Al Wadey" };

	public static final String[] DBbarangHARGA = { "69000", "180000", "50000",
			"100000", "45000" };

	public static void menuLogin() {
		System.out.println();
		System.out.println("==========================");
		System.out.println("|| PLEASE, LOGIN FIRST  ||");
		System.out.println("==========================");
		System.out.println();
	}

	public static void menukasir() {
		System.out.println("============================================");
		System.out.println("                   KASIR ZONE               ");
		System.out.println("============================================");
		System.out.println("1. Penjualan");
		System.out.println("2. Log Out");
		System.out.println("============================================");
		System.out.print("Masukkan menu pilihan anda (1-2) : ");
	}

	public static void menuadmin() {
		System.out.println("============================================");
		System.out.println("                 ADMIN ZONE                 ");
		System.out.println("============================================");
		System.out.println("1. Manage Barang");
		System.out.println("2. Manage User Kasir");
		System.out.println("3. Report");
		System.out.println("4. Log Out");
		System.out.println("============================================");
		System.out.print("Masukkan menu pilihan anda (1-4) : ");
	}
}