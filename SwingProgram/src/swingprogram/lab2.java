
package swingprogram;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class lab2 {

    public static void main(String[] args) {
        JFrame f= new JFrame("Product Details");
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(50,10,700,500);
        f.setBounds(100,100,645,470);       
        Container c=f.getContentPane();
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();

        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        p4.setLayout(null);
        p5.setLayout(null);
        p6.setLayout(null);
            
        p4.setBounds(100,10,600,150);
        p5.setBounds(100,200,600,150);
        p6.setBounds(100,390,600,150);             
        
        p4.setBorder(BorderFactory.createTitledBorder("Manufacturer"));
        JLabel l1 = new JLabel("Company");
        l1.setBounds(40, 20, 70, 20);
        JTextField t1=new JTextField();
        t1.setBounds(110, 20, 380, 20);
        p4.add(l1);
        p4.add(t1);
        
        JLabel l2 = new JLabel("Contact");
        l2.setBounds(40, 50, 70, 20);
        JTextField t2=new JTextField();
        t2.setBounds(110, 50, 380, 20);
        p4.add(l2);
        p4.add(t2);
        
        JLabel l3= new JLabel("Order");
        l3.setBounds(40, 80, 70, 20);
        JTextField t3=new JTextField();
        t3.setBounds(110, 80, 150, 20);
        p4.add(l3);
        p4.add(t3);
                     
        p5.setBorder(BorderFactory.createTitledBorder("Inspecter"));
        JLabel l4 = new JLabel("Name");
        l4.setBounds(40, 20, 70, 20);
        JTextField t4=new JTextField();
        t4.setBounds(110, 20, 380, 20);
        p5.add(l4);
        p5.add(t4);
        
        JLabel l5 = new JLabel("Reference No");
        l5.setBounds(20, 50, 90, 20);
        JTextField t5=new JTextField();
        t5.setBounds(110, 50, 380, 20);
        p5.add(l5);
        p5.add(t5);
        
        JLabel l6= new JLabel("Status");
        l6.setBounds(40, 80, 70, 20);
        String Status[]={"","In Progress","Completed","Yet to Begin"};
        JComboBox<String> c1 = new JComboBox<String>(Status);
        c1.setBounds(110, 80, 380, 20);        
        p5.add(l6);
        p5.add(c1); 
        
        p6.setBorder(BorderFactory.createTitledBorder("Ship"));
        JLabel l7 = new JLabel("ShipYard");
        l7.setBounds(40, 20, 70, 20);
        JTextField t7=new JTextField();
        t7.setBounds(110, 20, 380, 20);
        p6.add(l7);
        p6.add(t7);      
        
        JLabel l8 = new JLabel("Register No");
        l8.setBounds(20, 50, 90, 20);
        JTextField t8=new JTextField();
        t8.setBounds(110, 50, 140, 20);
        p6.add(l8);
        p6.add(t8);
        
         JLabel l9 = new JLabel("Roll No");
        l9.setBounds(280, 50, 90, 20);
        JTextField t9=new JTextField();
        t9.setBounds(390, 50, 140, 20);
        p6.add(l9);
        p6.add(t9); 
        
        JLabel l10= new JLabel("Project Type");
        l10.setBounds(20, 80, 80, 20);
        String Type[]={"","New Building","Old Building","Demolition"};
        JComboBox<String> c2 = new JComboBox<String>();
        c2.setBounds(110, 80, 150, 20);        
        p6.add(l10);
        p6.add(c2);
        
        JButton b1= new JButton("Add");
        b1.setBounds(110,560,100,20);
        
        JButton b2= new JButton("Delete");
        b2.setBounds(220,560,100,20);
        
        p1.add(p4);
        p1.add(p5);
        p1.add(p6);
        p1.add(b1);
        p1.add(b2);
              
        tp.addTab("Shipping Details",p1);
        tp.addTab("Salesperson Registeration",p2);
        tp.addTab("Spare Part Details",p3);
        
        c.add(tp);
        
        
        f.setSize(800, 670);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
