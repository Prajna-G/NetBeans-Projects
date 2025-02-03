
package trialprograms;

import javax.swing.*;

import java.awt.*;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseMotionListener;  
public class Trialprograms extends Frame implements MouseMotionListener{  
    JLabel l;  
    JButton b;
    Trialprograms(){ 
    l=new JLabel();    
    Icon i=new ImageIcon("C:\\Users\\prajn\\OneDrive\\Desktop\\WEB TECHNOlOGY\\i2.jpg");
          JButton b=new JButton(i);  
          b.setBounds(30,30,230,40);  
          l.setBounds(30,90,100,40);
          add(b); 
          add(l);
    addMouseMotionListener(this);  
      
    setSize(400,400);  
    setLayout(null);  
    setVisible(true);
    
}  
public void mouseDragged(MouseEvent e) {  
   
   
}  
public void mouseMoved(MouseEvent e) {  
     if(e.getSource()==b)
    l.setToolTipText("HI");  
   // l.setText("X="+e.getX()+", Y="+e.getY());  
}  
public static void main(String[] args) {  
    new Trialprograms();  
}  
}  
