package javaKeywords;
/*
NOTE:-inner private class can only be instanciate in the same class 

instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).
*/

public class KeywordInstanceof_Example{
	private interface pInterface{
		void methodHere();//it is defaultly public static final
	}
	private class cClass_1 implements pInterface{
		@Override
		public void methodHere(){
			System.out.println("from class 1");
		}
	}
	private class cClass_2 implements pInterface{
		@Override
		public void methodHere(){
			System.out.println("from class 2");
		}
	}
	public void callIt(pInterface p){
		if(p instanceof cClass_1){
			cClass_1 class_1=(cClass_1)p;//downcasting
			class_1.methodHere();
		}
		else if(p instanceof cClass_2){
			cClass_2 class_1=(cClass_2)p;
			class_1.methodHere();
		}
	}
	public static void main(String[] args){
		KeywordInstanceof_Example ke=new KeywordInstanceof_Example();
		KeywordInstanceof_Example.pInterface p=new KeywordInstanceof_Example().new cClass_2();
		
		ke.callIt(p);
		//Abc_d bb=new Abc_d();
		//Abc_d.pInterface p=new Abc_d().new cClass_2();
		
		//bb.callIt(p);
	}
}
/*class Abc_d{
	//private void method(){}
	private interface pInterface{
		void methodHere();//it is defaultly public static final
	}
	private class cClass_1 implements pInterface{
		@Override
		public void methodHere(){
			System.out.println("from class 1");
		}
	}
	private class cClass_2 implements pInterface{
		@Override
		public void methodHere(){
			System.out.println("from class 2");
		}
	}
	public void callIt(pInterface p){
		if(p instanceof cClass_1){
			cClass_1 class_1=(cClass_1)p;//downcasting
			class_1.methodHere();
		}
		else if(p instanceof cClass_2){
			cClass_2 class_1=(cClass_2)p;
			class_1.methodHere();
		}
	}
}*/
