import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class SortFrame extends JFrame
{

	public SortFrame(String title)
	{
		super(title);

		try
	    {
   		//	UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}
		catch(Exception ex)
		{
			System.out.println("That is not a valid Look and Feel");
		}
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//make panels here
		InputPanel in = new InputPanel();
		ButtonPanel but = new ButtonPanel();
		CenterPanel cent = new CenterPanel();

		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		in.setBackground(Color.WHITE);
		cent.setBackground(Color.WHITE);
		but.setBackground(Color.WHITE);
		c.add(in, BorderLayout.WEST);
		c.add(but, BorderLayout.SOUTH);
		c.add(cent, BorderLayout.CENTER);
		setResizable(true);
		setVisible(true);
	}
}