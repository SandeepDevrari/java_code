//Variable- length arguments
import java.util.List;
import java.util.ArrayList;
public class JavaVarargs_Example{
	public JavaVarargs_Example(){
		List<String> list=new ArrayList<>();
		list.add("abc");
		list.add("dec");
		list.add("gds");
		list.add("haw");
		list.add("gsea");
		list.add("kljiop");
		
		List<String> list1=new ArrayList<>();
		list1.add("devrariiiiii");
		list1.add("sandeepppppp");
		
		List<String> list2=new ArrayList<>();
		list2.add("4896");
		list2.add("5468464");
		output(list,list1,list2);
	}
	/*To apply @SaveVarargs annotation on private instance methods, compile code using Java 9 or higher versions only.*/
	@SafeVarargs
	//private void output(List<String> ...list){
	final void output(List<String> ...list){
	for(List<String>ll:list)
		System.out.println(ll);
	}
	public static void main(String[] args){
		new JavaVarargs_Example();
	}
}
