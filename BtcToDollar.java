import java.util.Scanner;

public class BtcToDollar 
{
	public static void main (String [] args)
	{
//		оголошуємо змінні
		double btc2doll;
		double dollars;
		double btc1;
		
		Scanner input = new Scanner(System.in);
		
//		запитуємо у користувача вартість біткоїна
		System.out.print("What is bitcoin price today? ");
		btc2doll = input.nextInt();
		
//		запускаємо нескінченний цикл в якому:
		while (true)
		{
//			питаємо у користувача скільки доларів він має
			System.out.print("How much $ do you have? ");		
			dollars = input.nextInt();
			
//			завдяки цьому блоку ми зможемо припинати виконання програми ввівши 0
			if (dollars == 0)
				break;
			
//			рахуємо кількість віткоїнів і виводимо на екран
			btc1 = dollars/btc2doll;
			System.out.println( "You can buy " +btc1+ " BTC");
			
		}	
				
	}
	
}
