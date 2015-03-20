public class BintangPrinter{
	public static void main (String [] argx){
		for(int i = 6;i>0;i--){
			for(int j = 1;j<=i;j++){
				if(j>5){
					for(int h=1;h<=j;h++){
					System.out.println("*");
					}
				}
				System.out.print("*");
			}
				System.out.println("*");
		}
	}
}