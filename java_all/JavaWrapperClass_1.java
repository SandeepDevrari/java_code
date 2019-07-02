public class JavaWrapperClass_1{  
    public static void main(String args[]){  
        int a=20;  
        Integer i=Integer.valueOf(a);  
        Integer j=a;
        
        System.out.println(a);
        System.out.println(i);
        System.out.println(j);
        
        Integer b=new Integer(3);    
        int k=b.intValue();  
        int l=b;
        System.out.println(b);
        System.out.println(k);
        System.out.println(l);
        
        String number = "10";
        int result = Integer.parseInt(number);
        System.out.println(result);
        
        Integer re = Integer.valueOf(number);
        System.out.println(re);
        Character ch = 'a';
        System.out.println(ch);
        Integer ii = new Integer(-8);

        System.out.println(ii);
        
        Double pi =3.14;
        System.out.println("pi = " + pi);
        
    }
}  