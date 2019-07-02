public class JavaClassLoader_Example{
	public JavaClassLoader_Example(){
		System.out.println("Class Loaded!!");
	}
	public static void main(String[] args){
		//Class Loader to load class
		try{
			ClassLoader cl=JavaClassLoader_Example.class.getClassLoader();
			JavaClassLoader_Example jce=(JavaClassLoader_Example)cl.loadClass("JavaClassLoader_Example").newInstance();
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
		
		//class.forName to load class
	}
}
