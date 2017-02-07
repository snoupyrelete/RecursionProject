package recursion.controller;

import javax.swing.JOptionPane;
import recursion.view.RecursionFrame;
import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;
import recursion.model.Timer;

public class RecursionController 
{
	private RecursionTool recursionTool;
	private RecursionFrame recursionFrame;
	private Timer mathTimer;
	
	RecursionController()
	{
		this.recursionTool = new RecursionTool();
		this.mathTimer = new Timer();
		this.recursionFrame = new RecursionFrame(this);
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		mathTimer.startTimer();
		if(isValid(value))
		{
			factorialResponse += recursionTool.calculateFactorial(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		return factorialResponse;
	}
	
	public String transferFibonacci(String value)
	{
		String fibonacciResponse = "The fibonacci value of " + value + " is: ";
		mathTimer.startTimer();
		if(isValid(value))
		{
			fibonacciResponse += recursionTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		return fibonacciResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
			if (test >= 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(recursionFrame, "Type in a valid integer!");
			return false;
		}
	}
	
	public void start()
	{
	
	}
}