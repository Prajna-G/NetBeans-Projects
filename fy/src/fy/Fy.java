
package swingprograms_prajna;

import javax.swing.*;

public class pro3 {

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
        //JButton b1=new JButton("Add");
        //JButton b2=new JButton("Update");
       // JButton b3=new JButton("Delete");
        //JButton b4=new JButton("Clear");
        
        l1.setBounds(30, 50, 100, 30);
        l2.setBounds(30, 100, 100, 30);
        l3.setBounds(30, 150, 100, 30);
        l4.setBounds(30, 200, 100, 30);
        l5.setBounds(30, 250, 100, 30);
        l6.setBounds(30, 300, 100, 30);
        l7.setBounds(30, 350, 100, 30);
        t1.setBounds(130, 50, 100, 30);
        t2.setBounds(130, 100, 100,30);
        t3.setBounds(130, 150, 100, 30);
        t4.setBounds(130, 200, 100, 30);
        t5.setBounds(130, 250, 100, 30);
        t6.setBounds(130, 350, 100, 30);
         c.setBounds(130, 300, 50, 30);
        //b1.setBounds(150, 450, 100, 30);
        //b2.setBounds(260, 450, 100, 30);
        //b3.setBounds(370, 450, 100, 30);
        //b3.setBounds(480, 450, 100, 30);
        
        f.add(l1);
        f.add(l2);
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
        //f.add(b1);
        //f.add(b2);
        //f.add(b3);
        //f.add(b4);
        f.setSize(800, 800);
        f.setVisible(true);
        f.setLayout(null);
        
    }
    
}
