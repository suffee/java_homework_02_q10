package homework_2_q10;
import java.util.*;
public class homework_2_q10 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		String itemName[]=new String[3]		;				/**設定名稱*/
			
		int itemQuntity[]= new int[3]		;				/**設定數量*/
		
		double itemPrice[]= new double[3]	;				/**設定價錢*/
		double itemTotalPrice[]= new double[3]	;			/**設定價錢*/
		
		int i;										/**變數*/
		double tax,total=0;
													
		for(i=0;i<3;i++){		/**將數據掃描進入陣列*/	
			
			System.out.printf("Please input name of item %d\n",i+1);
			itemName[i] = input.nextLine();

			System.out.printf("Please input quntity of item %d\n",i+1);
			itemQuntity[i] = input.nextInt();
		
			System.out.printf("Please input price of item %d\n",i+1);
			itemPrice[i] = input.nextDouble();
			input.nextLine();								/**避免\n被吸進去*/
		}
			
			System.out.println("Your Bill:");
			System.out.printf("%-20s %5s %8s %9s\n","Item","Quntity","Price","Total");
		
		for(i=0;i<3;i++){
			
			itemTotalPrice[i]=(double)itemQuntity[i]*itemPrice[i];
			total+=itemTotalPrice[i];
			System.out.printf("%-30s %-10d %-8.2f %-8.2f\n",itemName[i],itemQuntity[i],itemPrice[i],itemTotalPrice[i]);
		}	
		tax=(total*125/100);
		
		System.out.printf("%-41s %5.2f\n","Subtotal",total);
		System.out.printf("%-41s %5.2f\n","6.25% sale tax",tax);
		System.out.printf("%-41s %5.2f\n","Total",tax+total);		
		input.close();
	}
}
