import java.util.*;
public class PencetakNBilGenap{
	public static void main(String [] ray){
	
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("Masukan bilangan n : ");
		n = sc.nextInt();
		int a = 0;
		for(int i=0;i<(n+n);i+=2){
			System.out.println("Bil Genap ke " +(a+1)+ " adalah "+i);
			a++;
		}
	}
}