import java.util.ArrayList;

public class Tester
{
	public static void main (String[] args)
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		list.add(new Integer(9));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(5));

		Sort sort = new Sort();
		sort.selectionSort(list);
		for (int i = 0; i < list.size(); i++)
		{
			System.out.print(list.get(i));
		}
	}
}