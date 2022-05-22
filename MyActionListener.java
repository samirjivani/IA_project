import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
import java.io.*;
import javax.swing.*;
import java.lang.*;
class MyActionListener implements ActionListener
{
	Frame1 fm1;
	MyFrame fm;
	Frame2 fm2;
	MyActionListener(MyFrame f)
	{
		this.fm = f;
	}
	MyActionListener(Frame1 m)
	{
		this.fm1 = m;
	}
	MyActionListener(Frame2 g)
	{
		this.fm2 = g;
	}
	public void actionPerformed(ActionEvent e)
	{
		String name = this.fm.t1.getText();
		String mail_id = this.fm.t2.getText();
		if(e.getActionCommand().equals("conform"))
		{
			System.out.println(name);
			System.out.println(mail_id);
			fm1 = new Frame1();
			this.fm1.setVisible(true);
			this.fm.setVisible(false);
		}
		if(e.getActionCommand().equals("2 variable k map"))
		{
			fm2 = new Frame2();
			this.fm2.setVisible(true);
			this.fm1.setVisible(false);
			this.fm.setVisible(false);
		}
		
	}
}