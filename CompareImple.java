package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CompareImple
{

    public static void main(String[] args)
    {
	Student2 s1=new Student2(1, "chetan" , 70);
	Student2 s2=new Student2(2, "vikas" , 80);
	Student2 s3=new Student2(3, "bhavesh" , 90);
	Student2 s4=new Student2(4, "kiran" , 50);

	ArrayList<Student2> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	Collections.sort(al);
	
	for (int i = 0; i < al.size(); i++)
	{
	    System.out.println(al.get(i));
	}

    }

}
