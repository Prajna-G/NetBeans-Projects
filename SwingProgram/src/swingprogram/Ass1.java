
package swingprogram;

import javax.swing.*;

public class Ass1 {

    public static void main(String[] args) {
          JFrame f=new JFrame();
          JButton b1=new JButton("Addition");  
          b1.setBounds(30,30,100,30);  
          f.add(b1);  
          JButton b2=new JButton("Subtraction");  
          b2.setBounds(160,30,100,30);  
          f.add(b2);  
          JButton b3=new JButton("Multiplication");  
          b3.setBounds(30,70,109,30);  
          f.add(b3);  
          JButton b4=new JButton("Division");  
          b4.setBounds(160,70,100,30);  
          f.add(b4);  
         f.setLayout(null);
         f.setSize(305,180);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

