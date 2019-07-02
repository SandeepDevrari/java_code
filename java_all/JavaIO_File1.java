import java.io.*;
public class JavaIO_File1{
    public JavaIO_File1()throws IOException{
        File file=new File("dekhlo.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writ=new FileWriter(file,true);
        BufferedWriter bw=new BufferedWriter(writ);
        bw.write("okay okay smaj gya");
        bw.flush();
        
        FileReader fr=new FileReader(file);
        BufferedReader br=new BufferedReader(fr);
        String line=null;
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }
    public static void main(String[] args){
        try{
            JavaIO_File1 jj=new JavaIO_File1();
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
}