package factoryDesign;
public class FactoryDesignPattern_Main{
	public static void main(String[] args){
		FactoryDesignPattern_Factory fact=new FactoryDesignPattern_Factory();
		FactoryDesignPattern_OS os=fact.getOS("open");
		os.specy();
	}
}
