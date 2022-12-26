//Question No.-1

import java.util.Scanner;

public class bill {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] itemName = new String[3];
		int[] quantity = new int[3];
		double[] price = new double[3];
		double[] itemTotal = new double[3];
		double[] salesTax = new double[3];
		char[] type = new char[3];
		double[] subTotal = new double[3];
		char choice=0;
		
		int i=0;
		
		do {
			
			System.out.println("Input name of item :");
			itemName[i] = input.next();
			
			System.out.println("Input price of item :");
			price[i] = input.nextDouble();
			
			System.out.println("Input quantity of item : ");
			quantity[i] = input.nextInt();
			
			System.out.println("Input type of item (R/M) : ");
			type[i]=input.next().charAt(0);
			input.nextLine();
			itemTotal[i] = quantity[i] * price[i];
			
			
			
			if(type[i]=='R')
			{
				salesTax[i] = itemTotal[i] * 0.155;
				subTotal[i] = itemTotal[i] + salesTax[i];
			}
			else if (type[i]=='M')
			{
				salesTax[i]=itemTotal[i] * 0.205;
				subTotal[i] = itemTotal[i] + salesTax[i];
			}
			
			i++ ;
			
			System.out.println("Do you want to continue (Y/N) : ");
			choice = input.next().charAt(0);
			
		}while(choice=='Y'||choice=='y');
		
		
		input.close();
		
		//formatting output
		System.out.println("Your bill:");
		System.out.printf("%-30s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Item", "Price", "Quantity","Type","ItemTotal","SalesTax","SubTotal");
		for(i=0;i<3;i++)
		{
		System.out.printf("%-30s %-10.2f %-10d %-10s %-10.2f %-10.2f %-10.2f%n", itemName[i],price[i],quantity[i],type[i],itemTotal[i],salesTax[i],subTotal[i]);
		}
		
	}

}
