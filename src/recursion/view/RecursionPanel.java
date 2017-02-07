package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;


public class RecursionPanel extends JPanel
{
	private JTextField inputField;
	private JTextArea resultsArea;
	private JButton fibButton;
	private JButton factButton;
	private SpringLayout baseLayout;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseLayout = new SpringLayout();
		this.inputField = new JTextField("Input");
		this.resultsArea = new JTextArea("Results");
		this.fibButton = new JButton("FIB");
		this.factButton = new JButton("FACT");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(inputField);
		this.add(resultsArea);
		this.add(factButton);
		this.add(fibButton);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 227, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, resultsArea, -21, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 6, SpringLayout.EAST, factButton);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -26, SpringLayout.NORTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 0, SpringLayout.WEST, inputField);
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 31, SpringLayout.WEST, this);
	}
	
	
	private void setupListeners()
	{
		
	}
}
