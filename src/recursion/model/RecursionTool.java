package recursion.model;

public class RecursionTool
{
	
	/**
	 * Recursive solution
	 * @param currentNumber the number to calculate the factorial of
	 * @return the result of the factorial
	 */
	public int calculateFactorial(int currentNumber)
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
	
	
}

