import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;

public class JavaNIO3{
    public JavaNIO3() throws IOException{
        Path file=Paths.get("fire.png");
        Path tar=Paths.get("new_fire.png");
        if(!Files.exists(file)){
            System.out.println("File not exists...");
            System.exit(0);
        }
        if(!Files.exists(tar)){
            System.out.println("File not exists...");
            Files.createFile(tar);
            System.out.println("File created...");
        }
        byte[] fileArry=Files.readAllBytes(file);
        
        Files.write(tar,fileArry);
    }
    public static void main(String[] args){
        try{
            JavaNIO3 jn=new JavaNIO3();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}