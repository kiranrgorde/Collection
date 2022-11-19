package arrayList;

public class Student2 implements Comparable<Student2>
{
    int marks;
    String name;
    int rollno;

    public Student2(int rollno, String name, int marks)
    {

	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
	
    }

    @Override
    public String toString()
    {
	return "Student2 [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
    }

    @Override
    public int compareTo(Student2 s)
    {
	if(this.marks>s.marks)
	    return 1;
	else if(this.marks<s.marks)
	    return -1;
	else
	    return 0;
    }
   
    
}
