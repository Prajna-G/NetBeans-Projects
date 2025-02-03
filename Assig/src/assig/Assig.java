package assig;


import javax.swing.*;
import javax.swing.tree.*;

public class Assig {
 public static void main(String[] args) {
        JFrame f=new JFrame("TREE");
        DefaultMutableTreeNode s2=new DefaultMutableTreeNode("Undergraduate");
        DefaultMutableTreeNode s21=new DefaultMutableTreeNode("John DOC");
        DefaultMutableTreeNode s22=new DefaultMutableTreeNode("Jane DOC");
        DefaultMutableTreeNode s1=new DefaultMutableTreeNode("Student tree");
        DefaultMutableTreeNode s3=new DefaultMutableTreeNode("Postgraduate  ");
        DefaultMutableTreeNode s31=new DefaultMutableTreeNode("James DOC");
        s2.add(s21);
        s2.add(s22);
        s2.add(s21);
        s3.add(s31);
        s1.add(s2);
        s1.add(s3);
        JTree jt1=new JTree(s1);
        f.add(jt1);
        f.setSize(200,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}