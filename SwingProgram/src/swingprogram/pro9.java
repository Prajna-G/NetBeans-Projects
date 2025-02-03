
package swingprogram;

import javax.swing.*; 

public class pro9{ 
    public static void main(String[] args) {      
    JFrame f=new JFrame();    
    String c[]={"","Maldives","U.S.A","South Korea","Thailand"};        
    JComboBox cb=new JComboBox(c);    
    cb.setBounds(40,20,100,20);    
    f.add(cb);        
    f.setLayout(null);    
    f.setSize(200,100);    
    f.setVisible(true);         
}           
}    
 