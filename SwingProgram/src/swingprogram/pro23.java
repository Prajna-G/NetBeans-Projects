
package swingprogram;

import java.net.*;
import java.net.*;
public class pro23{
 public static void main(String[] args){
 try {
 System.out.println("waiting for request from client");
 ServerSocket ss = new ServerSocket(5555);
 ss.accept();
 System.out.println("connection established");
 ss.close();
 }
 catch(Exception e ){
     System.out.println(e);
 } 
 }
}

