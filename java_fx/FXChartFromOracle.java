import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.geometry.Insets;

import java.sql.*;
import oracle.jdbc.*;

public class FXChartFromOracle extends Application{
    private Connection con;
    private ResultSet rss;
    
    
    @Override
    public void start(Stage main) throws Exception{
        
        boolean rs_status=false;
        String rs=get_latest_history();
        String[] hist_list=rs.split("#");
        if(Integer.parseInt(hist_list[0])>1)
        {
            rs_status=false;
            //
        }
        else
        {
            rs_status=true;
            //rss=get_trans_id(hist_list[1]);
            //rss.next();
        }
        
        AnchorPane pane=new AnchorPane();
        pane.setPadding(new Insets(10,10,10,10));
        
        NumberAxis xAxis=new NumberAxis(0,30,1);
        xAxis.setLabel("Date");

        NumberAxis yAxis=new NumberAxis();
        yAxis.setLabel("Rupees");
        
        LineChart<Number,Number> lineChart=new LineChart<Number,Number>(xAxis,yAxis);
        lineChart.setPrefSize(900,600);
        AnchorPane.setTopAnchor(lineChart,30.00);
        AnchorPane.setLeftAnchor(lineChart,20.00);
        AnchorPane.setRightAnchor(lineChart,30.00);
        //lineChart.setCreateSymbols(false);
        lineChart.setTitle("Transection Chart");
        
        XYChart.Series lineChart_data=new XYChart.Series();
        lineChart_data.setName("Amount");
        
        if(!rs_status){
            for(int i=1;i<=Integer.parseInt(hist_list[0]);i++){
                String data_chart=get_for_chart(hist_list[i]);
                //System.out.println(data_chart);
                String[] array_chart=data_chart.split("#");
                //System.out.println(array_chart[0]+"   "+array_chart[1].substring(0,2));
                lineChart_data.getData().add(new XYChart.Data(Integer.parseInt(array_chart[1].substring(0,2)),Integer.parseInt(array_chart[0])));
            }
        }
        
        lineChart.getData().add(lineChart_data);
        
        pane.getChildren().add(lineChart);
        
        Scene sceneOne=new Scene(pane,1100,720);
        
        main.setScene(sceneOne);
        main.setTitle("Line Chart for Oracle Data");
        main.show();
        //setUserAgentStylesheet(STYLESHEET_MODENA);
        ResultSet rsa=get_from_range("03-11-2017","24-11-2017");
        while(rsa.next()){
            System.out.println(rsa.getString(1)+"  "+rsa.getString(2).substring(8,11));
        }
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
    
    private String get_latest_history()
    {
        database_connect();
        try
        {
            CallableStatement callst=con.prepareCall("{?=call history_latest(?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setInt(2,20171001);
            //System.out.println("now see");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private String get_for_chart(String trans_id)
    {
       
        try
        {
            CallableStatement callst=con.prepareCall("{?=call get_for_chart(?)}");
            callst.registerOutParameter(1,Types.VARCHAR);
            callst.setString(2,trans_id);
            //System.out.println("here");
            callst.execute();
            return callst.getString(1);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    private ResultSet get_from_range(String from_date,String to_date)
    {
        try{
        CallableStatement callst=con.prepareCall("{?=call through_range(?,?)}");
        callst.registerOutParameter(1,OracleTypes.CURSOR);
        callst.setString(2,from_date);
        callst.setString(3,to_date);
        callst.execute();
        ResultSet rs=((OracleCallableStatement)callst).getCursor(1);
        return rs;
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args){
        launch(args);
    }
}