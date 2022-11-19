package arrayList;

import java.util.*;
public class SwapList
{
	public static void main(String[] args) 
	{
		
	    List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		System.out.println(list);
		for(int element1 = 0; element1 < list.size(); element1++)
		{
			for(int element2 = 0; element2 < list.size(); element2++)
			{
				Collections.swap(list, element1, element2);
			}
		}
		System.out.println("After swapping");
		System.out.println(list);
	}
}

