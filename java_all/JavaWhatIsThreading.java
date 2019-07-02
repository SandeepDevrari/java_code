class Worker extends Thread {
    String name;
    int time;
    public Worker(String name,int time){
        this.name=name;
        this.time=time;
    }
    @Override
    public void run() {
        
        // Loop for ten iterations.
        
        for(int i=0; i<10; i++) {
            System.out.println(i + " looping ..."+" "+name);
            
            // Sleep for a while
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                // Interrupted exception will occur if
                // the Worker object's interrupt() method
                // is called. interrupt() is inherited
                // from the Thread class.
                System.out.println("occur interrupt breaking thread "+name);
                break;
            }
        }
    }

}
public class JavaWhatIsThreading {

    
    public static void main(String[] args) {
        Worker worker1 = new Worker("rahul",500);
        worker1.start();
        
        Worker worker2 = new Worker("rohan",400);
        worker2.start();
        
        Worker worker3 = new Worker("varun",100);
        worker3.start();
        
        // You can call interrupt() if you want
        // to interrupt a thread. The thread itself
        // decides how to handle interrupts.
         worker1.interrupt();
    }
    
}