import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.beans.PropertyChangeListener;
//import javax.swing.Action;

public class IntegFractionPanel extends JPanel
{
	public IntegFractionPanel(ActionListener a)
	{
		setLayout(new GridLayout(2, 1, 0, 00));
		JRadioButton j1 = new JRadioButton("Integers", true);
		JRadioButton j2 = new JRadioButton("Fractions", false);
	//	JRadioButton j3 = new JRadioButton("Insert", false);
		ButtonGroup group = new ButtonGroup();
		group.add(j1);
		group.add(j2);
	//	group.add(j3);
		j1.addActionListener(a);
		j2.addActionListener(a);
	//	j3.addActionListener(a);
		add(j1);
		add(j2);
	//	add(j3);
	}

}