
package swingprogram;

import javax.swing.*;

public class Assig1 {

    public static void main(String[] args) {
         JFrame f= new JFrame("CheckBox");  
        JCheckBox c1 = new JCheckBox("C++");  
        c1.setBounds(20,20, 50,50);  
        JCheckBox c2 = new JCheckBox("Java");  
        c2.setBounds(20,80, 100,50);  
        f.add(c1);  
        f.add(c2);  
        f.setSize(100,200);  
        f.setLayout(null);  
        f.setVisible(true);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
