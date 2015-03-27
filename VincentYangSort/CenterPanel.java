import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.lang.*;

public class CenterPanel extends JPanel
{
	private static boolean fractTrue;
	static JTextArea area;
	static ArrayList<Comparable> listNums;
	public static final int BUBBLE_SORT = 1;
	public static final int INSERTION_SORT = 0;
	public static final int SELECTION_SORT = -1;
	public static final int MERGE_SORT = 2;
	public static final int QUICK_SORT = 3;
	public static int currentSort = -1;
	private Sort sort;

	public CenterPanel()
	{

		super();
		sort = new Sort();
		fractTrue = false;
		area = new JTextArea();
		setLayout(new GridLayout(1, 1, 0, 00));
		JScrollPane scroll = new JScrollPane(area);
		scroll.setBackground(Color.WHITE);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		//set wrapping
		area.setLineWrap(true);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		add(scroll);
	//	JScrollPane.setText("fdsafdsa");
	}
	public static void setSort(int sort)
	{
		currentSort = sort;
	}
	public static void setFractTrue(boolean set)
	{
		fractTrue = set;
	}
	public void setNumInputs(int in)
	{
		listNums = new ArrayList<Comparable>(in);
		//integers
		if (!fractTrue)
		{
			for (int i = 0; i < in; i++)
			{
				listNums.add(new Integer((int)(Math.random()*100)));
			}
		}
		else
		{
			for (int i = 0; i < in; i++)
			{
				listNums.add(new Fraction((int)(Math.random()*100), (int)(Math.random()*100)));
			}
		}
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < listNums.size(); i++)
		{
			builder.append(listNums.get(i) + " ");
		}
		area.setText(builder.toString());
	}
	public void sort()
	{
		String[] temp = area.getText().split(" ");
		boolean skip = false;
		ArrayList<Comparable> comparables = new ArrayList<Comparable>(temp.length);
		//initialize comparables
		try
		{
			for (int i = 0; i <  temp.length; i++)
			{
				if (!fractTrue)
					comparables.add(new Integer(temp[i]));
				else
					comparables.add(new Fraction(new Integer(temp[i].substring(0, temp[i].indexOf("/"))), new Integer(temp[i].substring(temp[i].indexOf("/") + 1))));
			}
		}
		catch(Exception ex)
		{
			skip = true;
		}
		if (!skip)
		{

			sort.sort(comparables, currentSort);
		//	for(int i = 0; i < comparables.size(); i++)
		//	{
		//		listNums.set(i, comparables.get(i));
		//	}
			StringBuilder builder = new StringBuilder();

			for (int i = 0; i < comparables.size(); i++)
			{
				builder.append(comparables.get(i)+ " ");
			}
			area.setText(builder.toString());
			area.repaint();
		}
	}
	public void randomize()
	{
		setNumInputs(InputPanel.getInput());
	}
}