
package swingprogram;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;


public class lab1 {

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
        p1.setLayout(null);
        p2.setLayout(null);
        p3.setLayout(null);
        p4.setLayout(null);
        Icon i=new ImageIcon("C:\\Users\\prajn\\OneDrive\\Desktop\\WEB TECHNOlOGY\\i2.jpg");
        JButton b=new JButton(i);  
        b.setBounds(30,40,230,40);   
        b.setToolTipText("Click this button to Register.");
        p1.add(b);
        tp.addTab("one",p1);
        tp.addTab("Two",p2);
        tp.addTab("Three",p3);
        tp.addTab("Four",p4);
        c.add(tp);
       
        f.setSize(300, 200);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
