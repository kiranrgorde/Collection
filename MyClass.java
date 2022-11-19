package linkedhashmap;

public class MyClass
{

    public static void main(String[] args)
    {

        MyLinkedHashMap obj=new MyLinkedHashMap();
        
        obj.put(13,"abcd");
        obj.put(56,"gtfr");
        obj.put(98,"tyui");
        obj.put(43,"aqws");
        obj.put(76,"gnlp");
        obj.put(83,"yhun");
        obj.put(26,"tfgr");
        obj.put(78,"rfgb");
        obj.put(65,"milp");
        
        obj.print();
        System.out.println(obj.get(98));

    }

}
