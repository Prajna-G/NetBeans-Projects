package swingprogram;

import javax.swing.*; 

public class pro7 {  
    public static void main(String[] args) {    
    JFrame f=new JFrame();    
     JCheckBox c = new JCheckBox("Checked");   
     c.setBounds(40,10,100,30);    
     f.add(c);    
     f.setSize(200,100);    
     f.setLayout(null);    
     f.setVisible(true);  
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}  
}  