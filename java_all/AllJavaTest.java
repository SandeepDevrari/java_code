public class AllJavaTest{
    public AllJavaTest()
    {
        //String temp="["+"\\"+"Q"+"{[(,.?:;|~`!@#$%^&*_+-=<>\\)]}"+"'"+'"'+"\\"+"E"+"]";
        //System.out.println(temp);
        //for(int c=0;c<temp.length();c++)
        //{
        //    System.out.println(temp.charAt(c));
        //}
    }
    
    private void testNum(String nm)
    {
        String tem_card="";
        int sum_total=0;
        Boolean t=false;
        for(int c=0;c<nm.length();c++)
        {
            int num=Character.getNumericValue(nm.charAt(c));
            System.out.println(num);
            if(c%2==0)
            {
                num=num*2;
                String temp_num=Integer.toString(num);
                if(temp_num.length()==2)
                {
                    System.out.println("BE: "+num);
                    num=Character.getNumericValue(temp_num.charAt(0))+Character.getNumericValue(temp_num.charAt(1));
                    System.out.println("AF: "+num);
                }
                
            }
            sum_total+=num;
            tem_card=tem_card+num;
            
        }
        if(sum_total%10==0)
            t=true;
        System.out.println(tem_card+"\n"+sum_total+" status :"+t);
    }
    public static void main(String[] args)
    {
        AllJavaTest obj=new AllJavaTest();
        obj.testNum("123456789");
    }
}