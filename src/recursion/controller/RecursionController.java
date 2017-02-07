package recursion.controller;

import javax.swing.JOptionPane;
import recursion.view.RecursionFrame;
import recursion.model.RecursionTool;
import recursion.view.RecursionFrame;


public class RecursionController 
{
	private RecursionTool recursionTool;
	private RecursionFrame recursionFrame;
	
	RecursionController()
	{
		this.recursionFrame = new RecursionFrame(this);
		this.recursionTool = new RecursionTool();
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "";
		if(isValid(value))
		{
			factorialResponse += recursionTool.calculateFactorial(Integer.parseInt(value));
		}
		
		return factorialResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			int test = Integer.parseInt(current);
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