import java.util.*;
public class Random{
	public static void main (String [] argx){
		Scanner sc = new Scanner(System.in);
		int bil_ke = 0;
		int random = 0;
		System.out.print("Masukkan banyaknya bilangan random = ");
		bil_ke = sc.nextInt();
		int total = 0;
		for(int i=0;i<bil_ke;i++){
			random = (int)(Math.random()*10.0);
			System.out.println((i+1)+" = "+random);
			total+=random;
		}
		System.out.println("Total : "+total);
	}
}