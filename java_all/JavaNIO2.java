import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

public class JavaNIO2{
    public JavaNIO2() throws IOException{
        Path file=Paths.get("logInUsers.txt");
        if(!Files.exists(file)){
            System.out.println("File not exists...");
            System.exit(0);
        }
        byte[] fileArry=Files.readAllBytes(file);
        //for(byte b:fileArry){
        //    System.out.print(b);
        //}
        //Files.write(Paths.get("bcd.txt"),fileArry);
    }
    public static void main(String[] args){
        try{
            JavaNIO2 jn=new JavaNIO2();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}