import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index1 extends Frame
{
		Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
		TextField t1,t2,t3,t4,t5,t7,t8,t9,t10,t11;
		Button b1,b2;
		CheckboxGroup cb;
		Checkbox c1,c2;
		MyActionListener fm1 = new MyActionListener(this);
		Index1()
		{
			super("STUDENT REGISTRATION");
			setLayout(null);
			setBounds(100,100,1500,1500);
			setBackground(Color.PINK);
			setForeground(Color.BLUE);
			
			l1 = new Label("NAME");
			l2 = new Label("SURNAME");
			l3 = new Label("CLASS");
			l4 = new Label("STREAM");
			l5 = new Label("GR.NO");
			l6 = new Label("GENDER");
			l7 = new Label("DOB");
			l8 = new Label("MOBILE.NO");
			l9 = new Label("ADDRESS");
			l10 = new Label("BLOOD GROUP");
			l11= new Label("FATHER'S MOBILE");
			t1 = new TextField();
			t2 = new TextField();
			t3 = new TextField();
			t4 = new TextField();
			t5 = new TextField();
			t7 = new TextField();
			t8 = new TextField();
			t9 = new TextField();
			t10 = new TextField();
			t11 = new TextField();
			cb = new CheckboxGroup();
			c1 = new Checkbox("MALE",cb,false);
			c2 = new Checkbox("FEMALE",cb,false);
			b1 = new Button("SAVE");
			b2 = new Button("BACK");
			
			
			
			Font f1 = new Font("TIMES",Font.BOLD,20);
			l1.setFont(f1);
			l2.setFont(f1);
			l3.setFont(f1);
			l4.setFont(f1);
			l5.setFont(f1);
			l6.setFont(f1);
			l7.setFont(f1);
			l8.setFont(f1);
			l9.setFont(f1);
			l10.setFont(f1);
			l11.setFont(f1);
			t1.setFont(f1);
			t2.setFont(f1);
			t3.setFont(f1);
			t4.setFont(f1);
			t5.setFont(f1);
			t7.setFont(f1);
			t8.setFont(f1);
			t9.setFont(f1);
			t10.setFont(f1);
			t11.setFont(f1);
			c1.setFont(f1);
			c2.setFont(f1);
			b1.setFont(f1);
			b2.setFont(f1);
			
			add(l1);
			add(l2);
			add(l3);
			add(l4);
			add(l5);
			add(l6);
			add(l7);
			add(l8);
			add(l9);
			add(l10);
			add(l11);
			add(t1);
			add(t2);
			add(t3);
			add(t4);
			add(t5);
			add(t7);
			add(t8);
			add(t9);
			add(t10);
			add(t11);
			add(c1);
			add(c2);
			add(b1);
			add(b2);
			
			l1.setBounds(100,100,150,50);
			l2.setBounds(900,100,150,50);
			l3.setBounds(100,180,150,50);
			l4.setBounds(900,180,150,50);
			l5.setBounds(100,260,150,50);
			l6.setBounds(100,500,150,50);
			l7.setBounds(100,420,150,50);
			l8.setBounds(100,340,150,50);
			l9.setBounds(900,420,150,50);
			l10.setBounds(900,260,200,50);
			l11.setBounds(900,340,200,50);
			t1.setBounds(350,100,250,50);
			t2.setBounds(1100,100,250,50);
			t3.setBounds(350,180,250,50);
			t4.setBounds(1100,180,250,50);
			t5.setBounds(350,260,250,50);
			t7.setBounds(350,420,250,50);
			t8.setBounds(350,340,250,50);
			t9.setBounds(1100,420,250,50);
			t10.setBounds(1100,260,250,50);
			t11.setBounds(1100,340,250,50);
			c1.setBounds(350,500,250,50);
			c2.setBounds(650,500,250,50);
			b1.setBounds(900,650,250,50);
			b2.setBounds(400,650,250,50);
			b1.addActionListener(fm1);
			b2.addActionListener(fm1);
			
			
		addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
					System.exit(0);
				}
			});
	}
	public static void main(String args[])
	{
		Index fm = new Index();
		fm.setVisible(true);
	}	
}	