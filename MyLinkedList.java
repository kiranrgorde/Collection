package linkedlistimple;

public class MyLinkedList
{
    Node head;

    public void add(int data)
    {

	Node newObj = new Node(data);
	if (head == null)
	{
	    head = newObj;
	} else
	{
	    Node temp = head;
	    while (temp.next != null)
	    {
		temp = temp.next;
	    }
	    temp.next = newObj;
	}

    }

    public String toString()
    {
	Node temp = head;
	String s = "[";
	while (temp != null)
	{
	    if (temp.next != null)
	    {
		s += temp.data + ", ";
	    } else
	    {
		s += temp.data;
	    }
	    temp = temp.next;
	}
	s += "]";
	return s;

    }

    public boolean isEmpty()
    {
	Node temp = head;
	if (temp == null)
	{
	    return true;
	}
	return false;
    }

    public void clear()
    {
	head = null;
    }

    public int size()
    {
	int cnt = 0;
	Node temp = head;

	while (temp != null)
	{
	    cnt++;
	    temp = temp.next;
	}

	return cnt;
    }

    public boolean contains(int i)
    {
	Node temp = head;
	while (temp != null)
	{
	    if (temp.data == i)
	    {
		return true;
	    }
	}

	return false;
    }

    public void remove(int ui)
    {
	Node temp = head;
	int index = 0;
	if (ui < 0)
	{
	    throw new ArrayIndexOutOfBoundsException();
	}
	if (ui == 0)
	{
	    head = head.next;
	    return;
	}
	while (temp.next != null)
	{
	    if (index + 1 == ui)
	    {
		temp.next = temp.next.next;
		return;
	    }
	    index++;
	    temp = temp.next;
	}
	throw new ArrayIndexOutOfBoundsException();

    }

    public int get(int uindex)
    {
	if(uindex<0)
	    throw new ArrayIndexOutOfBoundsException();
	Node temp=head;
	int index=0;
	while(temp!=null)
	{
	    if(index==uindex)
	    {
		return temp.data;
	    }
	    index++;
	    temp=temp.next;
	    
	}
	throw new ArrayIndexOutOfBoundsException();
    }

    public void set(int uindex,int data)
    {
	Node temp=head;
	int index=0;
	while(temp!=null)
	{
	    if(index==uindex)
	    {
		temp.data=data;
		return;
	    }
	    index++;
	    temp=temp.next;
	    
	}
	throw new ArrayIndexOutOfBoundsException();
    }

   
    public void addAt(int uindex, int data)
    {
	Node newObj=new Node(data);
	if(uindex==0)
	{
	    newObj.next=head;
	    head=newObj;
	}
	Node temp=head;
	int index=0;
	while(temp!=null)
	{
	  
	    if(index+1==uindex)
	    {
		newObj.next=temp.next;
		temp.next=newObj;
		return;
	    }
	 
	    index++;
	    temp=temp.next;
	}
    }
    public int lastIndexOf(int data)
    {
	int lastindex=-1;
	int index=0;
	Node temp=head;
	
	while(temp!=null)
	{
	    if(temp.data==data)
	    {
		lastindex=index;
	    }
	    index++;
	    temp=temp.next;
	}
	
	return lastindex;
	
    }


}
