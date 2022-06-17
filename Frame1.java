import java.awt.*;
import java.awt.event.*;

import java.util.regex.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyActionListener implements ActionListener
{
	String temp,temp2;
	Boolean f1,f2,f3,f4,f5,f6;
	Frame1 fm1;
	MyFrame fm;
	Frame2 fm2;
	Frame3 fm3;
	Frame4 fm4;
	MyActionListener(MyFrame i)
	{
		this.fm = i;
	}
	MyActionListener(Frame1 m)
	{
		this.fm1 = m;
	}
	MyActionListener(Frame2 g)
	{
		this.fm2 = g;
	}
	MyActionListener(Frame3 f)
	{
		this.fm3 = f;
	}
	MyActionListener(Frame4 h)
	{
		this.fm4 = h;
	}
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getActionCommand().equals("Confirm"))
		{
			
			fm1 = new Frame1();
			
			this.fm1.setVisible(true);
		}
		if(e.getActionCommand().equals("2 variable k map"))
		{
			fm2 = new Frame2();
			this.fm2.setVisible(true);
			this.fm1.setVisible(false);
			
			
			
			
		}
		
		if(e.getActionCommand().equals("3 variable k map"))
		{
			fm3 = new Frame3();
			this.fm3.setVisible(true);
				
		}
		if(e.getActionCommand().equals("4 variable k map"))
		{
			fm4 = new Frame4();
			
			this.fm4.setVisible(true);
			
			
		}
		
			if(e.getSource()== this.fm2.b5)
			{
				
				temp = this.fm2.b5.getLabel();
				
				if(temp== "X")
				{
					f1 = true;
					f2 = false;
					f3 = false;
					
				}
				else if(temp== "1")
				{
					f2 = true;
					f3 = false;
					f1 = false;
					
				}
				 else if(temp== "0")
				{
					f3 = true;
					f2 = false;
					f1 = false;
					
				}
				if(f1)
				{
					this.fm2.b5.setLabel("1");
				}
				else if(f2)
				{
					this.fm2.b5.setLabel("0");
				}
				else if(f3)
				{
					this.fm2.b5.setLabel("X");
				}
			}
			
		temp2 = this.fm2.b5.getLabel();
		if(temp2 == "1" )
		{
			this.fm2.t1.setText("A");
		}
		
				
			
		
		
		
		
		}
}
	
	
