import java.util.*;

public class PelemparKoin{
 public static void main (String args[]){
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Masukan Angka anda (0: Angka; 1: Gambar): ");
  int angka = input.nextInt();
  
  int bilRandom = (int) (Math.random()+0.5);
  System.out.print("Komputer Menghasilkan ");
  if(bilRandom==1){
   System.out.println("GAMBAR");
  }
  else{
   System.out.println("Angka");
  }
  if(angka==bilRandom){
   System.out.println("Selamat Anda Menang");
  }
  else{
   System.out.println("Selamat Anda Kalah");
  }
 }
}