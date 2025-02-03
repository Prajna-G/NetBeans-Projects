
package ass5;

import javax.swing.*;

public class Ass5 {

    public static void main(String[] args) {
        JFrame f=new JFrame("REGISTER CLASS");
        JLabel l1=new JLabel("ABC COMPANY");
        JLabel l2=new JLabel("Name");
        JLabel l3=new JLabel("Address");
        JLabel l4=new JLabel("Gender");
        JLabel l5=new JLabel("Occupation");
        JLabel l6=new JLabel("Contact No");
        JLabel l7=new JLabel("Email ID");
        
        JButton b1=new JButton("Submit");
        JButton b2=new JButton("Clear ");
        JRadioButton rb1=new JRadioButton("MALE");
        JRadioButton rb2=new JRadioButton("FEMALE ");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JCheckBox c1=new JCheckBox("Buisness ");
        JCheckBox c2=new JCheckBox("Professional ");
        JTextField t1=new JTextField();
        JTextField t2=new JTextField();
        JTextField t3=new JTextField();
        JTextArea tf1=new JTextArea();
        l1.setBounds(140,40,100,30);
        l2.setBounds(40,90,100,30);
        l3.setBounds(40,140,100,30);
        l4.setBounds(40,210,100,30);
        l5.setBounds(40,260,100,30);
        l6.setBounds(40,320,100,30);
        l7.setBounds(40,360,100,30);
        b1.setBounds(150,410,100,30);
        b2.setBounds(270,410,100,30);
        rb1.setBounds(150,210,60,30);
        rb2.setBounds(270,210,80,30);
        c1.setBounds(150,260,100,30);
        c2.setBounds(150,285,100,30);
        t1.setBounds(150,90,200,30);
        t2.setBounds(150,320,200,30);
        t3.setBounds(150,360,200,30);
        tf1.setBounds(150,140,200,50);
          
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(b1);
        f.add(b2);
        f.add(rb1);
        f.add(rb2);
        f.add(c1);
        f.add(c2);
        f.add(t1);
        f.add(t2);
        f.add(t3);
        f.add(tf1);
        
        
        
         f.setLayout(null);
         f.setSize(400,500);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
             
