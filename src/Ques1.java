//Question No.-1

import java.util.Scanner;
import java.io.*;

public class Ques1
{
	public static void main(String[] args) 
	{
		char op = 'y';
		
//		1. Item name   2. Item type    3. Item price    4. Item quantity
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter item name = ");
		String itemName = sc.next();
		System.out.print("Enter item type = ");
		String itemType = sc.next();
		System.out.print("Enter item price = ");
		int itemPrice= sc.nextInt();
		System.out.print("Enter item quantity = ");
		Double itemQuantity = sc.nextDouble();
		
		
		while(op=='y')
		{	
			System.out.println("Item Name = "+itemName+" ");
			System.out.println("Item Price = "+itemPrice+" ");
			if(itemType.equals("Raw"))
			{
				System.out.println("sales tax liability per item = "+(itemPrice)*0.155+" ");
				System.out.println("final price (sales tax + item price = "+(itemPrice)*1.155+" ");
			}
			else
			{
				System.out.println("sales tax liability per item = "+(itemPrice)*0.205+" ");
				System.out.println("final price (sales tax + item price = "+(itemPrice)*1.205+" ");
			}
			
			System.out.print("Do you want to continue(y/n) = ");
			op = sc.next().charAt(0);
			if(op=='n')
				break;	
			else
			{
				Ques1 q =new Ques1();
				q.main(null);
			}
		}
	}

}