
package swingprogram;

import java.net.*;
public class pro24 {
 public static void main(String[] args){
 try {
 System.out.println("client has initiated");
 Socket cs= new Socket("localhost",5555);
 cs.close();
 }
 catch(Exception e) {
 System.out.println(e);
 }
}
}