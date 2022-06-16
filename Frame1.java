import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame1 extends Frame
{
	Button b1,b2,b3,b4,b5,b6;
	Label l1;
	Font f1;
	MyActionListener L1 = new MyActionListener(this);
	Frame1()
	{
		super("variable");//doubt
		this.setBounds(0,0,1000,800);
		setLayout(null);
		
		b1 = new Button("2 variable k map");
		b2 = new Button("3 variable k map");
		b6 = new Button("4 variable k map");
		b3 = new Button("enter");
		b4 = new Button("clear");
		b5 = new Button("exit");
		l1 = new Label("which type of k map you want?");
		
		
		l1.setBounds(500,200,600,75);
		
		b1.setBounds(500,300,400,50);
		b2.setBounds(500,400,400,50);
		b6.setBounds(500,500,400,50);
		b3.setBounds(350,600,75,55);
		b4.setBounds(625,600,75,55);
		b5.setBounds(925,600,75,55);
		
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		
		l1.setFont(f1);
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		
		add(l1);
		add(b1);
		add(b2);
		
		add(b6);
		b1.addActionListener(L1);
		b2.addActionListener(L1);
		b3.addActionListener(L1);
		b4.addActionListener(L1);
		b5.addActionListener(L1);
		b6.addActionListener(L1);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		
		
		
		
		
	
}
