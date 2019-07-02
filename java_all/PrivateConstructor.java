public class PrivateConstructor{
	private PrivateConstructor(){
		System.out.println("Private!!!");
	}
	public static void main(String[] args){
		new PrivateConstructor();
		new PrivateConstructor_Other();
	}
}
class PrivateConstructor_Other{
	private PrivateConstructor_Other(){
		System.out.println("Private_Other!!!");
	}
}

