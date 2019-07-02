import java.io.Console;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class JavaConsoleIO1{
    File logFile;
    String userId;
    String password;
    public JavaConsoleIO1() throws IOException{
        Console con= System.console();
        logFile=new File("logInUsers.txt");
        if(!logFile.exists()){
            System.out.println("file not found!!!,creating new file");
            logFile.createNewFile();
        }
        if(!logFile.canWrite()){
            logFile.setWritable(true);
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter(logFile,true));
        while(true){
            System.out.print("User-id:");
            userId=con.readLine();
            System.out.print("Password:");
            password=new String(con.readPassword());
            writer(bw);
        }
        //bw.close();
    }
    public void writer(BufferedWriter bw) throws IOException{
        bw.newLine();
        bw.write(userId+" ");
        bw.write(password+" ");
    }
    public static void main(String[] args){
        try{
            JavaConsoleIO1 jc=new JavaConsoleIO1();
        }
        catch(IOException io){
            System.out.println("Error!!,unable to run");
        }
    }
}