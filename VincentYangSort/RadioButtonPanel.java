import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import java.beans.PropertyChangeListener;
//import javax.swing.Action;

public class RadioButtonPanel extends JPanel
{
	public RadioButtonPanel(ActionListener a)
	{
		setLayout(new GridLayout(3, 1, 0, 00));
		JRadioButton j1 = new JRadioButton("Selection", true);
		JRadioButton j2 = new JRadioButton("Bubble", false);
		JRadioButton j3 = new JRadioButton("Insert", false);
		JRadioButton j4 = new JRadioButton("Merge", false);
		JRadioButton j5 = new JRadioButton("Quick", false);
		ButtonGroup group = new ButtonGroup();
		group.add(j1);
		group.add(j2);
		group.add(j3);
		group.add(j4);
		group.add(j5);
		j1.addActionListener(a);
		j2.addActionListener(a);
		j3.addActionListener(a);
		j4.addActionListener(a);
		j5.addActionListener(a);
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
	}

}