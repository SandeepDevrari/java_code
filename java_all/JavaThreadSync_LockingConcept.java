import java.util.Date;
public class JavaThreadSync_LockingConcept{
	public static class JavaThreadSync_LockingConcept_main{
		private Date lastdate;
		public synchronized void setLastAccess(Date date){
			this.lastdate=date;
		}
		public Date getLastDate(){
			return lastdate;
		}
	}
	public static class JavaThreadSync_LockingConcept_Thread implements Runnable{
		private JavaThreadSync_LockingConcept_main object;
		
		public JavaThreadSync_LockingConcept_Thread(JavaThreadSync_LockingConcept_main object){
			this.object=object;
		}
		
		@Override
		public void run(){
			object.setLastAccess(new Date());
			System.out.println(object.getLastDate());
		}
	}
	public static void main(String[] args){
		JavaThreadSync_LockingConcept_main object=new JavaThreadSync_LockingConcept_main();
		JavaThreadSync_LockingConcept_main object2=new JavaThreadSync_LockingConcept_main();
		Thread t1=new Thread(new JavaThreadSync_LockingConcept_Thread(object));
		Thread t2=new Thread(new JavaThreadSync_LockingConcept_Thread(object2));
		t1.start();
		t2.start();
	}
}
