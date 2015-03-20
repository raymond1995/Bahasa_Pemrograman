import java.util.Scanner;

public class HitungBayarKaos {
  public static void main (String [] ray) {
    
    Scanner input = new Scanner(System.in);
    int hrgkaos = 25000;
    int jmlbeli;
    int jmlbonus;
    int jmlkaos;
    int jml;
    int totalasli;
    int totalsemua;
    
    System.out.println("==========================");
    System.out.println("||   HITUNG BAYAR KAOS  ||");
    System.out.println("||   PROMO 2 GRATIS 1   ||");
    System.out.println("==========================");
    System.out.println("Harga @Kaos = Rp 25.000,-");
    
    System.out.print("Masukan jumlah kaos yang ingin dibeli : ");
    jmlkaos = input.nextInt();
    
    jmlbonus = jmlkaos/2;
    jml = jmlkaos+jmlbonus;
    totalasli = jmlkaos*hrgkaos;
    totalsemua = jml*hrgkaos;
    
    System.out.println("Jumlah kaos yang dibeli : "+jmlkaos);
    System.out.println("Harga bayar :"+totalasli);
    System.out.println("Bonus kaos yang didapatkan : "+jmlbonus);
    System.out.println("Total kaos : "+(jmlkaos+jmlbonus));
    
  }
}