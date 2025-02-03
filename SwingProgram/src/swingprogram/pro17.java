
package swingprogram;

import javax.swing.*;
import java.awt.event.*;

public class pro17 implements ActionListener{
    JFrame f;
    JButton b;
    JLabel l;
  pro17(){
    f=new JFrame();
    l=new JLabel();
    l.setBounds(35,60,200,30);
    f.add(l);
    b=new JButton("Add");
    b.setBounds(40,20,100,30);
    b.addActionListener(this);
    f.add(b);
    f.setLayout(null);
    f.setSize(200,150);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   public void actionPerformed(ActionEvent e){
    if(e.getSource()==b){
        l.setText("Addition Performed");
    } 
   }
    public static void main(String[] args) {
      pro17 c=new pro17();   
    }
    
}
