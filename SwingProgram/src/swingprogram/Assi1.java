
package swingprogram;

import javax.swing.*;    

public class Assi1 {

    public static void main(String[] args) {    
    JFrame f=new JFrame("Password Field ");    
     JPasswordField p = new JPasswordField();   
            p.setBounds(20,20,200,30);    
            f.add(p);   
            f.setSize(300,100);    
            f.setLayout(null);    
            f.setVisible(true);  
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
}  