
package jdbc_prajna;

import java.sql.*;

public class pro2 {

    public static void main(String[] args) {
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prajna","root","");  
            System.out.println("conncetion established");
            Statement s = c.createStatement();
            int i=s.executeUpdate("UPDATE `details` SET Name='Achu' WHERE Name='Achyuth'");
            i=s.executeUpdate("UPDATE `details` SET Reg_No='25' WHERE Reg_No='02'");
            i=s.executeUpdate("UPDATE `details` SET Program='5th std' WHERE Program='BBA'");
            i=s.executeUpdate("UPDATE `details` SET Sem='4' WHERE Reg_No='25'");
            System.out.println("Values are updated.");
            c.close();  
          }
       catch(Exception e){ 
           System.out.println(e);
       }  
    }
    
}
