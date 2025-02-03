
package assi5;

import java.awt.event.*;
import javax.swing.*;

public class Assi5 implements ActionListener {
        JFrame f;
        JLabel l1,l2,l3,l4;
        JComboBox c;
        JRadioButton rb1,rb2,rb3;
        JCheckBox c1,c2;
        
        Assi5(){
         f=new JFrame("REGISTER CLASS");
        l1=new JLabel("Size");
        l2=new JLabel("Toppings");
        l3=new JLabel("Delivery");
        l4=new JLabel();
        rb1=new JRadioButton("Small");
        rb2=new JRadioButton("Medium");
        rb3=new JRadioButton("Large");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        c1=new JCheckBox("Pepperoni");
        c2=new JCheckBox("Anchovies ");
        String data[]={"","Cash-on","UPI"};
         c=new JComboBox<String>(data);
        l1.setBounds(40,40,100,30);
        l2.setBounds(40,90,100,30);
        l3.setBounds(40,150,100,30);
        rb1.setBounds(40,60,60,30);
        rb2.setBounds(100,60,70,30);
        rb3.setBounds(170,60,80,30);
        c1.setBounds(120,90,100,30);
        c2.setBounds(120,115,100,30);
        c.setBounds(120,150,80,30);
        l4.setBounds(80,210,100,30);
        c.addActionListener(this);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(rb3);
        f.add(rb1);
        f.add(rb2);
        f.add(c1);
        f.add(c2);
        f.add(c);
        f.setLayout(null);
        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        public void actionPerformed(ActionEvent e) {       
 
 if(e.getSource()==c){
        l4.setText("ORDER PLACED");
    }  
}
public static void main(String[] args) {
    Assi5 a=new Assi5();
}
}