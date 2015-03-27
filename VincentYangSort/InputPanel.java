import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.AbstractButton;

public class InputPanel extends JPanel implements ActionListener
{
	JTextField field;
	SouthWestPanel southWest;
	IntegFractionPanel integFractionButtons;
	JLabel label;
	RadioButtonPanel radioButtons;
	CenterPanel center;
	public static final int BUBBLE_SORT = 1;
	public static final int INSERTION_SORT = 0;
	public static final int SELECTION_SORT = -1;
	public static final int MERGE_SORT = 2;
	public static final int QUICK_SORT = 3;

	public InputPanel()
	{
		super();
		center = new CenterPanel();
		//add widgets
		setLayout(new GridLayout(3, 1, 0, 00));
		radioButtons = new RadioButtonPanel(this);
		add(radioButtons);
		southWest = new SouthWestPanel(this);
		add(southWest);
		integFractionButtons = new IntegFractionPanel(this);
		add(integFractionButtons);
	}
	public void actionPerformed(ActionEvent e)
	{
	//	System.out.println("reached");
		if (e.getActionCommand().equals("Selection"))
		{
			center.setSort(SELECTION_SORT);
		}
		else if (e.getActionCommand().equals("Bubble"))
		{
			center.setSort(BUBBLE_SORT);
		}
		else if (e.getActionCommand().equals("Insert"))
		{
			center.setSort(INSERTION_SORT);
		}
		else if (e.getActionCommand().equals("Integers"))
		{
			center.setFractTrue(false);
		}
		else if (e.getActionCommand().equals("Fractions"))
		{
			center.setFractTrue(true);
		}
		else if (e.getActionCommand().equals("Merge"))
		{
			center.setSort(MERGE_SORT);
		}
		else if (e.getActionCommand().equals("Quick"))
		{
			center.setSort(QUICK_SORT);
		}
		else
		{
		//	System.out.println("fields text is " + field.getText());

			String input;
			Integer integ = 0;
			try
			{
				input = SouthWestPanel.getText();
				integ = new Integer(input);
			}
			catch(Exception ex)
			{

			}

			int in = integ.intValue();
			center.setNumInputs(in);
		}
	}
	public static int getInput()
	{
		String input;
		Integer integ = 0;
		try
		{

			input = SouthWestPanel.getText();
			integ = new Integer(input);
		}
		catch(Exception ex)
		{

		}
		System.out.println("integ is " + integ.intValue());
		return integ.intValue();
	}
}