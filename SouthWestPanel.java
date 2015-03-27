import java.awt.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
//import java.beans.PropertyChangeListener;
//import javax.swing.Action;

public class SouthWestPanel extends JPanel
{
	JLabel label;
	static JTextField field;

	public SouthWestPanel(ActionListener a)
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		field = new JTextField("field", 1);
		field.setVisible(true);
		field.addActionListener(a);
		field.setText("0");
		label = new JLabel("Input Here");
		add(label);
		add(field);
	}
	public static String getText()
	{
		return field.getText();
	}

}