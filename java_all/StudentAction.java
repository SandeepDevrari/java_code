import java.sql.*;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.List;
public class StudentAction{
    PreparedStatement pst;
    //ResultSet rs;
    //Student st;
    Connection con;
    public StudentAction(){
        try{
            Database_Connect_java jj=new Database_Connect_java();
            con=jj.connectDB();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public boolean insert(Student st){
        boolean b=false;
        try{
            //Database_Connect_java jj=new Database_Connect_java();
            //con=jj.connectDB();
            pst=con.prepareStatement("insert into student values(?,?,?,?)");
            pst.setString(1,st.getName());
            pst.setString(2,st.getPassword());
            pst.setBytes(3,st.getPhoto());
            pst.setString(4,st.getTxt_file());
            int i=pst.executeUpdate();
            if(i>0)
                b=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }
    public boolean delete(Student st){
        boolean b=false;
        try{
            //Database_Connect_java jj=new Database_Connect_java();
            //con=jj.connectDB();
            pst=con.prepareStatement("delete from student where name=?");
            pst.setString(1,st.getName());
            //pst.setString(2,st.getPassword());
            b=pst.execute();//Update();
            //if(i>0)
            //    b=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }
        public boolean update(Student st,String newPss){
        boolean b=false;
        try{
            //Database_Connect_java jj=new Database_Connect_java();
            //con=jj.connectDB();
            pst=con.prepareStatement("update student set password =? where name=?");
            pst.setString(1,newPss);
            pst.setString(2,st.getName());
            int i=pst.executeUpdate();
            if(i>0)
                b=true;
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }
    public ResultSet read(Student st)
    {
        ResultSet rs=null;
        try{
        pst=con.prepareStatement("select * from student where name=?");
        pst.setString(1,st.getName());
        rs=pst.executeQuery();
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    
    public static void main(String[] args) throws IOException{
        Path file=Paths.get("bcd.txt");
        Path photo=Paths.get("fire.png");
        Path uploadFile=Paths.get("data_upload//file1.txt");
        if(!Files.exists(file)){
            System.out.println("no file!!");
        }
        if(!Files.exists(photo)){
            System.out.println("no file!!");
        }
        if(!Files.exists(uploadFile)){
            uploadFile=Files.createFile(uploadFile);
        }
        //System.out.println(Files.copy(file.toAbsolutePath(),uploadFile.toAbsolutePath()));
        List<String> listStore=Files.readAllLines(file);
		uploadFile=Files.write(uploadFile,listStore,StandardOpenOption.WRITE);
        byte[] fileArry=Files.readAllBytes(photo);
        
        Student st=new Student();
        st.setName("Sandeep");
        st.setPassword("Hello");
        st.setTxt_file(uploadFile.toString());
        st.setPhoto(fileArry);
        StudentAction sa=new StudentAction();
        boolean b=sa.insert(st);
        System.out.println("Data inserted: "+b);
        //boolean b=sa.delete(st);
       // System.out.println("Data deleted: "+b);
        //boolean b=sa.update(st,"yellow");
        //System.out.println("Data updated: "+b);
        ResultSet rs=sa.read(st);
        String name="",pass="";
        try{
            while(rs.next()){
                name=rs.getString(1);
                pass=rs.getString(2);
                Blob bb=rs.getBlob(3);
                byte[] bic=bb.getBytes(1,(int)(bb.length()));
                Path tar=Paths.get("get_fire.png");
                if(!Files.exists(tar)){
                    System.out.println("File not exists...");
                    Files.createFile(tar);
                    System.out.println("File created...");
                }
                Files.write(tar,bic);
                System.out.println(name+" : "+pass);
            }
        }catch(Exception e)
        {
              e.printStackTrace();
        }
    }
}