
package swingprogram;

import javax.swing.*;

public class A3 {

    public static void main(String[] args) {
     JFrame f=new JFrame("ICE CREAMS");
         String data[][]={{"01","ButterScotch","80"},{"02","Vanilla","70"},{"03","Chocolate","60"}};
         String column[]={"SL.NO","NAME","Price"};
         JTable t=new JTable(data,column);
         JScrollPane sp=new JScrollPane(t);
         JPanel p=new JPanel();
         p.add(sp);  
         f.add(p);
         f.setSize(500,120);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
