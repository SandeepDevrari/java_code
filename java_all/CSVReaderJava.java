import au.com.bytecode.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CSVReaderJava {
    private static final String SAMPLE_CSV_FILE_PATH = "C:\\Users\\Angry\\Desktop\\Accidents_2015.csv";

    public static void main(String[] args) throws IOException {
        try{
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVReader csvReader = new CSVReader(reader);
            List<String[]> records=csvReader.readAll();
            for(String[] record:records){
                System.out.println("Name : " + record[0]);
                break;
                //System.out.println("Email : " + record[1]);
                //System.out.println("Phone : " + record[2]);
                //System.out.println("Country : " + record[3]);
                //System.out.println("---------------------------");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        // {
         //   // Reading Records One by One in a String array
         //   String[] nextRecord;
         //   while ((nextRecord = csvReader.readNext()) != null) {
         //       System.out.println("Name : " + nextRecord[0]);
         //       System.out.println("Email : " + nextRecord[1]);
         //       System.out.println("Phone : " + nextRecord[2]);
         //       System.out.println("Country : " + nextRecord[3]);
         //       System.out.println("==========================");
         //   }
         //}
    }
}