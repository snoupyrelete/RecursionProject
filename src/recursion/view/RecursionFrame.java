package recursion.view;

import java.awt.Dimension;

import javax.swing.JFrame;

import recursion.controller.RecursionController;

public class RecursionFrame extends JFrame
{
	private RecursionController baseController;
	private RecursionPanel recursionPanel;
	
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.recursionPanel = new RecursionPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(recursionPanel);
		this.setTitle("Recursion!");
		this.setSize(new Dimension(900, 600));
		this.setVisible(true);
	}
}
