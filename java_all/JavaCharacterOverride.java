public class JavaCharacterOverride{
    @Override
    public String toString(){
        return "okay okay";
    }
    public static void main(String[] args){
        JavaCharacterOverride c=new JavaCharacterOverride();
        System.out.println(c);
    }
}