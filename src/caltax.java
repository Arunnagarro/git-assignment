//Question No.-1

import java.util.Scanner;
import java.io.*;

public class caltax 
{
	public static void main(String[] args) 
	{
//		1. Item name   2. Item type    3. Item price    4. Item quantity
		char op = 'y';
		Scanner sc = new Scanner(System.in);
		
		while(op=='y')
		{	
			System.out.println("Item Name = "+args[0]+" ");
			System.out.println("Item Price = "+args[2]+" ");
			if(args[1].equals("Raw"))
			{
				System.out.println("sales tax liability per item = "+Double.parseDouble(args[2])*0.155+" ");
				System.out.println("final price (sales tax + item price = "+Double.parseDouble(args[2])*1.155+" ");
			}
			else
			{
				System.out.println("sales tax liability per item = "+Double.parseDouble(args[2])*0.205+" ");
				System.out.println("final price (sales tax + item price = "+Double.parseDouble(args[2])*1.205+" ");
			}
			System.out.print("Do you want to continue(y/n) = ");
			op = sc.next().charAt(0);
			if(op=='n')
				break;
			System.out.print("Enter item name = ");
			args[0] = sc.next();
			System.out.print("Enter item type = ");
			args[1] = sc.next();
			System.out.print("Enter item price = ");
			args[2] = sc.next();
			System.out.print("Enter item quantity = ");
			args[3] = sc.next();
		}
	}

}