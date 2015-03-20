import java.util.*;
public class PenjabaranHitungan{
	public static void main (String [] ray){
	Scanner sc = new Scanner (System.in);
	System.out.println();
	System.out.println("||===================||");
	System.out.println("||PENJABARAN HITUNGAN||");
	System.out.println("||===================||");
	System.out.print("Masukan bilangan ke 1 : ");
	int bil1 = sc.nextInt();
	System.out.println();
	System.out.print("Masukan bilangan ke 2 : ");
	int bil2 = sc.nextInt();
	System.out.print("Jadi, "+ bil1 +" x "+ bil2 +" = ");
	int count = 0;
	
	while(count<bil2){
		System.out.print(bil1+"+");
		count++;
	}
	
	}
}