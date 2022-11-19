package arrayList;

import java.util.ArrayList;

public class MyClassStud
{

    public static void main(String[] args)
    {

	Student s1=new Student(1, "chetan" , 70);
	Student s2=new Student(2, "vikas" , 80);
	Student s3=new Student(3, "bhavesh" , 90);
	Student s4=new Student(4, "kiran" , 50);

	ArrayList<Student> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	for (int i = 0; i < al.size(); i++)
	{
	    for (int j = i+1; j < al.size(); j++)
	    {
		if(al.get(i).marks>al.get(j).marks)
		{
		    Student temp=al.get(i);
		    al.set(i, al.get(j));
		    al.set(j, temp);
		}
	    }
	    
	}

	for (int i = 0; i < al.size(); i++)
	{
	    System.out.println(al.get(i));
	}
    }

}
