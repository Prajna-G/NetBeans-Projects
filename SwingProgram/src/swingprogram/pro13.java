
package swingprogram;

import javax.swing.*;    
public class pro13 extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
pro13 (){    
jb=new JProgressBar(0,100);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);    
}    
public void iterate(){    
while(i<=100){    
  jb.setValue(i);    
  i=i+1;    
  try{Thread.sleep(50);}catch(Exception e){}    
}    
}    
public static void main(String[] args) {    
    pro13  m=new pro13 ();    
    m.setVisible(true);    
    m.iterate();    
}    
}   
