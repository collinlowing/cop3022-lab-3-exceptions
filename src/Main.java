import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int totalMilesDriven = 0;
		int totalGasUsed = 0;
		
		
		while (true)
		{
			try
			{
				totalMilesDriven = Main.getMilesDriven(in);
				totalGasUsed = Main.getGallonsUsed(in);
			}
			catch (NegativeNumberException exp)
			{
				System.out.println(exp.getMessage());
			}
			catch (Exception exp)
			{
				
			}
			finally
			{
				System.out.println("--------------------------------------");
			}
			
		}

	}
	
	public static int getMilesDriven(Scanner in) throws NegativeNumberException
	{
		System.out.print("Enter the number of miles driven");
		
		int input;
		
		input = in.nextInt();
		
		Main.checkIsPositive(input);
		
		return input;
	}
	
	public static int getGallonsUsed(Scanner in) throws NegativeNumberException
	{
		System.out.print("Enter the number of gallons of gas used");
		
		int input;
		
		input = in.nextInt();
		
		Main.checkIsPositive(input);
		
		return input;
	}
	
	public static void checkIsPositive(int input) throws NegativeNumberException
	{
		if(input < 0)
		{
			throw new NegativeNumberException(input + " is negative");
		}
	}

}
