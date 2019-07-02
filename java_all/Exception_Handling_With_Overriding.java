public class Exception_Handling_With_Overriding extends Exception_Handling_With_Overriding01{
    void output() throws Exception{
        System.out.println("Base");
    }
    public static void main(String[] args){
        Exception_Handling_With_Overriding e=new Exception_Handling_With_Overriding();
        
        try{  
           e.output();  
        }catch(Exception r){  
        }  
    }
}
class Exception_Handling_With_Overriding01{
    void output() throws Exception {
        System.out.println("Base");
    }
}