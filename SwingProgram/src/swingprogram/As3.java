
package swingprogram;

import javax.swing.*;
import java.awt.event.*;

        
public class As3 implements ActionListener{
    JFrame f;
    JButton b1,b2,b3,b4;
    JLabel l;
  As3(){
    f=new JFrame();
    l=new JLabel();
    l.setBounds(50,240,200,30);
    f.add(l);
    b1=new JButton("Add");
    b2=new JButton("Subtract");
    b3=new JButton("Multiply");
    b4=new JButton("Divide");
    b1.setBounds(50,40,100,30);
    b2.setBounds(50,90,100,30);
    b3.setBounds(50,140,100,30);
    b4.setBounds(50,190,100,30);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.setLayout(null);
    f.setSize(300,450);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
 public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
        l.setText("Addition Performed");
    } 
    if(e.getSource()==b2){
        l.setText("Subtraction Performed");
    } 
    if(e.getSource()==b3){
        l.setText("Multiplication Performed");
    } 
    if(e.getSource()==b4){
        l.setText("Division Performed");
    } 
 }
public static void main(String[] args) {
    As3 c=new As3();     
    }
    
}
