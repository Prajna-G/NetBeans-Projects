
package swingprogram;

import javax.swing.*; 

public class pro14 {

    public static void main(String[] args) {
        
  
    JFrame f=new JFrame();  
    JTextArea ta=new JTextArea(200,200);  
    JPanel p1=new JPanel();  
    p1.add(ta);  
    JPanel p2=new JPanel();  
    JPanel p3=new JPanel();  
    JTabbedPane tp=new JTabbedPane();  
    tp.setBounds(40,20,200,200);  
    tp.add("main",p1);  
    tp.add("visit",p2);  
    tp.add("help",p3);    
    f.add(tp);  
    f.setSize(300,300);  
    f.setLayout(null);  
    f.setVisible(true);  
  
    }
    
}
