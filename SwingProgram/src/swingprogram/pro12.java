package swingprogram;

import javax.swing.*;

public class pro12 {

    public static void main(String[] args) {
         JFrame f=new JFrame();
         JSlider s=new JSlider();
         s.setMinimum(0);
         s.setMaximum(100);
         s.setMinorTickSpacing(5);
         s.setMajorTickSpacing(50);
         s.setPaintLabels(true);
         s.setPaintTicks(true);
         s.setPaintTrack(true);
         f.add(s);
         f.setSize(100,100);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
