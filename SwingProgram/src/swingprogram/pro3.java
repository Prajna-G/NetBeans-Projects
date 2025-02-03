
package swingprogram;

import javax.swing.*;
import javax.swing.*;

public class pro3 {

    public static void main(String[] args) {
         JFrame f=new JFrame("BUTTON");
          JButton b=new JButton("CLICK HERE");  
          b.setBounds(20,15,150,30);  
          f.add(b);
          f.setLayout(null);
          f.setSize(200,100);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
