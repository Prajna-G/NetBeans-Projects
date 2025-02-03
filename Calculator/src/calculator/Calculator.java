
package calculator;

import java.awt.*;
import java.awt.event.*;
 
class Calculator implements ActionListener
{
  
Frame f=new Frame("Simple Calculator");
Label l1=new Label("Enter Number");
Label l2=new Label("Enter Number");
Label l3=new Label("Result");
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
Button b1=new Button("Add");
Button b2=new Button("Add");
Button b3=new Button("Add");
Button b4=new Button("Add");
Button b5=new Button("Add");
Button b6=new Button("Add");
Button b7=new Button("Add");
Button b8=new Button("Add");
Button b9=new Button("Add");
Button b0=new Button("Add");
Button ba=new Button("+");
Button bs=new Button("-");
Button bm=new Button("*");
Button bd=new Button("/");
  
  
Calculator()
{
l1.setBounds(50,100,100,20);
l2.setBounds(50,150,100,20);
l3.setBounds(50,200,100,20);    
t1.setBounds(200,100,100,20);
t2.setBounds(200,150,100,20);
t3.setBounds(200,200,100,20);  
ba.setBounds(50,250,50,20);
bs.setBounds(110,250,50,20);
bm.setBounds(170,250,50,20);
bd.setBounds(230,250,50,20);
b1.setBounds(0, 0, 0, 0);
b2.setBounds(0, 0, 0, 0);
b3.setBounds(0, 0, 0, 0);
b4.setBounds(0, 0, 0, 0);
b5.setBounds(0, 0, 0, 0);
b6.setBounds(0, 0, 0, 0);
b7.setBounds(0, 0, 0, 0);
b8.setBounds(0, 0, 0, 0);
b9.setBounds(0, 0, 0, 0);
b0.setBounds(0, 0, 0, 0);
f.add(l1);
f.add(l2);
f.add(l3);
f.add(t1);
f.add(t2);
f.add(t3);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b0);
f.add(ba);
f.add(bs);
f.add(bm);
f.add(bd);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
ba.addActionListener(this);
bs.addActionListener(this);
bm.addActionListener(this);
bd.addActionListener(this);
t3.setEditable(false);
f.setLayout(null);
f.setVisible(true);
f.setSize(500,500);
}
  
  
public void actionPerformed(ActionEvent e)
{
int i=Integer.parseInt(t1.getText());
int j=Integer.parseInt(t2.getText());
    
if(e.getSource()==ba)
{
t3.setText(String.valueOf(i+j));
}
      
if(e.getSource()==bs)
{
t3.setText(String.valueOf(i-j));
}
    
if(e.getSource()==bm)
{
t3.setText(String.valueOf(i*j));
}
    
if(e.getSource()==bd)
{
t3.setText(String.valueOf(i/j));
}
}
  
public static void main(String args[])
{
new Calculator();
}
}