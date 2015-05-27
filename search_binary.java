public class search_binary {

    public static void main(String[] args) {
        int N = 8;
        int A [] = {2, 5, 3, 8, 1, 6, 7, 9};
        int BatasAtas, BatasBawah, Tengah;
        int cari = 10;
        BatasAtas = 0;
        BatasBawah = N - 1;
        Tengah = 0;
        boolean ketemu;
        ketemu = false;
       
        while((BatasAtas <= BatasBawah) && (ketemu == false)){
           
            Tengah = (BatasAtas + BatasBawah)/2;
            if (A[Tengah] == cari){
                ketemu = true;
            } else
                if (A[Tengah] <= cari){
                BatasAtas = Tengah + 1;
            } else {
                BatasBawah = Tengah - 1;
            }
        }
    if (ketemu) {
            System.out.println("Angka : "+ cari + " Data berada di index nomor " + Tengah);
        } else {
            System.out.println("Angka : "+ cari +" Data tidak ditemukan");
        }
        }
    }