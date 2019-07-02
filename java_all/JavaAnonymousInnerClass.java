public class JavaAnonymousInnerClass{
	public class InnerClass<T>{
		T a;
		public InnerClass(T a){
			this.a=a;
		}
		public T output(){
			return a;
		}
	}
	public static void main(String[] args){
		JavaAnonymousInnerClass.InnerClass<String> s=new JavaAnonymousInnerClass().new InnerClass<>("hell");
		System.out.println(s.output());
		
		KyaKaru<Integer> kk=new KyaKaru<Integer>(){//new KyaKaru<>(){
		/*Using the diamond with anonymous classes was not allowed in Java 8 or lower.*/
			Integer output(Integer a, Integer b){
				return a+b;
			}
		};
		System.out.println(kk.output(3,4));
	}
}
abstract class KyaKaru<T>{
	abstract T output(T a, T b);
}
