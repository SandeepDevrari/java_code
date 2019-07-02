import java.io.*;
import java.nio.*;
public class JavaRandomAccessFile1{
    public JavaRandomAccessFile1(){
        File file=new File("javaNIOTest.txt");
        if(!file.exists()){
            if(file.createNewFile())
                System.out.println("File created...");
        }
        RandomAccessFile rn=new RandomAccessFile(file,"rw");
        FileChannel fc= rn.getChannel();
        ByteBuffer cb=ByteBuffer.allocate(50);
        int bytesRead=fc.read(cb);
        while (bytesRead != -1) {
            System.out.println("Read " + bytesRead);
            cb.flip();
            while(cb.hasRemaining()){
                System.out.print((char) cb.get());
            }
            cb.clear();
            bytesRead = inChannel.read(cb);
        }
        rn.close();
    }
    public static void main(String[] args){
        JavaRandomAccessFile1 jra=new JavaRandomAccessFile1();
    }
}