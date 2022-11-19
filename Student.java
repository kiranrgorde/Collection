package arrayList;

public class Student
{
    int marks;
    String name;
    int rollno;

    public Student(int rollno, String name, int marks)
    {

	this.name = name;
	this.rollno = rollno;
	this.marks = marks;
    }

    @Override
    public String toString()
    {
	return "Student [marks=" + marks + ", name=" + name + ", rollno=" + rollno + "]";
	
    }

}
