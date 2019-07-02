import java.sql.*;
import oracle.jdbc.*;
import java.util.*;

class JavaToOracle{

    private Connection con;
    private ArrayList<String> that_due_detail_array;
    JavaToOracle(){
        try{
            
            
            ResultSet rs=get_trans(20171001,"NOV-17");
            while(rs.next())
            {
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                
            }
            String ee=get_latest_history();
                System.out.println(ee);
            
            String[] hist_list=ee.split("#");
            
            if(Integer.parseInt(hist_list[0])>1)
            {
                System.out.println("@@@@@@@@");
            }
            else{
                System.out.println("###############");
            }
            
            rs=get_trans_id(hist_list[1]);
            while(rs.next())
            {
                System.out.println("^"+rs.getString(1));
                System.out.println("^"+rs.getString(2));
                System.out.println("^"+rs.getString(3));
                System.out.println("^"+rs.getString(4));
                System.out.println("^"+rs.getString(5));
                
                
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        //set_trans();
        System.out.println(get_course_due(20171001,"b.tech(lateral)",4,"NOV-17"));
        System.out.println(get_hostel_due(20171001,"male",4,"NOV-17"));
        try{
        ResultSet rs=get_course_details("b.tech(lateral)",4);
        
            while(rs.next())
            {
                System.out.println("from here");
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
                System.out.println(rs.getString(4));
                System.out.println(rs.getString(5));
                System.out.println(rs.getString(6));
                System.out.println(rs.getString(7));
                System.out.println(rs.getString(8));
                System.out.println(rs.getString(9));
                System.out.println(rs.getString(10));
                System.out.println(rs.getString(11));
                System.out.println(rs.getString(12));
                System.out.println(rs.getString(13));
                System.out.println(rs.getString(14));
                System.out.println(rs.getString(15));
                System.out.println(rs.getString(16));
                System.out.println(rs.getString(17));
                System.out.println(rs.getString(18));
                System.out.println(rs.getString(19));
            }
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        String dd=get_that_due_details(20171001,"b.tech(lateral)",4,"Y","NOV-17","male");
        String[] arr=dd.split("@");
        that_due_detail_array=new ArrayList<String>();
        for(String r:arr){
            System.out.println(r);
            String[] detail_array=r.split("#");
            for(String ll:detail_array){
                System.out.println("++"+ll);
                that_due_detail_array.add(ll);
                //System.out.println(that_due_detail_array[i]);
            }
            
            
        }
        //for(int i=0;i<that_due_detail_array.length())
        System.out.println("PPPPPP "+that_due_detail_array.get(0));    
        Iterator that_due_detail_array_itr=that_due_detail_array.iterator();
        while(that_due_detail_array_itr.hasNext()){
        System.out.println("$$$$$$ "+that_due_detail_array_itr.next());
        }
        String tt="hell#Me#now";
        System.out.println(tt.replace("#Me",""));
        //set_student();
        String looks=look_for_pending(20171002);
        if(looks==null)
        {
            System.out.println("NO data in string");
        }
        else{
        String[] looks_arry=looks.split("#");
        if(looks_arry!=null)
        {
            for(String r:looks_arry)
                System.out.println(r);
        }
        else{
            System.out.println("NO data");
        }}
        set_student_state(20171003,"B");
        System.out.println(get_blocked_list());
    }
    
    private void database_connect()
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jdbc","jdbc");
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    private ResultSet get_trans(int idstudent,String yr)
    {
        database_connect();
        try
        {
            CallableStatement callst=con.prepareCall("{?=call payment_details_for_student(?,?)}");
            callst.registerOutParameter(1,OracleTypes.CURSOR);
            callst.setInt(2,idstudent);
            callst.setString(3,yr);
            System.out.println("here");
            callst.execute();
            ResultSet rs=((OracleCallableStatement)callst).getCursor(1);
            return rs;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_latest_history()
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call history_latest(?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,20171001);
            System.out.println("now see");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private ResultSet get_trans_id(String trans_id)
    {
       
        try
        {
            CallableStatement callst=con.prepareCall("{?=call get_trans_id_history(?)}");
            callst.registerOutParameter(1,OracleTypes.CURSOR);
            callst.setString(2,trans_id);
            System.out.println("here");
            callst.execute();
            ResultSet rs=((OracleCallableStatement)callst).getCursor(1);
            return rs;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private void set_trans()
    {
        try
        {
            CallableStatement callst=con.prepareCall("{call insert_pay_to_table(?,?,?,?,?,?,?,?)}");
            callst.setString(1,"134202");
            callst.setString(2,"sandeep");
            callst.setInt(3,60);
            callst.setString(4,"pnb_bank");
            callst.setString(5,"b.tech(lateral)");
            callst.setString(6,"you");
            callst.setString(7,"TUTION_FEE#60");
            callst.setString(8,"20171001");
            System.out.println("done");
            callst.execute();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void set_student()
    {
        try
        {
            CallableStatement callst=con.prepareCall("{call insert_student(?,?,?,?,?,?,?,?,?)}");
            callst.setInt(1,20171003);
            callst.setString(2,"rahul");
            callst.setString(3,"singh");
            callst.setString(4,"b.tech(lateral)");
            callst.setInt(5,4);
            callst.setString(6,"rahulsingh54@gmail.com");
            callst.setString(7,"7272727272");
            callst.setString(8,"N");
            callst.setString(9,"male");
            System.out.println("OKAY OKAY");
            callst.execute();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void set_student_state(int id,String state)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{call update_status_student(?,?)}");
            callst.setInt(1,id);
            callst.setString(2,state);
            System.out.println("OKAY OKAY");
            callst.execute();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
    
    private String get_course_due(int idstudent,String course,int year,String yr)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call get_course_due(?,?,?,?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,idstudent);
            callst.setString(3,course);
            callst.setInt(4,year);
            callst.setString(5,yr);
            System.out.println("here");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_hostel_due(int idstudent,String gen,int year,String yr)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call get_hostel_due(?,?,?,?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,idstudent);
            callst.setString(3,gen);
            callst.setInt(4,year);
            callst.setString(5,yr);
            System.out.println("here");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private ResultSet get_course_details(String course,int yr)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call fee_with_details(?,?)}");
            callst.registerOutParameter(1,OracleTypes.CURSOR);
            callst.setString(2,course);
            callst.setInt(3,yr);
            System.out.println("here");
            callst.execute();
            ResultSet rs=((OracleCallableStatement)callst).getCursor(1);
            return rs;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_that_due_details(int idstudent,String course,int yr,String s_hostel,String now_yr,String gen)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call get_that_student_due(?,?,?,?,?,?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,idstudent);
            callst.setString(3,course);
            callst.setInt(4,yr);
            callst.setString(5,s_hostel);
            callst.setString(6,now_yr);
            callst.setString(7,gen);
            System.out.println("here");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String verify_student(int idstudent)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call verify_student(?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,idstudent);
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String look_for_pending(int idstudent)
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call look_dues_pending(?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,idstudent);
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_course_defaulters()
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call defaulters_students()}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_blocked_list()
    {
        try
        {
            CallableStatement callst=con.prepareCall("{?=call blocked_list}");
            callst.registerOutParameter(1,Types.VARCHAR);
            System.out.println("blocked_list here");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        JavaToOracle oj=new JavaToOracle();
        
    }
}