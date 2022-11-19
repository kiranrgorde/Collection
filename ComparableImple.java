package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableImple
{

    public static void main(String[] args)
    {
	Student3 s1=new Student3(1, "somu" , 89);
	Student3 s2=new Student3(2, "gomu" , 80);
	Student3 s3=new Student3(3, "somya" , 95);
	Student3 s4=new Student3(4, "gomya" , 50);

	ArrayList<Student3> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	Collections.sort(al,new Abcd());
	
	for (int i = 0; i < al.size(); i++)
	{
	    System.out.println(al.get(i));
	}


    }

}
