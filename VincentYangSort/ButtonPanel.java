import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonPanel extends JPanel implements ActionListener
{
	CenterPanel center;
	public ButtonPanel()
	{
		setLayout(new GridLayout(1, 2, 0, 00));
		center = new CenterPanel();
		JButton list = new JButton("Randomize List");
		JButton sort = new JButton("Sort");
		list.addActionListener(this);
		sort.addActionListener(this);
		add(list);
		add(sort);
	}
	public void actionPerformed(ActionEvent e)
	{
		if (e.getActionCommand().equals("Sort"))
		{
			center.sort();
		}
		else if (e.getActionCommand().equals("Randomize List"))
		{
			center.randomize();
		}
	}
}