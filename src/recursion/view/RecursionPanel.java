package recursion.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import recursion.controller.RecursionController;


public class RecursionPanel extends JPanel
{
	private JTextField inputField;
	private JTextArea resultsArea;
	private JButton fibButton;
	private JButton factButton;
	private SpringLayout baseLayout;
	private RecursionController baseController;
	
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseLayout = new SpringLayout();
		this.inputField = new JTextField("Input");
		this.resultsArea = new JTextArea("Results");
		this.fibButton = new JButton("FIB");
		this.factButton = new JButton("FACT");
		this.baseController = baseController;
		
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
		baseLayout.putConstraint(SpringLayout.WEST, inputField, 31, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, factButton, 31, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, 0, SpringLayout.EAST, fibButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -26, SpringLayout.NORTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 31, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, 0, SpringLayout.EAST, inputField);
	}
	
	
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsArea.setText(baseController.transferFactorial(inputField.getText()));
			}
		});
		
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				resultsArea.setText("");
			}
		});
		
	}
}
