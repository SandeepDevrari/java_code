import java.io.Serializable;
public class Student implements Serializable{
    private String name,password,txt_file;
    private byte[] photo;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
    public void setPhoto(byte[] b){
        this.photo=b;
    }
    public void setTxt_file(String b){
        this.txt_file=b;
    }
    public byte[] getPhoto(){
        return photo;
    }
    public String getTxt_file(){
        return txt_file;
    }
}