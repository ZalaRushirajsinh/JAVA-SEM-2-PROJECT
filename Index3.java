import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index3 extends Frame
{
		Label l1,l2,l3;
		TextField t1,t2;
		Button b1,b2;
		MyActionListener fm1 = new MyActionListener(this);
		Index3()
		
		{
			super("STUDENT LOGIN PAGE");
			setLayout(null);
			setBounds(100,100,800,500);
			setBackground(Color.PINK);
			setForeground(Color.BLUE);
			
			l1 = new Label("USERNAME");
			l2 = new Label("PASSWORD");
			l3 = new Label("STUDENT LOGIN");
			t1 = new TextField();
			t2 = new TextField();
			b1 = new Button(">");
			b2 = new Button("<");
			
			Font f1 = new Font("Arial",Font.BOLD,20);
			l1.setFont(f1);
			l2.setFont(f1);
			l3.setFont(f1);
			t1.setFont(f1);
			t2.setFont(f1);
			b1.setFont(f1);
			b2.setFont(f1);
			
			
			add(l1);
			add(l2);
			add(l3);
			add(t1);
			add(t2);
			add(b1);
			add(b2);
			
			l1.setBounds(100,100,150,50);
			l2.setBounds(100,180,150,50);
			l3.setBounds(250,50,250,50);
			t1.setBounds(350,100,250,50);
			t2.setBounds(350,180,250,50);
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