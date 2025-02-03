
package jdbc_prajna;

import java.sql.*;

public class Pro1 {

    public static void main(String[] args) {
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prajna","root","");  
            System.out.println("conncetion established");
            Statement s = c.createStatement();
            int i=s.executeUpdate("INSERT INTO `details` (`Name`,`Reg_No`,`Program`,`Sem`) VALUES ('','','','')");
            c.close();  
          }
       catch(Exception e){ 
           System.out.println(e);
       }  
    }
    
}
