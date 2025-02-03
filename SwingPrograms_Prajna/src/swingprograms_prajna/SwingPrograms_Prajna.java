
package swingprograms_prajna;

import javax.swing.*;  
public class  SwingPrograms_Prajna extends JFrame{  
    public static void main(String s[]) { 
JFrame f=new JFrame();
JSlider slider = new JSlider(JSlider.VERTICAL, 0, 50, 25);  
slider.setMinorTickSpacing(2);  
slider.setMajorTickSpacing(10);  
slider.setPaintTicks(true);  
slider.setPaintLabels(true); 
  
JPanel p=new JPanel();  
p.add(slider);  
f.add(p);  
f.pack();  
f.setVisible(true);  
}  
} 