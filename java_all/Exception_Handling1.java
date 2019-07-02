public class Exception_Handling1{
    Exception_Handling1(){
        String str="abc";
        try{
            System.out.println("hello");
            
            for(int i=0;i<=str.length();i++){
                System.out.print(str.substring(i-1,i));
            int g=3/0;
            }
            
        }catch(Exception se){
            System.out.println("problem: "+se.getMessage());
        }
        //catch(ArithmeticException r){
        //    System.out.println("problem: "+r.getMessage());
        //}
        //catch(StringIndexOutOfBoundsException s){
        //    System.out.println("this is the problem: "+s.getMessage());
        //}
        //finally{
            System.out.println("hello");
        //    str=null;
        //}
        
    }
    public static void main(String[] args){
        Exception_Handling1 eh=new Exception_Handling1();
    }
}