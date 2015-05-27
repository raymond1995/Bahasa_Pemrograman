import java.util.*;
public class DemoMethod{
	public static void MethodPencarian() {
	int [] data = {10,5,7,9,14};
	Scanner sc = new Scanner (System.in);
	for(int i = 0 ; i<data.length; i++){
	System.out.print(data[i]+" ");
	}
	System.out.println();
	System.out.print("Masukan Data yang ingin dicari : ");
	int cari = sc.nextInt();
	int i = 0;
	  int idx = -1;
	  do{
		 if(data[i]==cari)
			idx=i;
			i++;
	  }while(i<data.length);
	  System.out.println(+idx);	
}

	public static void main (String [] args){
		MethodPencarian();
		}
	}