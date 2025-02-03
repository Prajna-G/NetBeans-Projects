
package swingprograms_prajna1;

import javax.swing.*; 

public class Ass1 {

    public static void main(String[] args) {
    JFrame f=new JFrame("Button Example");  
    JButton b1=new JButton("ADDITION");  
    b1.setBounds(30,30,130,30); 
    JButton b2=new JButton("SUBTRACTION");  
    b2.setBounds(170,30,130,30); 
    JButton b3=new JButton("MULTIPLICATION");  
    b3.setBounds(310,30,130,30); 
    JButton b4=new JButton("DIVISION");  
    b4.setBounds(450,30,130,30); 
    f.add(b1);  
     f.add(b2); 
      f.add(b3); 
       f.add(b4); 
    f.setSize(630,140);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    
}
