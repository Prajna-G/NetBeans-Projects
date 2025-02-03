package simplecalculator;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class SimpleCalculator extends JFrame implements ActionListener {
	static JFrame f;
	static JTextField l;	
	String s0, s1, s2;

	SimpleCalculator()
	{
		s0 = s1 = s2 = "";
	}
        
	public static void main(String args[])
	{		
		f = new JFrame("calculator");

		try {
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		SimpleCalculator c = new SimpleCalculator();
		l = new JTextField(16);
		l.setEditable(false);					
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton beq1 = new JButton("=");
		JButton ba = new JButton("+");
		JButton bs = new JButton("-");
		JButton bd = new JButton("/");
		JButton bm = new JButton("*");
		JButton beq = new JButton("C");
		JButton be = new JButton(".");
		JPanel p = new JPanel();
                
		bm.addActionListener(c);
		bd.addActionListener(c);
		bs.addActionListener(c);
		ba.addActionListener(c);
		b9.addActionListener(c);
		b8.addActionListener(c);
		b7.addActionListener(c);
		b6.addActionListener(c);
		b5.addActionListener(c);
		b4.addActionListener(c);
		b3.addActionListener(c);
		b2.addActionListener(c);
		b1.addActionListener(c);
		b0.addActionListener(c);
		be.addActionListener(c);
		beq.addActionListener(c);
		beq1.addActionListener(c);

		p.add(l);
		p.add(ba);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(bs);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(bm);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(bd);
		p.add(be);
		p.add(b0);
		p.add(beq);
		p.add(beq1);

		p.setBackground(Color.pink);
	
		f.add(p);
		f.setSize(200, 220);
		f.show();
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();

		
		if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.') {
			
			if (!s1.equals(""))
				s2 = s2 + s;
			else
				s0 = s0 + s;

			l.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == 'C') {
			
			s0 = s1 = s2 = "";

			
			l.setText(s0 + s1 + s2);
		}
		else if (s.charAt(0) == '=') {

			double te;
			
			if (s1.equals("+"))
				te = (Double.parseDouble(s0) + Double.parseDouble(s2));
			else if (s1.equals("-"))
				te = (Double.parseDouble(s0) - Double.parseDouble(s2));
			else if (s1.equals("/"))
				te = (Double.parseDouble(s0) / Double.parseDouble(s2));
			else
				te = (Double.parseDouble(s0) * Double.parseDouble(s2));
			
			l.setText(s0 + s1 + s2 + "=" + te);
			
			s0 = Double.toString(te);

			s1 = s2 = "";
		}
		else {
			
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			
			else {
				double te;

				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));
				
				s0 = Double.toString(te);
				s1 = s;				
				s2 = "";
			}
			l.setText(s0 + s1 + s2);
		}
	}
}
