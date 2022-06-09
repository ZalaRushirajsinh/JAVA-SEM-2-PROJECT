import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index4 extends Frame
{
		Label l1,l2,l3;
		TextField t1,t2,t3;
		Button b1,b2;
		MyActionListener fm1 = new MyActionListener(this);
		Index4()
		
		{
			super("SEMESTERWISE FEES");
			setLayout(null);
			setBounds(0,0,800,500);
			setBackground(Color.PINK);
			setForeground(Color.BLUE);
			
			l1 = new Label("ENTER STUDENT NAME");
			l2 = new Label("ENTER ENROLL NO.");
			l3 = new Label("ENTER SEMESTER");
			t1 = new TextField();
			t2 = new TextField();
			t3 = new TextField();
			b1 = new Button("->");
			b2 = new Button("<-");
			
			Font f1 = new Font("Arial",Font.BOLD,20);
			l1.setFont(f1);
			l2.setFont(f1);
			l3.setFont(f1);
			t1.setFont(f1);
			t2.setFont(f1);
			t3.setFont(f1);
			b1.setFont(f1);
			b2.setFont(f1);
			
			
			add(l1);
			add(l2);
			add(l3);
			add(t1);
			add(t2);
			add(t3);
			add(b1);
			add(b2);
			
			l1.setBounds(100,100,150,50);
			l2.setBounds(100,180,150,50);
			l3.setBounds(250,50,250,50);
			t1.setBounds(350,100,250,50);
			t2.setBounds(350,180,250,50);
			t3.setBounds(350,260,250,50);
			b1.setBounds(400,300,250,50);
			b2.setBounds(100,300,250,50);
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
