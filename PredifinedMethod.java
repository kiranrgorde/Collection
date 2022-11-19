package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PredifinedMethod
{
    public static void main(String[] args)
    {
	List<String> list=new ArrayList<>();
	list.add("Red");
	list.add("Black");
	list.add("Blue");
	list.add("Yellow");
	
	/*System.out.println(list);
	//normal for loop
	for (int i = 0; i < list.size(); i++)
	{
	  //System.out.print(list.get(i)+" ");
	}
	//System.out.println();
	
	//using for each loop
	for (String string : list)
	{
	    //System.out.print(string+" ");
	}
	System.out.println();
	
	//using iterator
	Iterator<String> it = list.iterator();
	
	while (it.hasNext())
	{
	   // System.out.print(it.next()+" ");
	    
	}*/
	
	List<Integer> list1=new ArrayList<>();
	
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	//at a specified index
	System.out.println(list1.get(2));
	
	//update specific array element
	list1.set(1, 100);
	
	//shuffle array list
	Collections.shuffle(list1);
	System.out.println(list1);
	
	//remove third element
	list1.remove(2);
	System.out.println(list1);
	
	//sort an array list
	Collections.sort(list1);
	
	//reverse array list
	Collections.reverse(list1);
	
	//copy one array list into another
	
	List<Integer> list2=new ArrayList<>(list1);
	System.out.println(list2);
	
    }
}
