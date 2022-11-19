package linkedlistimple;

public class MyClass
{

    public static void main(String[] args)
    {
	MyLinkedList list=new MyLinkedList();
	
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(10);
//	System.out.println(list.toString());
//	
//	System.out.println(list.isEmpty());
//
//	list.clear();
//	System.out.println(list);
	
//	System.out.println(list.size());
	
	//System.out.println(list.contains(10));
	
	//list.remove(1);
//	System.out.println(list);
	//System.out.println(list.get(0));
	//list.set(0, 110);
	list.addAt(5, 100);
	System.out.println(list);
	System.out.println(list.lastIndexOf(10));
	
    }

}
