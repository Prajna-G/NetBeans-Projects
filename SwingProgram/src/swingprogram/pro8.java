
package swingprogram;

import javax.swing.*;

public class pro8 {

    public static void main(String[] args) {
          JFrame f=new JFrame("BUTTON");
          JRadioButton b=new JRadioButton("C++");  
          JRadioButton b1=new JRadioButton("Java");  
          b.setBounds(30,10,50,30);
          b1.setBounds(110,10,100,30);  
          f.add(b);
          f.add(b1);
          ButtonGroup bg=new ButtonGroup();
          bg.add(b);
          bg.add(b1);
          f.setLayout(null);
          f.setSize(200,100);
          f.setVisible(true);
          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
