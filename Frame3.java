import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame3 extends Frame
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	TextField t1,t2;
	Label l1,l2,l3,l4,l5,l6,l7,lm,ln;
	MyActionListener L1 = new MyActionListener(this);
	Frame3()
	{
		super("3'svariable");//doubt
		this.setBounds(0,0,1000,800);
		setLayout(null);
		t1 = new TextField();
			t2 = new TextField();
	
		b10 = new Button("Enter");
		b11 = new Button("Clear");
		b12 = new Button("Back");
		
		 lm = new Label("Max");
		 ln = new Label("Min");
		
		 b1 = new Button("");
		 b2 = new Button("");
		 b3 = new Button("");
		 b4 = new Button("");
		 b5 = new Button("");
		 b6 = new Button("");
		 b7 = new Button("");
		 b8 = new Button("");
		 b9 = new Button("");
		 
		  l1 = new Label("A'");
		 l2 = new Label("A");
		  l3= new Label("B'C'");
		 l4= new Label("B'C");
		 l5 = new Label("BC");
		 l6 = new Label("BC'");
		
		
		b1.setBounds(400,300,50,50);//2->5->6
		b2.setBounds(450,300,50,50);//5->6
		b3.setBounds(400,350,50,50);
		b4.setBounds(450,350,50,50);
		 b5.setBounds(300,300,50,50);//1
		 b6.setBounds(350,300,50,50);//1->2
		// b7.setBounds(100,100,50,50);//3->4
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
		l5.setBounds(410,250,40,40);
		l6.setBounds(460,250,40,40);
		
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b5.setFont(f1);
		b6.setFont(f1);
		b7.setFont(f1);
		b8.setFont(f1);
		b9.setFont(f1);
		b10.setFont(f1);
		b11.setFont(f1);
		b12.setFont(f1);
		
		lm.setFont(f1);
		ln.setFont(f1);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		
		add(b10);
		add(b11);
		add(b12);
		
		add(t1);
		add(t2);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(ln);
		add(lm);
		
		 b1.addActionListener(L1);
		 b2.addActionListener(L1);
		 b3.addActionListener(L1);
		 b4.addActionListener(L1);
		 b5.addActionListener(L1);
		 b6.addActionListener(L1);
		 b7.addActionListener(L1);
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








