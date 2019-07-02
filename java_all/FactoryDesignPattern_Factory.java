package factoryDesign;
public class FactoryDesignPattern_Factory{
	public FactoryDesignPattern_OS getOS(String type){
		if(type.equals("open")){
			return new FactoryDesignPattern_Android();
		}
		else if(type.equals("close")){
			return new FactoryDesignPattern_IOS();
		}
		else{
			return new FactoryDesignPattern_Other();
		}
	}
}
