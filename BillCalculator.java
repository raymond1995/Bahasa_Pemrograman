import java.util.*;

public class BillCalculator{
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		double sale, taxes, total;
		
		final double Tax_rate = 0.08;
		final double Shipping_fee = 5.00;
		
		System.out.print("Enter the item price : ");
		sale = input.nextDouble();
		taxes = sale*Tax_rate;
		total = sale+taxes;
		System.out.println("Sale: $" +sale);
		System.out.println("Tax: $" +taxes);
		
		if(sale<25.00)
		{
			total+=Shipping_fee;
			System.out.println("Shipping is $5.00"); 
		}
		System.out.println("Final cost: $"+total);
	}
}