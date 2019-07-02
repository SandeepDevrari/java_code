package threads;
public class JavaThread_Sleep1{
	public static void main(String[] args) throws InterruptedException{
		String[] hell={
							"this is okay","you can see it","good good"
						};
		for(String str:hell){
			Thread.sleep(3000);
			System.out.println(str);
		}
	}
}
