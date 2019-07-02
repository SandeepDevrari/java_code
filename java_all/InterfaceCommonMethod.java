public class InterfaceCommonMethod implements InterABC,InterBCD{//extends AbstractABC{//
	public void output(){
		System.out.println("OUTPUT");
	}
	public static void main(String[] args){
		new InterfaceCommonMethod().output();
	}
	static interface Inter{
		public void output();
		public void input();
	}

}
interface InterABC{
	public void output();
	//public void input();
}
interface InterBCD{
	public void output();
}
abstract class AbstractABC{
	public abstract void output();
	public abstract void input();
}
