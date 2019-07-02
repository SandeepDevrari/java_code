public class Exception_Handling_With_finally{
    void output(){// throws Exception{
        System.out.println("Base");
    }
    public static void main(String[] args){
        Exception_Handling_With_finally e=new Exception_Handling_With_finally();
        
        try{  
           e.output();  
        }//catch(Exception r){  
         //}
        finally{
            System.out.println("Finally Block");
        }
    }
}