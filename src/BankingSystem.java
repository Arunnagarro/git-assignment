//Question No.-3
//Create a class BankingSystem with a method named transaction() which takes String transactionType as parameter.
//	Create a class UnsupportedTransactionException.
//	In the transaction () method use a switch statement to check if transactionType is of:
//credit, debit, balanceInquiry and pinChange.
//If the transactionType is other than these 4 types then throw UnsupportedTransactionException.
//	Code should effectively handle exception scenario.


import java.util.Scanner;
import java.io.*;

class UnsupportedTransactionException extends Exception
{
    
    @Override
    public String getMessage()
    {
        return "Unsupported Transaction Exception";
    }
}

class BankingSystem
{
	void transaction(String transactionType)
	{
        String expression = transactionType;      
        switch(expression)
        {
            case "Credit": System.out.println("Credit");
            break;
            case "Debit": System.out.println("Debit");
            break;
            case "Balance Inquiry": System.out.println("Balance Inquiry");
            break;
            case "Pin Change": System.out.println("Pin Change");
            break;
            default: try {
                throw new UnsupportedTransactionException();
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
            }
        }
}

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a choice: ");
		String transaction=sc.next();
		
		BankingSystem bs=new BankingSystem();
		bs.transaction(transaction);

	}

}
