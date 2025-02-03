package swingprograms_prajna1;

   
import java.awt.LayoutManager;
import javax.swing.*;    
public class SwingPrograms_Prajna1 {    
    JFrame f;  
    JPanel sp;
    SwingPrograms_Prajna1(){    
    f=new JFrame();    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    sp=new JPanel();    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);  
    f.setLayout(null);
}     
public static void main(String[] args) {    
    new SwingPrograms_Prajna1();    
}    
}  

  
