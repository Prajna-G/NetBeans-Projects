
package swingprogram;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class pro15 {
 public static void main(String[] args) {
        JFrame f=new JFrame("TREE");
        DefaultMutableTreeNode s=new DefaultMutableTreeNode("Style");
        DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Color");
        DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Font");
        s.add(s1);
        s.add(s2);
        JTree jt=new JTree(s);
        f.add(jt);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
