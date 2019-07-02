import java.util.*;
class Node
{
    int data;
    Node link;
    
    Node(int d)
    {
        this.data=d;
        this.link=null;
    }
    void setLink(Node l)
    {
        this.link=l;
    }
    int getData()
    {
        return this.data;
    }
    Node getLink()
    {
        return this.link;
    }
}
class List{
    Node start,end;
    Scanner s;
    char ch='Y';
    protected List()
    {
        this.start=null;
        this.end=null;
        dothis();
    }
    private void insertEnd(int d)
    {
        Node temp=new Node(d);
        if(start==null)
        {
            start=temp;
            end=temp;
        }
        else
        {
            //Node tem=end;
            /*do
            {
                tem=tem.getLink();
            }while(tem!=null);*/
            end.setLink(temp);
            end=temp;
        }
    }
    private void insertFirst(int d)
    {
        Node temp=new Node(d);
        if(start==null)
        {
            start=temp;
            end=temp;
        }
        else
        {
            Node tem=start;
            start=temp;
            start.setLink(tem);
        }
    }
    private void insertMiddle(int data,int pos)
    {
        Node temp=new Node(data);
        if(start==null)
        {
            start=temp;
            end=temp;
        }
        else
        {
            Node tem=start,pre=null;
            pos--;
            do
            {
                pre=tem;
                tem=tem.getLink();
                pos--;
            }while(pos!=0);
            pre.setLink(temp);
            temp.setLink(tem);
        }
    }
    private void showData()
    {
        Node temp=start;
        do{
            System.out.print(temp.getData()+" ");
            temp=temp.getLink();
        }while(temp!=null);
        System.out.println(" ");
    }
    public void userData(){
        System.out.print("Enter data: ");
        int data=s.nextInt();
        //Node tep=new Node(data);
        if(start==null)
        {
            insertFirst(data);
        }
        else{
            insertEnd(data);
        }
        System.out.print("Y/N: ");
        ch=s.next().charAt(0);
    }
    public void dothis()
    {
        s=new Scanner(System.in);
        while(ch!='N')
        {
            userData();
        }
        if(ch=='N')
            showData();
    }
    public static void main(String args[])
    {
        List ll=new List();
        //ll.
        //ll.insertFirst(11);
        //ll.insertEnd(20);
        //ll.insertMiddle(14,2);
        //ll.showData();
    }
}