package adapterDesign;
public class AdapterDesign_Main{
	public static void main(String[] args){
		AdapterDesign_Pen p=new AdapterDesign_Adapter();
		AdapterDesign_Assignment assignment=new AdapterDesign_Assignment();
		assignment.setPen(p);
		assignment.writeAssignment("this is the Assignment,do it!!");
	}
}
