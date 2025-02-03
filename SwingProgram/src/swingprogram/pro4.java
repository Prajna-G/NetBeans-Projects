
package swingprogram;

import javax.swing.*;

public class pro4 {

 
    public static void main(String[] args) {
         JFrame f=new JFrame();
         JTextArea t=new JTextArea();
         t.setBounds(40,20,100,50);
         f.add(t);
         f.setLayout(null);
         f.setSize(200,150);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
