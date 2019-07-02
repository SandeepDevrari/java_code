public class String_finder{
    public String_finder(String str){
        String j="";
        char[] c_array=str.toCharArray();
        for(char t:c_array){
            if((t>=48 && t<=57)||(t>=65 && t<=90)||(t>=97 && t<=123)){
                if((t>=65 && t<=90)||(t>=97 && t<=123)){
                    j=j+1;
                    //System.out.print(t+"*"+j);
                }
                if((t>=48 && t<=57)){
                    j=j+2;
                    //System.out.print(t+"*"+j);
                }
            }
            else{
                j=j+3;
                //System.out.print(t+"*"+j);
            }
        }
        if(j.contains("1") && j.contains("2") &&j.contains("3")){
            System.out.println("Mix String");
        }
        else if(j.contains("1") && j.contains("2")){
            System.out.println("Alpha-Numeric String");
        }
        else if(j.contains("1") && j.contains("3")){
            System.out.println("Alphabets+Special Characters String");
        }
        else if(j.contains("2") && j.contains("3")){
            System.out.println("Digits+Special Characters String");
        }
        else{
            if(j.contains("1") &&(!j.contains("2"))&&(!j.contains("3"))){
                System.out.println("Alphabets String");
            }
            else if(j.contains("2") &&(!j.contains("1"))&&(!j.contains("3"))){
                System.out.println("Digits String");
            }
            else if(j.contains("3") &&(!j.contains("1"))&&(!j.contains("2"))){
                System.out.println("Special Characters");
            }
        }
    }
    public static void main(String[] args){
        String_finder sf=new String_finder("###gfsag");
    }
}