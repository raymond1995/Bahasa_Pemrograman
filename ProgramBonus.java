import java.util.Scanner;

public class ProgramBonus {
  public static void main (String [] ray) {
    
    Scanner input = new Scanner(System.in);
    int jmlkaos;
    int jmlbonus;
    int jml;
    
    System.out.println("==========================");
    System.out.println("||   HITUNG BAYAR KAOS  ||");
    System.out.println("||   PROMO 2 GRATIS 1   ||");
    System.out.println("==========================");
    System.out.print("Masukan jumlah kaos yang ingin dibeli : ");
    jmlkaos = input.nextInt();
    
    jmlbonus = jmlkaos+(jmlkaos/2);
    jml = jmlkaos+jmlbonus;
    
    System.out.println("Jumlah kaos yang dibeli : "+jmlkaos);
    System.out.println("Jumlah bonus kaos yang didapat : "+jmlbonus);
    System.out.println("Total seluruh kaos : "+jml);
  }
}