package arrayList;

import java.util.Comparator;

public class Abcd implements Comparator<Student3>
{

    @Override
    public int compare(Student3 s1, Student3 s2)
    {

	if(s1.marks>s2.marks)
	    return 1;
	else if(s1.marks<s2.marks)
	    return -1;
	else
	    return 0;
    }

}
