import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
class MyActionListener implements ActionListener
{
	MyFrame fm;
	MyActionListener(MyFrame f)
	{
		this.fm = f;
	}
	public void actionPerformed(ActionEvent e)
	{
		String name = this.fm.t1.getText();
		String mail_id = this.fm.t2.getText();
		if(e.getActionCommand().equals("conform"))
		{
			System.out.println(name);
			System.out.println(mail_id);
		}
		
	}
}