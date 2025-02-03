
package swingprogram;

import javax.swing.*;

public class A2 {

    public static void main(String[] args) {
        JFrame f=new JFrame("Address Book");
        JLabel l1=new JLabel("CONTACT DETAILS");
        JLabel l2=new JLabel("FIRST NAME");
        JLabel l3=new JLabel("SECOND NAME");
        JLabel l4=new JLabel("Address LINE 1");
        JLabel l5=new JLabel("Address LINE 2");
        JLabel l6=new JLabel("CITY");
        JLabel l7=new JLabel("PHONE");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextField t4=new JTextField();
        JTextField t5=new JTextField();
        String c[]={"","Balli","New York","Seoul","BangKok"};        
        JComboBox cb=new JComboBox(c);
        JButton b1=new JButton("ADD");  
        JButton b2=new JButton("UPDATE");
        JButton b3=new JButton("DELETE");
        JButton b4=new JButton("CLEAR");  
        b1.setBounds(200,350,100,30);  
        f.add(b1);
        b2.setBounds(310,350,100,30);  
        f.add(b2);
        b3.setBounds(420,350,100,30);  
        f.add(b3); 
        b4.setBounds(530,350,100,30);  
        f.add(b4);
        cb.setBounds(200,200,200,30);    
        f.add(cb);       
        t1.setBounds(200,50,200,30);
        f.add(t1);
        t2.setBounds(200,100,200,30);
        f.add(t2);
        t3.setBounds(200,150,200,30);
        f.add(t3);
        t4.setBounds(200,250,200,30);
        f.add(t4);
        t5.setBounds(200,300,200,30);
        f.add(t5);
        l1.setBounds(30,10,125,30);
        f.add(l1);
        l2.setBounds(50,50,100,30);
        f.add(l2);
        l3.setBounds(50,100,100,30);
        f.add(l3);
        l4.setBounds(50,150,100,30);
        f.add(l4);
        l5.setBounds(50,200,100,30);
        f.add(l5);
        l6.setBounds(50,250,100,30);
        f.add(l6);
        l7.setBounds(50,300,100,30);
        f.add(l7);
        f.setLayout(null);
        f.setSize(700,450);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    
}
