package arrayList;

import java.util.*;
public class Demo1 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })	
	public static void main(String[] args) 
	{
		//al.23
		ArrayList arr = new ArrayList();
        arr.add("some");
        arr.add("hi");
        arr.add("hello");
        arr.add("world");
        try {
            for (int i = 0; i < 3; i++) {
                arr.get(i);
            }
            System.out.print(arr);
        } catch (IndexOutOfBoundsException e) {
            System.out.print("index error");
        }
    }
}
