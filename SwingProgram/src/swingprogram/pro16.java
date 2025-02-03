
package swingprogram;

import javax.swing.*;

public class pro16 {

    public static void main(String[] args) {
         JFrame f=new JFrame("TABLE");
         String data[][]={{"01","Varun","1000000"},{"02","Prajna","3000000"},{"03","Achyuth","1000000"}};
         String column[]={"ID","NAME","SALARY"};
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