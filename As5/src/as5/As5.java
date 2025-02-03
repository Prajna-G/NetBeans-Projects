
package as5;

import javax.swing.*;

public class As5 {

    public static void main(String[] args) {
         JFrame f=new JFrame("TABLE");
         String data[][]={{"01","Varun","Bcom","3","8.8"},{"02","Shashank","BCA","3","8.8"},
             {"03","SriVathsa","CS-Engineer","3","8.8"},{"01","Nuthan","CS-Engineer","3","8.8"},{"01","Tejas","Bcom","3","8.8"}};
         String column[]={"Roll-No","NAME","Program","Sem","CGPA"};
         JTable t=new JTable(data,column);
         JScrollPane sp=new JScrollPane(t);
         JPanel p=new JPanel();
         p.add(sp);  
         f.add(p);
         f.setSize(500,150);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
   
