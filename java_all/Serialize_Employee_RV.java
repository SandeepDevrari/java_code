import java.io.*;
class Employee_RV implements Serializable{
    private String employee_name;
    transient private String employee_status;
    private String employee_position;
    
    @Override
    public String toString(){
        return ("Employee Name: "+employee_name+" Job Position: "+employee_position+" Status: "+employee_status);
    }
    
    public void setEmployeeName(String name){
        this.employee_name=name;
    }
    public void setEmployeePosition(String job){
        this.employee_position=job;
    }
    public String getEmployeeName(){
        return employee_name;
    }
    public String getEmployeePosition(){
        return employee_position;
    }
}

public class Serialize_Employee_RV{
    public Serialize_Employee_RV(){
        System.out.println("Serialization Processing...");
        //
    }
    public void storeObject(Object emp, String fileName) throws IOException{
        FileOutputStream fs=new FileOutputStream(fileName);
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(emp);
    }
    public Object fetchObject(String fileName) throws IOException,ClassNotFoundException{
        FileInputStream fs=new FileInputStream(fileName);
        ObjectInputStream os=new ObjectInputStream(fs);
        Object o=os.readObject();
        os.close();
        return o;
    }
    public static void main(String[] args) throws ClassNotFoundException{
        String filename="emp.txt";
        Employee_RV emp=new Employee_RV();
        emp.setEmployeeName("Sandeep");
        emp.setEmployeePosition("Android Dev");
        
        Serialize_Employee_RV tv=new Serialize_Employee_RV();
        try{
            tv.storeObject(emp,filename);
            
            Employee_RV em=null;
            em=(Employee_RV)tv.fetchObject(filename);
            System.out.println(emp);
            System.out.println(em);
        }catch(IOException e){
            //
        }
    }
}

