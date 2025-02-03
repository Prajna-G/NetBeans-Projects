
package swingprogram;

import java.net.*;

public class pro19 {

    public static void main(String[] args) {
        try{
       InetAddress h=InetAddress.getByName("www.google.com");
       System.out.println("Host IP is:"+h.getHostAddress());
        System.out.println("Host IP is:"+h.getHostName());
       InetAddress h1=InetAddress.getByName("192.168.1.2");
        System.out.println("Host IP is:"+h1.getHostAddress());
         System.out.println("Host IP is:"+h1.getHostName());
        }
        catch(Exception e){
        }
    }
    
}
