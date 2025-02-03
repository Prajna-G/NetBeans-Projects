package swingprogram;

import javax.swing.*;    
import java.awt.event.*;    

public class A4 implements ActionListener{    
JFrame f;
JComboBox cb;
JLabel l;

A4(){    
    f=new JFrame("ComboBox Example");   
    l = new JLabel();      
    l.setBounds(70,40,150,30);      
    cb=new JComboBox();
    cb.addItem("");
    cb.addItem("HI");
    cb.addItem("Swardi Khap");
    cb.addItem("Annyanghaseyo");
    cb.setBounds(50,70,90,20);    
    f.add(cb);
    f.add(l);    
    f.setLayout(null);    
    f.setSize(200,210);    
    f.setVisible(true);  
    cb.addActionListener(this);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
}

public void actionPerformed(ActionEvent e) {       
 
String data = cb.getItemAt(cb.getSelectedIndex())+"";  
l.setText(data);  
}  
            
public static void main(String[] args) {    
    new A4();         
}    
}   
