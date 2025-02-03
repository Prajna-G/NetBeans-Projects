
package swingprogram;

import javax.swing.*;

public class pro10 {

    public static void main(String[] args) {
         JFrame f=new JFrame();
         DefaultListModel l=new DefaultListModel();
         l.addElement("CARS");
         l.addElement("BIKES");
         l.addElement("SHIPS");
         l.addElement("JETS");
         JList li=new JList(l);
         li.setBounds(30,20,75,75);
         f.add(li);
         f.setLayout(null);
         f.setSize(150,160);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}






