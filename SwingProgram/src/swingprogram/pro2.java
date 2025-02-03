
package swingprogram;

import javax.swing.*;

public class pro2 {

    public static void main(String[] args) {
         JFrame f=new JFrame();
         JLabel l=new JLabel("HELLO");
         l.setBounds(40,15,100,30);
         f.add(l);
         f.setLayout(null);
         f.setSize(100,100);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
