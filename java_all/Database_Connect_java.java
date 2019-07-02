import java.sql.*;
public class Database_Connect_java{
    Connection con;
    public  Connection connectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","");
            //System.out.println(con);
        
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Getting Error "+e.getMessage());
        }
        return con;
    }
    //public static void main(String[] args){
    //    Database_Connect_java dj=new Database_Connect_java();
    //    
    //}
}