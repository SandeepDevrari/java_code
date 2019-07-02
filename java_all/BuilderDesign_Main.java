package builderDesign;
public class BuilderDesign_Main{
	public static void main(String[] args){
		BuilderDesign_Phone phone=new BuilderDesign_Builder().setOs("IOs").getPhone();
		System.out.println(phone);
	}
}
