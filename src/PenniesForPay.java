import java.util.Scanner;

/**
 * 
 * @author Tyler Muldoon
 *Pennies For Pay
 */
public class PenniesForPay 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter the number of days you want to get paid for: ");
		int days = user.nextInt();
		double penny = 0.01;
		double sum = 0;
		for (int i = 0; i < days; i++)
		{
			sum += penny;
			penny = penny * 2;	
		}
		System.out.println("In " + days + " days you earned $" + sum);

	}

}
