
package javaapplication5;

import javax.swing.*;

public class JavaApplication5 {

   
    public static void main(String[] args) {
        JFrame f= new JFrame("CONTACT DETAILS"); 
        JLabel l1=new JLabel("First Name");
        JLabel l2=new JLabel("Second Name");
        JLabel l3=new JLabel("Address Line 1");
        JLabel l4=new JLabel("Address Line 1");
        JLabel l5=new JLabel("Address Line 2");
        JLabel l6=new JLabel("City");
        JLabel l7=new JLabel("Phone");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        String City[]={"Seoul","Phuket","Istanbul","New York"};
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        JTextField t5=new JTextField();
        JTextField t6=new JTextField();
        JComboBox<String> c=new JComboBox<>(City);
        JButton b1=new JButton("Add");
        JButton b2=new JButton("Update");
        JButton b3=new JButton("Delete");
        JButton b4=new JButton("Clear");
        
        l1.setBounds(30,10,50,30);
        
        f.add(l1);
       /* f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(t4);
        f.add(t5);
        f.add(t6);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);*/
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
       
        
    }
    
}

   
