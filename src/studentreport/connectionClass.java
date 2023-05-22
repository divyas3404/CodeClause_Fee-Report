
package studentreport;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class connectionClass {
    
    
    Connection conn;
    Statement  stm=null;
    PreparedStatement ps;
    ResultSet rs=null;
    
    connectionClass()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/fee_report","root","root");
            stm= conn.createStatement();
            
            if(conn.isClosed())
            {
                System.out.println("Not Connected");
            }
            else
            {
                System.out.println("Connected");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String agr[])
    {
        new connectionClass();
    }

  
    
}
