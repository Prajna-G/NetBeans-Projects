
package jdbc_prajna;

import java.sql.*;

public class pro3 {

    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prajna","root","");  
            System.out.println("conncetion established");
            Statement s = c.createStatement();
            int i=s.executeUpdate("DELETE FROM `details` WHERE Sem='5'");
            System.out.println("Values are deleted.");
            c.close();  
          }
       catch(Exception e){ 
           System.out.println(e);
       }
    }
    
}
