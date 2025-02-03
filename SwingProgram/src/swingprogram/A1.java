package swingprogram;

import javax.swing.*;

public class A1 {
    
    public static void main(String[] args) {
         JFrame f=new JFrame();
         JLabel l1=new JLabel("First Name");
         JLabel l2=new JLabel("Second Name");
         l1.setBounds(40,40,100,30);
          l2.setBounds(40,80,100,30);
         f.add(l1);
         f.add(l2);
         f.setLayout(null);
         f.setSize(200,200);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
    
