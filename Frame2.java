import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame2 extends Frame
{
	Button b5,b6,b8,b9,b10,b11,b12;
	Label l1,l2,l3,l4,lm,ln;
	TextField t1,t2;
	MyActionListener L1 = new MyActionListener(this);
	Frame2()
	{
		super("2'svariable");//doubt
		this.setBounds(0,0,1000,800);
		setLayout(null);
		
		t1 = new TextField();
			t2 = new TextField();
	
		b10 = new Button("enter");
		b11 = new Button("clear");
		b12 = new Button("Back");
		
		
		  l1 = new Label("A'");
		 l2 = new Label("A");
		  l3= new Label("B'");
		 l4= new Label("B");
		 lm = new Label("Max");
		 ln = new Label("Min");
		 
		 
		
		
		 b5 = new Button("X");
		 b6 = new Button("X");
		 
		 b8 = new Button("X");
		 b9 = new Button("X");
		
		
		 b5.setBounds(300,300,50,50);
		 b6.setBounds(350,300,50,50);
		
		 b8.setBounds(300,350,50,50);
		 b9.setBounds(350,350,50,50);
		
		
		b10.setBounds(350,500,75,55);
		b11.setBounds(625,500,75,55);
		b12.setBounds(925,500,75,55);
		
		t1.setBounds(700,300,200,40);
		t2.setBounds(700,350,200,40);
		
		lm.setBounds(650,300,50,50);
		ln.setBounds(650,350,50,50);
		
		l1.setBounds(250,300,40,40);
		l2.setBounds(250,350,40,40);
		l3.setBounds(305,250,40,40);
		l4.setBounds(360,250,40,40);
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		
		b5.setFont(f1);
		b6.setFont(f1);
		
		b8.setFont(f1);
		b9.setFont(f1);
		b10.setFont(f1);
		b11.setFont(f1);
		b12.setFont(f1);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		
		lm.setFont(f1);
		ln.setFont(f1);
		
		
		add(b5);
		add(b6);
		
		add(b8);
		add(b9);
		
		add(b10);
		add(b11);
		add(b12);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		add(lm);
		add(ln);
		add(t1);
		add(t2);
		
		
		 b5.addActionListener(L1);
		 b6.addActionListener(L1);
		 
		 b8.addActionListener(L1);
		 b9.addActionListener(L1);
		b10.addActionListener(L1);
		b11.addActionListener(L1);
		b12.addActionListener(L1);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		
		
		
		
		
	
}









}
