package swingprogram;

import javax.swing.*;

public class pro5 {
 
    public static void main(String[] args) {
         JFrame f=new JFrame();
         JTextField t=new JTextField();
         t.setBounds(40,10,100,30);
         f.add(t);
         f.setLayout(null);
         f.setSize(200,100);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
