import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
import java.awt.Container.*;

public class Index5 extends Frame
{
	Label l1,l2,l3,l4;
	Button bt1,bt2,bt3,bt4,bt5,bt6;
	MyActionListener fm = new MyActionListener(this);
	Index5()
	{
		super("Home Page");
		setLayout(null);
		setBounds(0,0,800,800);
		setLayout(null);
	 
	 
		setBackground(Color.RED);
		setForeground(Color.BLUE);

		l1=new Label("FEE REPORT");
		bt1=new Button("SEMESTERWISE FEES");
		bt2=new Button("BUS DETAILS");
		bt3=new Button("PENDING FEES");
		bt4=new Button("DETAILS OF PAYMENT");
		bt5 = new Button("NEXT");
		bt6 = new Button("PREVIOUS");
		
		
		Font f=new Font("TIMES",Font.BOLD,20);
		Font f1=new Font("TIMES",Font.BOLD,20);
		Font f2=new Font("ITALIC",Font.BOLD,30);
		l1.setFont(f2);
		
		bt1.setFont(f1);
		bt2.setFont(f1);
		bt3.setFont(f1);
		bt4.setFont(f1);
		bt5.setFont(f1);
		bt6.setFont(f1);
		
		
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);
		add(bt5);
		add(bt6);
		
	
		l1.setBounds(270,100,200,50);
		
		bt1.setBounds(250,100,270,70);
		bt2.setBounds(250,200,270,70);
		bt3.setBounds(250,300,270,70);
		bt4.setBounds(250,400,270,70);
		bt5.setBounds(400,500,200,70);
		bt6.setBounds(100,500,200,70);
		
		
		bt1.addActionListener(fm);
		bt2.addActionListener(fm);
		bt3.addActionListener(fm);
		bt4.addActionListener(fm);
		bt5.addActionListener(fm);
		bt6.addActionListener(fm);
		
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
	