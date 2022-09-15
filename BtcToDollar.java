import java.math.BigDecimal;
import java.util.Scanner;

public class BtcToDollar 
{
	public static void main (String [] args)
	{
		double btc2doll;
		double dollars;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is bitcoin price today? ");
		btc2doll = input.nextInt();
		System.out.print("How much $ do you have? ");
		dollars = input.nextInt();
		
		double btc1 = dollars/btc2doll;
		
	
		System.out.println( "You can buy " +btc1+ " BTC");
		
	}
	
}
