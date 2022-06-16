import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
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
		if(e.getActionCommand().equals("Back"))
		{
			fm1 = new Frame1();
			this.fm1.setVisible(true);
			
			
		}
		
//fm2 button logic
	
		
		if(fm4.isVisible())
		{
			if(e.getSource()== this.fm4.b1)
			{
				
				temp = this.fm4.b1.getLabel();
				
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
					this.fm4.b1.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b1.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b1.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b2)
			{
				
				temp = this.fm4.b2.getLabel();
				
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
					this.fm4.b2.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b2.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b2.setLabel("");
				}
			}
	
	
				if(e.getSource()== this.fm4.b3)
			{
				
				temp = this.fm4.b3.getLabel();
				
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
					this.fm4.b3.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b3.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b3.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b6)
			{
				
				temp = this.fm4.b4.getLabel();
				
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
					this.fm4.b4.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b4.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b4.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b5)
			{
				
				temp = this.fm4.b5.getLabel();
				
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
					this.fm4.b5.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b5.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b5.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b6)
			{
				
				temp = this.fm4.b6.getLabel();
				
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
					this.fm4.b6.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b6.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b6.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b7)
			{
				
				temp = this.fm4.b7.getLabel();
				
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
					this.fm4.b7.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b7.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b7.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b8)
			{
				
				temp = this.fm4.b8.getLabel();
				
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
					this.fm4.b8.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b8.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b8.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b9)
			{
				
				temp = this.fm4.b9.getLabel();
				
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
					this.fm4.b9.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b9.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b9.setLabel("");
				}
			}
		if(e.getSource()== this.fm4.b13)
			{
				
				temp = this.fm4.b13.getLabel();
				
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
					this.fm4.b13.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b13.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b13.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b14)
			{
				
				temp = this.fm4.b14.getLabel();
				
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
					this.fm4.b14.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b14.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b14.setLabel("");
				}
			}
		if(e.getSource()== this.fm4.b15)
			{
				
				temp = this.fm4.b15.getLabel();
				
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
					this.fm4.b15.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b15.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b15.setLabel("");
				}
			}	if(e.getSource()== this.fm4.b16)
			{
				
				temp = this.fm4.b16.getLabel();
				
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
					this.fm4.b16.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b16.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b16.setLabel("");
				}
			}
		if(e.getSource()== this.fm4.b17)
			{
				
				temp = this.fm4.b17.getLabel();
				
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
					this.fm4.b17.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b17.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b17.setLabel("");
				}
			}
				if(e.getSource()== this.fm4.b18)
			{
				
				temp = this.fm4.b18.getLabel();
				
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
					this.fm4.b18.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b18.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b18.setLabel("");
				}
			}
		if(e.getSource()== this.fm4.b19)
			{
				
				temp = this.fm4.b19.getLabel();
				
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
					this.fm4.b19.setLabel("1");
				}
				else if(f2)
				{
					this.fm4.b19.setLabel("0");
				}
				else if(f3)
				{
					this.fm4.b19.setLabel("");
				}
			}
		}
		
		
		}
		
	
			
	
	}

		

		

			}
			
	
	
}
