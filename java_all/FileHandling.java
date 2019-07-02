import java.io.File;
import java.io.IOException;
public class FileHandling{
    public FileHandling() throws IOException{
        //try{
        File file=new File("abc.txt");
        if(!file.exists()){
            if(file.createNewFile())
                System.out.println("File created...");
        }
        System.out.println("file.canExecute():"+file.canExecute());
        System.out.println("file.canRead():"+file.canRead());
        System.out.println("file.canWrite():"+file.canWrite());
        System.out.println("file.getAbsolutePath():"+file.getAbsolutePath());
        System.out.println("file.getName():"+file.getName());
        System.out.println("file.getParent():"+file.getParent());
        System.out.println("file.getPath():"+file.getPath());
        System.out.println("file.getTotalSpace():"+file.getTotalSpace());
        System.out.println("file.getUsableSpace():"+file.getUsableSpace());
        System.out.println("file.hashCode():"+file.hashCode());
        System.out.println("file.isAbsolute():"+file.isAbsolute());
        System.out.println("file.isDirectory():"+file.isDirectory());
        System.out.println("file.isFile():"+file.isFile());
        System.out.println("file.isHidden():"+file.isHidden());
        System.out.println("file.lastModified():"+file.lastModified());
        System.out.println("file.length():"+file.length());
        System.out.println("file.list():"+file.list());
        System.out.println("file.listFile():"+file.listFiles());
        System.out.println("file.listRoots():"+file.listRoots());
        System.out.println("file.mkdir():"+file.mkdir());
        System.out.println("file.renameTo():"+file.renameTo(new File("bcd.txt")));
        
    }
    public static void main(String[] args){
        try{
            FileHandling fh=new FileHandling();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}