package builderDesign;
public class BuilderDesign_Builder{
	private String os;
	private int ram;
	private int battery;
	private double screenSize;
	
	public BuilderDesign_Builder setOs(String os){
		this.os=os;
		return this;
	}
	public BuilderDesign_Builder setRam(int ram){
		this.ram=ram;
		return this;
	}
	public BuilderDesign_Builder setBattery(int battery){
		this.battery=battery;
		return this;
	}
	public BuilderDesign_Builder setScreenSize(double screenSize){
		this.screenSize=screenSize;
		return this;
	}
	public BuilderDesign_Phone getPhone(){
		return new BuilderDesign_Phone(os,ram,battery,screenSize);
	}
}
