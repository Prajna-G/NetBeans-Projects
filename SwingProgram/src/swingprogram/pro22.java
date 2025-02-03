/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingprogram;
import java.io.*;    
import java.net.*;    
public class pro22{    
public static void main(String[] args){    
try{    
URL url=new URL("http://info.cern.ch");    
URLConnection urlcon=url.openConnection();    
InputStream stream=urlcon.getInputStream();    
int i;    
while((i=stream.read())!=-1){    
System.out.print((char)i);    
}    
}catch(Exception e){System.out.println(e);}    
}    
}    

