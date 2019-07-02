//implementation of Stack in java
import java.util.*;
class Stack{
    ArrayList<String>stack;
    int top;
    Stack()
    {
        this.stack=new ArrayList<String>();
        this.top=-1;
    }
    void push(String d)
    {
        if(this.top==-1)
        {
            this.top=0;
            this.stack.add(this.top,d);
        }
        else
        {
            this.top+=1;
            this.stack.add(this.top,d);
        }
    }
    void pop()
    {
        if(this.top==-1)
        {
            //
        }
        else
        {
            this.stack.remove(this.top);
            this.top-=1;
        }
        
    }
    void show()
    {
        Iterator itt=this.stack.iterator();
        while(itt.hasNext())
        {
            System.out.print(itt.next()+" ");
        }
    }
}
class ImplyStack
{
    public static void main(String args[])
    {
        Stack st=new Stack();
        st.push(""+23);
        st.push(""+24);
        st.push(""+25);
        st.show();
        System.out.println(" ");
        st.pop();
        st.show();
        System.out.println(" ");
        st.pop();
        st.show();
        System.out.println(" ");
    }
}