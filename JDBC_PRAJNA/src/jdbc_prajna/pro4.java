
package jdbc_prajna;

import java.sql.*;

public class pro4 {

    public static void main(String[] args) {
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prajna","root","");  
            System.out.println("conncetion established");
            Statement s = c.createStatement();
             System.out.println("Name \tReg_No \tProgram\tSem");
            ResultSet rs=s.executeQuery("SELECT * FROM `details`");
                 while(rs.next()){
            System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
           }
            System.out.println("Table is Displayed.");           
            c.close();  
          }
       catch(Exception e){ 
           System.out.println(e);
       }
    }
    
}
