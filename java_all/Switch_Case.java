public class Switch_Case{
    public Switch_Case(){
        //int i=1;
        switch("cab"){
            case "abc":
                    System.out.println("Case 1");
                    break;
            case "bca":
                    System.out.println("Case 2");
                    break;
            case "cab":
                    System.out.println("Case 3");
                    break;
            default:
                    System.out.println("Defaults");
        }
    }
    public static void main(String[] args){
        Switch_Case sc=new Switch_Case();
    }
}