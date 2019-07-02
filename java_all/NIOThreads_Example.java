import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.attribute.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.nio.file.OpenOption;
import java.nio.channels.*;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
public class NIOThreads_Example{
	public class SharedFiles{
		Path file;
		public SharedFiles() throws IOException,InterruptedException{
			file=Paths.get("sharedFile.txt");
			if(!Files.exists(file)){
				Set<PosixFilePermission>permissions=PosixFilePermissions.fromString("rw-r--r--");
				FileAttribute<Set<PosixFilePermission>>attribute=PosixFilePermissions.asFileAttribute(permissions);
				file=Files.createFile(file,attribute);
			}
			
			String writeInto=""+Thread.currentThread().getName();
			byte[] data=writeInto.getBytes();
			//ByteBuffer dataBB=ByteBuffer.wrap(data);
			System.out.println("running-"+Thread.currentThread().getName());
			Files.write(file,data,APPEND);
			Thread.sleep(8_000);
			
		}
		public void ChannelInto() throws IOException,InterruptedException{
			Set<OpenOption> options = new HashSet<OpenOption>();
  			options.add(APPEND);
   			options.add(CREATE);
   			String writeInto=""+Thread.currentThread().getName();
			byte[] data=writeInto.getBytes();
			ByteBuffer dataBB=ByteBuffer.wrap(data);
   			SeekableByteChannel bc=Files.newByteChannel(file,options);
   			bc.write(dataBB);
   			System.out.println("running-"+Thread.currentThread().getName());
   			Thread.sleep(8_000);
   			
		}
	}
	public class ThreadsHere implements Runnable{
		@Override
		public void run(){
			try{
				SharedFiles sf=new SharedFiles();
				System.out.println("running-"+Thread.currentThread().getName());
				sf.ChannelInto();
			}
			catch(Exception io){
				io.printStackTrace();
			}
		}
	}
	public static void main(String[] args){
	try{
		Thread t1=new Thread(new NIOThreads_Example().new ThreadsHere());
		Thread t2=new Thread(new NIOThreads_Example().new ThreadsHere());
		t1.start();
		t2.start();
		}
		catch(Exception io){
			io.printStackTrace();
		}
	}
}
