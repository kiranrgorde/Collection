package linkedhashmap;

public class MyLinkedHashMap
{
    Node[] a=new Node[5];
    Node llroot;
    
    public void put(int key,String value)
    {
	Node obj=new Node(key,value);
	
	if(addhashtable(obj))
	    addlinketable(obj);
	  
    }
    public String get(int key)
    {
	int index=key%a.length;
	Node root=a[index];
	
	while(root!=null)
	{
	    if(root.key==key)
		return root.value;
	    
	    root=root.hashmapnext;
	}
	
	return null;
	
    }

    private void addlinketable(Node obj)
    {
	
	if(llroot==null)
	{
	    llroot=obj;
	    
	}
	else
	{
	    Node temp=llroot;
	    while(temp.linkedhashtable!=null)
	    {
		temp=temp.linkedhashtable;
	    }
	    temp.linkedhashtable=obj;
	}
	
    }

    private boolean addhashtable(Node obj)
    {
	int index=obj.key%a.length;
	Node root=a[index];
	
	if(root==null)
	{
	    a[index]=obj;
	    
	}
	else
	{
	    while(root.hashmapnext!=null)
	    {
		if(root.key==obj.key)
		{
		    root.value=obj.value;
		    return false;
		}
		root=root.hashmapnext;
	    }
	    root.hashmapnext=obj;
	}
	
	return true;
    }

    public void print()
    {
	Node temp=llroot;
	while(temp!=null)
	{
	    System.out.println(temp.key+ " "+temp.value);
	    temp=temp.linkedhashtable;
	}
    }
   
}
