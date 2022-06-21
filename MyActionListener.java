import java.awt.*;
import java.awt.event.*;

import java.util.regex.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyActionListener implements ActionListener
{
	String temp,temp3,CP,CQ,CR,CS;
	Boolean f1, f2, f3;
	MyFrame fm;
	Frame1 fm1;
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
			fm1.setVisible(false);
		}
		if(e.getActionCommand().equals("3 variable k map"))
		{
			fm3 = new Frame3();
			this.fm3.setVisible(true);
			fm2.setVisible(false);
					
		}
		if(e.getActionCommand().equals("4 variable k map"))
		{
			fm4 = new Frame4();
			
			this.fm4.setVisible(true);
			}
		if(e.getActionCommand().equals("<-Back"))
			{
				fm1 = new Frame1();
				this.fm1.setVisible(true);
				fm3.setVisible(false);
			}
			if(e.getActionCommand().equals("<--Back"))
			{
				fm1 = new Frame1();
				this.fm1.setVisible(true);
				fm4.setVisible(false);
			}		
		if(e.getSource() == this.fm2.b12)
		{
			fm1 = new Frame1();
			this.fm1.setVisible(true);
			fm2.setVisible(false);
		}
		if(fm3.isVisible())
		{
			if(e.getSource()==this.fm3.V)
				{
					
				
					temp = this.fm3.V.getLabel();
				
					if(temp== "")
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
						this.fm3.V.setLabel("1");
					}
					else if(f2)
					{
						this.fm3.V.setLabel("0");
					}
					else if(f3)
					{
						this.fm3.V.setLabel("");
					}
				}
				
		}

		if(e.getActionCommand().equals("enter"))
		{
			if(fm2.isVisible())
			{
				CP = this.fm2.P.getLabel();
				CQ = this.fm2.Q.getLabel();
				CR = this.fm2.R.getLabel();
				CS = this.fm2.S.getLabel();
				if(CP == "1" && CQ == "1" && CR == "1" && CS == "1")
				{
					this.fm2.t2.setText("1");
				}
				else if(CP == "0" && CQ == "0" && CR == "0" && CS == "0")
				{
					this.fm2.t1.setText("0");
				}
				else if(CQ == "1" && CR == "1" && CS == "1")
				{
					this.fm2.t2.setText("A+B");
				}
				else if(CP == "1" && CR == "1" && CS == "1")
				{
					this.fm2.t2.setText("A+B'");
				}
				else if(CP == "1" &&  CQ == "1" && CS == "1")
				{
					this.fm2.t2.setText("A'+B");
				}
				else if(CP == "1" && CQ == "1" && CR == "1"  )
				{
					this.fm2.t2.setText("A'+B'");
				}
				else if(CP == "1" && CQ == "1" )
				{
					this.fm2.t2.setText("A'");
				}
				else if(CP == "1" && CR == "1" )
				{
					this.fm2.t2.setText("B'");
				}
				else if(CP == "1" && CS == "1" )
				{
					this.fm2.t2.setText("A'B'+AB");
				}
				else if(CQ == "1" && CR == "1" )
				{
					this.fm2.t2.setText("A'B+AB'");
				}
				else if(CQ == "1" && CS == "1")
				{
					this.fm2.t2.setText("B");
				}
				else if(CR == "1" && CS == "1" )
				{
					this.fm2.t2.setText("A");
				}
				
				else if(CP == "1" )
				{
					this.fm2.t2.setText("A'B'");
				}
				else if(CR == "1" )
				{
					this.fm2.t2.setText("AB'");

					
				}
				else if(CQ == "1" )
				{
					this.fm2.t2.setText("A'B");
					
				}
				else if(CS == "1" )
				{
					this.fm2.t2.setText("AB");
					
				}
				else if(CQ == "0" && CR == "0" && CS == "0")
				{
					this.fm2.t1.setText("(A')(B')");
				}
				else if(CP == "0" && CR == "0" && CS == "0")
				{
					this.fm2.t1.setText("(A')(B)");
				}
				else if(CP == "0" &&  CQ == "0" && CS == "0")
				{
					this.fm2.t1.setText("(A)(B')");
				}
				else if(CP == "0" && CQ == "0" && CR == "0"  )
				{
					this.fm2.t1.setText("(A)(B)");
				}
				else if(CP == "0" && CQ == "0" )
				{
					this.fm2.t1.setText("A");
				}
				else if(CP == "0" && CR == "0" )
				{
					this.fm2.t1.setText("B");
				}
				else if(CP == "0" && CS == "0" )
				{
					this.fm2.t1.setText("(A+B)(A'+B')");
				}
				else if(CQ == "0" && CR == "0" )
				{
					this.fm2.t1.setText("(A+B')(A'+B)");
				}
				else if(CQ == "0" && CS == "0")
				{
					this.fm2.t1.setText("B'");
				}
				else if(CR == "0" && CS == "0" )
				{
					this.fm2.t1.setText("A'");
				}
				
				else if(CP == "0" )
				{
					this.fm2.t1.setText("A+B");
				}
				else if(CR == "0" )
				{

					this.fm2.t1.setText("A'+B");
					
				}
				else if(CQ == "0" )
				{
					this.fm2.t1.setText("A+B'");
					
				}
				else if(CS == "0" )
				{
					this.fm2.t1.setText("A'+B'");
					
				}
			}
		}
		
		if(fm2.isVisible())
		{
				if(e.getSource()== this.fm2.P)
			{
				
				temp = this.fm2.P.getLabel();
				
				if(temp== "")
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
					this.fm2.P.setLabel("1");
				}
				else if(f2)
				{
					this.fm2.P.setLabel("0");
				}
				else if(f3)
				{
					this.fm2.P.setLabel("");
				}
			}
			if(e.getSource()== this.fm2.Q)
			{
				
				temp = this.fm2.Q.getLabel();
				
				if(temp== "")
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
					this.fm2.Q.setLabel("1");
				}
				else if(f2)
				{
					this.fm2.Q.setLabel("0");
				}
				else if(f3)
				{
					this.fm2.Q.setLabel("");
				}
			}
			if(e.getSource()== this.fm2.R)
			{
				
				temp = this.fm2.R.getLabel();
				
				if(temp== "")
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
					this.fm2.R.setLabel("1");
				}
				else if(f2)
				{
					this.fm2.R.setLabel("0");
				}
				else if(f3)
				{
					this.fm2.R.setLabel("");
				}
			}
			if(e.getSource()== this.fm2.S)
			{
				
				temp = this.fm2.S.getLabel();
				
				if(temp== "")
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
					this.fm2.S.setLabel("1");
				}
				else if(f2)
				{
					this.fm2.S.setLabel("0");
				}
				else if(f3)
				{
					this.fm2.S.setLabel("");
				}
			}
				
		}
			
		
		
		
		
		
	}
}
	
	
