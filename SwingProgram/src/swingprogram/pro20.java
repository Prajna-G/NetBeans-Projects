
package swingprogram;

import java.net.*;

public class pro20 {

    public static void main(String[] args) {
       try{
       URL u=new URL("https://www.javatpoint.com/java-jlabel");
       System.out.println("Protocol:"+u.getProtocol());
       System.out.println("Host is:"+u.getHost());
       System.out.println("Port no is:"+u.getPort());
       System.out.println("File is:"+u.getFile());
        }
        catch(Exception e){
        }
    }
    }
    
