import java.util.*;

public class CheckBentukAir{
	public static void main (String args []){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan temperatur Air(dalam celcius)= ");
		int tempAir = input.nextInt();
		String bentukAir="";
		if((tempAir>=-50) && (tempAir<0))
		{
			bentukAir="Padat";
		}else if((tempAir>=0)&&(tempAir<100))
		{
			bentukAir="Cair";
		}else
		{
			bentukAir="Gas";
		}
		System.out.println("Air dalam suhu "+ tempAir + " derajat celcius berbentuk "+bentukAir);
		
	}
}