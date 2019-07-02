import java.lang.Math;

public class IfElse17{
    float D,r1,r2;
    IfElse17(){
        float a=60f,b=54f,c=53f;
        
        D=(b*b)-(4*a*c);
        
        if(D>0){
            r1=(float)((-b+Math.sqrt(D))/(2*a));
            r2=(float)((-b-Math.sqrt(D))/(2*a));
            System.out.println("R1= "+r1+"\nR2= "+r2);
        }
        else if(D==0){
            r1=(float)((-b)/(2*a));
            r2=r1;
            System.out.println("R1= "+r1+"\nR2= "+r2);
        }
        else{
            float real=(float)(-b/(2*a));
            float imag=(float)(Math.sqrt(-D)/(2*a));
            System.out.println("R1= "+real+"+"+imag+"i\n"+"R2= "+real+"-"+imag+"i");
        }
    }
    public static void main(String[] args)
    {
        IfElse17 ie=new IfElse17();
    }
}