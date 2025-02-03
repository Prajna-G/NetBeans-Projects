
package swingprogram;
import javax.swing.*;
import java.awt.event.*;

        
public class Ass3 implements ActionListener{
    JFrame f;
    JTextField t1,t2;
    JLabel l1,l2,l3;
    JButton b;
    Ass3(){
    f=new JFrame("LOGIN MENU");
    l1=new JLabel("Username:-");
    l2=new JLabel("Pasword:-");
    l3=new JLabel();
    l1.setBounds(50,50,100,30);
    l2.setBounds(50,100,100,30);
    l3.setBounds(150,200,200,30);
    f.add(l1);
    f.add(l2);
    t1=new JTextField();
    t2=new JTextField();
    t1.setBounds(150,50,100,30);
    t2.setBounds(150,100,100,30);
    b=new JButton("LOGIN");
    b.setBounds(150,150,100,30);
    b.addActionListener(this);
    f.add(b);
    f.add(t1);
    f.add(t2);
    f.add(l1);
    f.add(l3);   
    f.setLayout(null);
    f.setSize(300,300);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
}
   public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
           if(t1.getText().equals("BCA")&& t2.getText().equals("mysuru"))
       l3.setText("Login successfull");   
      
    else
       l3.setText("Login not successfull");
    
  } 
   }
    public static void main(String[] args) {
        Ass3 c=new Ass3();
    }
   
   }


