import java.util.*;
public class SumAvgMinMax{
  public static void main (String [] ray){
    Scanner sc = new Scanner(System.in);
	System.out.println();
    System.out.print("Masukan jumlah data : ");
    int max = 0;
    int min = 1000;
    double rata2 = 0.0;
    
    int jmlData = sc.nextInt();
    int sum = 0;
    int count = 0;
	int data[] = new int[jmlData];
	int i = 0;
    while (count<jmlData){
		System.out.print("Masukan data ke "+(count+1)+" : ");
		data[i] = sc.nextInt();
		if(data[i]<min){
			min=data[i];
		}else if(data[i]>max){
			max=data[i];
		}
		sum+=data[i];
		count++;
    }
    rata2 = (double)sum/(double)jmlData;
	System.out.println();
    System.out.println("SUM = "+sum);
    System.out.println("AVG = "+sum/jmlData);
    System.out.println("MAX = "+max);
    System.out.println("MIN = "+min);
  }
}