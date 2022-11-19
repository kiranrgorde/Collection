package arrayList;

public class Student3
{
    int marks;
    String name;
    int rollno;

    public Student3(int rollno, String name, int marks)
    {

	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
	
    }

    @Override
    public String toString()
    {
	return "Student3 [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
    }


}
