package arrayList;

import java.util.Iterator;

public class MyArraylist<T>
{
    private Object[] a = new Object[5];
    private int index = 0;

    public void add(T data)
    {
	if(index>=a.length)
	{
	    grow();
	}
	a[index++]=data;
    }

    private void grow()
    {
	Object[]b=new Object[a.length*2];
	
	for (int i = 0; i < a.length; i++)
	{
	    b[i]=a[i];
	}
	a=b;
    }
    
    public String toString()
    {
	String s="[";
	
	for (int i = 0; i < index; i++)
	{
	    if(i<index-1)
		s+=a[i]+", ";
	    else
		s+=a[i];
	}
	s+="]";
	
	
	return s;
	
    }
    public void remove(int userindex)
    {
	if(userindex<0 || userindex>=index)
	{
	    System.out.println("out of range");
	    System.exit(0);
	}
	for (int i = userindex; i < index-1; i++)
	{
	    a[i]=a[i+1];
	}
	index--;
    }
    public Object[] toArray()
    {
	Object[]temp=new Object[index];
	for (int i = 0; i < temp.length; i++)
	{
	   temp[i]=a[i];
	    
	}
	return temp;
    }
    public Object get(int ui)
    {
	if(ui<0 || ui>=index)
	{
	    throw new ArrayIndexOutOfBoundsException();
	}
	return a[ui];
    }

    public void clear()
    {

	Object[] temp=new Object[0];
	
	a=temp;
	index=0;
	
	
    }

    public void set(int ui, T data)
    {

	if(ui<0 || ui>=index)
	{
	    throw new ArrayIndexOutOfBoundsException();
	}
	a[ui]=data;
	
    }
    public Object clone()
    {
	MyArraylist<Object> temp=new MyArraylist<Object>();
	for (int i = 0; i < index; i++)
	{
	     temp.add(a[i]);
	    
	}
	return temp;
    }

    public void addAt(int ui, T data)
    {
	if(ui<0 || ui> index)
	{
	    throw new ArrayIndexOutOfBoundsException();
	}
	if(index==a.length)
	    grow();
	
	for (int i = index; i > ui; i--)
	{
	    a[i]=a[i-1];
	}
	a[ui]=data;
	index++;
	
    }
}
