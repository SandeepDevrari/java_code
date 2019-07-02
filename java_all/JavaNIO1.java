import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileStore;
import java.io.IOException;
public class JavaNIO1{
    public JavaNIO1() throws IOException{
        Path path=Paths.get("bcd.txt");
        if(Files.exists(path)){
            System.out.println("File exists...");
        }
        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("absolutePath(): %s%n", path.toAbsolutePath());
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());
        
        System.out.println("Files.isRegularFile(path): "+Files.isRegularFile(path));
        System.out.println("Files.isReadableFile(path): "+Files.isReadable(path));
        System.out.println("Files.isExecutableFile(path): "+Files.isExecutable(path));
        
        //Files.delete(path);
        
        //Files.copy(path,Paths.get("."));
        
        //BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
        //
        //System.out.println("creationTime: " + attr.creationTime());
        //System.out.println("lastAccessTime: " + attr.lastAccessTime());
        //System.out.println("lastModifiedTime: " + attr.lastModifiedTime());
        //
        //System.out.println("isDirectory: " + attr.isDirectory());
        //System.out.println("isOther: " + attr.isOther());
        //System.out.println("isRegularFile: " + attr.isRegularFile());
        //System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
        //System.out.println("size: " + attr.size());
        
        FileStore store = Files.getFileStore(path);

        System.out.println("total ="+store.getTotalSpace() / 1024);
        System.out.println("used = "+(store.getTotalSpace()-store.getUnallocatedSpace()) / 1024);
        System.out.println("avail = "+store.getUsableSpace() / 1024);
    }
    public static void main(String[] args){
        try{
            JavaNIO1 jn=new JavaNIO1();
        }catch(IOException io){
            io.printStackTrace();
        }
    }
}