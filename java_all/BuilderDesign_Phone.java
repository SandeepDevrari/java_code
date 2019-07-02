package builderDesign;
public class BuilderDesign_Phone{
	private String os;
	private int ram;
	private int battery;
	private double screenSize;
	
	public BuilderDesign_Phone(String os,int ram,int battery,double screenSize){
		this.os=os;
		this.ram=ram;
		this.battery=battery;
		this.screenSize=screenSize;
	}
	@Override
	public String toString(){
		return "Phone [os="+os+", ram="+ram+", battery="+battery+", screen size="+screenSize+"]";
	}
}
