import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class MyFrame extends Frame
{
	TextField t1,t2;
	Button b1;
	Label l1,l2;
	JLabel l;
	
	Font f1;
	MyActionListener L1 = new MyActionListener(this);
	MyFrame(String s)
	{
		super(s);
		this.setBounds(0,0,1000,800);
		setLayout(null);
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button("conform");
		l1 = new Label("name");
		l2 = new Label("mail id");
		
		l1.setBounds(420,250,70,30);
		t1.setBounds(525,250,300,30);
		
		l2.setBounds(420,300,100,30);
		t2.setBounds(525,300,300,30);
		
		b1.setBounds(500,400,200,40);
		
		l= new JLabel(new ImageIcon("C:\Users\Admin\Downloads\image.jpg"));
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		t1.setFont(f1);
		t2.setFont(f1);
		l1.setFont(f1);
		l2.setFont(f1);
		b1.setFont(f1);
		
		add(t1);
		add(l1);
		add(t2);
		add(l2);
		add(b1);
		add(l);
		
		b1.addActionListener(L1);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		public static void main(String args[])
		{
			MyFrame mf = new MyFrame("IA project");
			mf.setVisible(true);
			
		}
		
		
		
		
		
		
	
}