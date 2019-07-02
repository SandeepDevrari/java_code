class Generic_Local<T1,T2>{
    T1 key;
    T2 value;
    
    void set(T1 x,T2 y){
        this.key=x;
        this.value=y;
    }
    T1 getKey(){
        return key;
    }
    T2 getValue(){
        return value;
    }
    
}
public class Generic1{
    public Generic1(){
        System.out.println("Generic Classs uses");
    }
    public static <A,B>boolean compare(Generic_Local<A,B>ob1,Generic_Local<A,B>ob2){
        return (ob1.getKey().equals(ob2.getKey()) && ob1.getValue().equals(ob2.getValue()));
    }
    public static void main(String[] args){
        Generic_Local<String,Integer> g=new Generic_Local<>();
        g.set("Hello",9);
        //System.out.println(g.getKey());
        //System.out.println(g.getValue());
        Generic_Local<String,Integer> g1=new Generic_Local<>();
        g.set("Hello",9);
        System.out.println(Generic1.compare(g,g1));
    }
}