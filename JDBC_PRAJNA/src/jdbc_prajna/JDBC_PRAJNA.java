package jdbc_prajna;

import java.sql.*;

public class JDBC_PRAJNA {

    public static void main(String[] args) {
       try{  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Prajna","root","");  
            System.out.println("conncetion established");
            c.close();  
          }
       catch(Exception e){ 
           System.out.println(e);
       }  
    }  
} 
