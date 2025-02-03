
package a5;

import javax.swing.*;

import javax.swing.*;

public class A5{

    public static void main(String[] args) {
          
          JFrame f=new JFrame("BUTTON");
          Icon i=new ImageIcon("C:\\Users\\prajn\\OneDrive\\Desktop\\WEB TECHNOlOGY\\i2.jpg");
          JButton b=new JButton(i);  
          b.setBounds(30,30,230,40);  
          f.add(b);
          b.setToolTipText("Click this button to Register.");
          f.setLayout(null);
          f.setSize(350,250);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

