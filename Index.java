import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

/*import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;*/

public class Index extends Frame
{
	MenuBar mb1;
	Menu m1,m2;
	Font f1;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6;
	JLabel lPic,j1;
	
	MyActionListener ml = new MyActionListener(this);
	ImageIcon img;
	Index()
	{
		super("DASHBOARD");
		setLayout(null);
		setBounds(0,0,1260,800);
		
		f1 = new Font("Times",Font.BOLD,25);
		img = new ImageIcon("Pic.jpeg");
		lPic = new JLabel(img);
		lPic.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
		lPic.setVisible(true);
		add(lPic);
		
		mb1 = new MenuBar();
		m1 = new Menu("STUDENT REPORT");
		m2 = new Menu("ADMIN");
		mi1 = new MenuItem("STUDENT REGISTRATION");
		mi2 = new MenuItem("STUDENT LOGIN");
		mi3 = new MenuItem("CLOSE");
		mi4 = new MenuItem("ADMIN LOGIN");
		mi5 = new MenuItem("OPEN");
		mi6 = new MenuItem("CLOSE");
		
		mi1.setFont(f1);
		mi2.setFont(f1);
		mi3.setFont(f1);
		mi4.setFont(f1);
		mi5.setFont(f1);
		mi6.setFont(f1);
		//m1.setFont(f1);
		//mb1.setFont(f1);
		
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add("-");
		m1.add(mi3);
		m2.add(mi4);
		m2.add("-");
		m2.add(mi5);
		m2.add(mi6);
		mb1.add(m1);
		mb1.add(m2);
		setMenuBar(mb1);
		
		mi1.addActionListener(ml);
		mi2.addActionListener(ml);
		mi3.addActionListener(ml);
		mi4.addActionListener(ml);
		mi5.addActionListener(ml);
		mi6.addActionListener(ml);
		
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