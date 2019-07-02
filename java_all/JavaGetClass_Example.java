public class JavaGetClass_Example{
	public JavaGetClass_Example(){
		System.out.println("Called Class");
	}
	public static void main(String[] args){
		String str="sample";
		Integer i=900;
		Character c='A';
		JavaGetClass_Example je=new JavaGetClass_Example();
		
		//Super class checkinga
		System.out.println(str.getClass().getSuperclass());
		System.out.println(i.getClass().getSuperclass().getSuperclass());
		System.out.println(c.getClass().getSuperclass());
		System.out.println(je.getClass().getSuperclass());
	}
}
