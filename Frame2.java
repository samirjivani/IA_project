import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame2 extends Frame
{
	Button b3,b4,b5;
	MyActionListener L1 = new MyActionListener(this);
	Frame2()
	{
		super("2'svariable");//doubt
		this.setBounds(0,0,1000,800);
		setLayout(null);
	
		b3 = new Button("enter");
		b4 = new Button("clear");
		b5 = new Button("exit");
		
		
		
		
		b3.setBounds(350,500,75,55);
		b4.setBounds(625,500,75,55);
		b5.setBounds(925,500,75,55);
		
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		
		add(b3);
		add(b4);
		add(b5);
		
		b3.addActionListener(L1);
		b4.addActionListener(L1);
		b5.addActionListener(L1);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		
		
		
		
		
	
}