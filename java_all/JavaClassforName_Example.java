public class JavaClassforName_Example{
	public JavaClassforName_Example(){
		System.out.println("Class Loaded!!");
	}
	public static void main(String[] args){
		//class.forName to load class
		try{
			Class cl=Class.forName("JavaClassforName_Example");
			Object jce=cl.newInstance();
		}
		catch(InstantiationException e){
			e.printStackTrace();
		}
		catch(IllegalAccessException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		
		
	}
}
