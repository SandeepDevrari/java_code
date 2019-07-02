public class JavaDaemonThread_1{
    public static void main(String[] args){
    	//
    		JavaDaemonThread_1_Class classTo=new JavaDaemonThread_1_Class();
        	Thread daemon=new Thread(new JavaDaemonThread_1_Daemon(classTo,1));
        	Thread normal=new Thread(new JavaDaemonThread_1_Daemon(classTo,2));
        	daemon.setDaemon(true);
        	daemon.start();
        	normal.start();
        /**/
    }
}
class JavaDaemonThread_1_Daemon implements Runnable{
	private JavaDaemonThread_1_Class object;
	private int changer;
	JavaDaemonThread_1_Daemon(JavaDaemonThread_1_Class object,int changer){
		this.object=object;
		this.changer=changer;
	}
	@Override
	public void run(){
		try{
			if(changer==1)
				object.loopHole();
			else{
					object.loopFix();
				}
		}
		catch(InterruptedException ie){
        	ie.printStackTrace();
        }
	}
}
class JavaDaemonThread_1_Class{
	void loopHole() throws InterruptedException{
		for(;;){
			System.out.println("Stuck here :"+Thread.currentThread().getName());
			Thread.currentThread().sleep(5_00);
		}
	}
	void loopFix() throws InterruptedException{
		for(int i=0;i<4;i++){
			System.out.println("Fix loop :"+Thread.currentThread().getName());
			Thread.currentThread().sleep(1_000);
		}
	}
}
