package threads;
public class JavaThread_Interrupt1 extends Thread{
	public void run(){
		String[] hell={
							"this is okay","you can see it","good good"
						};
						
		try{  
			for(String str:hell){
				Thread.sleep(1000);
				System.out.println(str);
                
			}
		}
		catch(InterruptedException e){  
			throw new RuntimeException("interrupting thread");  
		}
	}
	public static void main(String[] args){
			JavaThread_Interrupt1 jti=new JavaThread_Interrupt1();
			jti.start();
			try{
			  jti.interrupt();
			}
			catch(Exception e){
				System.out.println("Exception handled "+e);
			}
	}
}
