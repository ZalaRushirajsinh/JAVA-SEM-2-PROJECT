import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;

public class MyActionListener implements ActionListener 
{
	Index fm;
	Index1 fm1;
	Index2 fm2;
	Index3 fm3;
	Index4 fm4;
	Index5 fm5;
	
	
	MyActionListener(Index m)
	{
		this.fm = m;
	}
	MyActionListener(Index1 m)
	{
		this.fm1 = m;
	}
	MyActionListener(Index2 m)
	{
		this.fm2 = m;
	}
	MyActionListener(Index3 m)
	{
		this.fm3 = m;
	}
	MyActionListener(Index4 m)
	{
		this.fm4 = m;
	}
	MyActionListener(Index5 m)
	{
		this.fm5 = m;
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getActionCommand().equals("STUDENT REGISTRATION"))
		{
			fm1 = new Index1();
			fm1.setVisible(true);
			fm.setVisible(false);
		}
		if(ae.getActionCommand().equals("ADMIN LOGIN"))
		{
			fm2 = new Index2();
			fm2.setVisible(true);
			fm1.setVisible(false);
		}
		if(ae.getActionCommand().equals("STUDENT LOGIN"))
		{
			fm3 = new Index3();
			fm3.setVisible(true);
			fm2.setVisible(false);
		}
	
		if(ae.getActionCommand().equals(">"))
		{
			fm5 = new Index5();
			fm5.setVisible(true);
			fm3.setVisible(false);
		}
		if(ae.getActionCommand().equals("PREVIOUS"))
		{
			fm3 = new Index3();
			fm3.setVisible(true);
			fm5.setVisible(false);
		}
	
		if(ae.getActionCommand().equals("BACK"))
		{
			fm = new Index();
			fm.setVisible(true);
			fm1.setVisible(false);
		}
		if(ae.getActionCommand().equals("back"))
		{
			fm = new Index();
			fm.setVisible(true);
			fm2.setVisible(false);
		}
		if(ae.getActionCommand().equals("<"))
		{
			fm = new Index();
			fm.setVisible(true);
			fm3.setVisible(false);
		}
	}
}