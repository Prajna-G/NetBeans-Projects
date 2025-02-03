/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingprogram;

import java.net.*;
import java.io.*;
import java.util.*;
public class pro21 {
   public static void main(String [] args) {
      try {
         URL url = new URL("http://www.amrood.com/index.htm?language=en#j2se");
         URLConnection connection = url.openConnection();
              long dateexp= connection.getExpiration();
              System.out.println("Expiration Date "+new Date(dateexp));
             System.out.println("Cntent Type="+connection.getContentType())  ;    
        System.out.println("Cntent Length ="+connection.getContentLength());
          long dateexp1= connection.getLastModified();
        System.out.println(" Last Modifed  Date "+new Date(dateexp1));
         
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
   

