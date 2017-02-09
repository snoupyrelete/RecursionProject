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
		int a = 0;
        int b = 1;
        // In N steps compute Fibonacci sequence iteratively.
        for (int i = 0; i < currentNumber; i++)
        {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a;
	}
	
	public double calcFactIter(int number)
	{
		int factor = 1;
        //Runs loop and multiplies factor each time runned     
        for (int i=1; i<=number; i++) {
            factor = factor*i;
        }
        
        return factor;
	}
}

