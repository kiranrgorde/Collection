package arrayList;

import java.util.Arrays;

public class User
{

    public static void main(String[] args)
    {
	MyArraylist<Integer> list=new MyArraylist<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	/*
	 * System.out.println(list); list.toArray(); Object[] b=list.toArray();
	 * System.out.println(Arrays.toString(b));
	 */
	//System.out.println(list.get(4));
	
	//list.clear()

	//list.set(5,100);
	
	//Object clone=list.clone();
	//System.out.println(clone);
	
	list.addAt(6,100);
	System.out.println(list);
    }

}
