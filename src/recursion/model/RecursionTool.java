package recursion.model;

public class RecursionTool
{
	
	/**
	 * Recursive solution
	 * @param currentNumber the number to calculate the factorial of
	 * @return the result of the factorial
	 */
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else 
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public int calculateFibonacciIterative(int currentNumber)
	{
		
	}
	
	public double calcFactIter()
	{
		
	}
}

