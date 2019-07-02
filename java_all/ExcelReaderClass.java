import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExcelReaderClass {

    public static void main(String[] args) {

        String csvFile = "C:\\Users\\Angry\\Desktop\\Accidents_2015.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        boolean readOrNot=true;
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null & readOrNot) {
                String[] temp=line.split(",");
                for(String s:temp){
                    System.out.println(s);
                }
                readOrNot=false;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}