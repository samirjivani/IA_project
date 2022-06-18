import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame4 extends Frame
{
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
	Label l1,l2,l3,l4,l5,l6,l7,l8,lm,ln;
	TextField t1,t2;
	MyActionListener L1 = new MyActionListener(this);
	Frame4()
	{
		super("4'svariable");//doubt
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
		
		 b13 = new Button("");
		 b14 = new Button("");
		 b15 = new Button("");
		 b16 = new Button("");
		 b17 = new Button("");
		 b18 = new Button("");
		 b19 = new Button("");
		 
		 l1 = new Label("A'B'");
		 l2 = new Label("A'B");
		 l3 = new Label("AB");
		 l4 = new Label("AB'");
		 l5 = new Label("C'D'");
		 l6 = new Label("C'D");
		 l7 = new Label("CD");
		 l8 = new Label("CD'");
		
		
		b1.setBounds(400,300,50,50);//2->5->6
		b2.setBounds(450,300,50,50);//5->6
		b3.setBounds(400,350,50,50);
		b4.setBounds(450,350,50,50);
		 b5.setBounds(300,300,50,50);//1
		 b6.setBounds(350,300,50,50);//1->2
		
		 b8.setBounds(300,350,50,50);
		 b9.setBounds(350,350,50,50);
		 b7.setBounds(300,400,50,50);//3->4
		 b13.setBounds(350,400,50,50);
		 b14.setBounds(400,400,50,50);
		 b15.setBounds(450,400,50,50);
		 b16.setBounds(300,450,50,50);
		 b17.setBounds(350,450,50,50);
		 b18.setBounds(400,450,50,50);
		 b19.setBounds(450,450,50,50);
		b10.setBounds(350,600,75,55);
		b11.setBounds(625,600,75,55);
		b12.setBounds(925,600,75,55);
		
		t1.setBounds(700,350,200,40);
		t2.setBounds(700,400,200,40);
		
		lm.setBounds(650,350,50,50);
		ln.setBounds(650,400,50,50);
		
		l1.setBounds(250,300,40,40);
		l2.setBounds(250,350,40,40);
		l3.setBounds(250,400,40,40);
		l4.setBounds(250,450,40,40);
		l5.setBounds(305,250,40,40);
		l6.setBounds(360,250,40,40);
		l7.setBounds(410,250,40,40);
		l8.setBounds(460,250,40,40);
		
		
		
		Font f1 = new Font("Arial",Font.BOLD,20);
		
		t1.setFont(f1);
		t2.setFont(f1);
		
		
		
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
		b13.setFont(f1);
		b14.setFont(f1);
		b15.setFont(f1);
		b16.setFont(f1);
		b17.setFont(f1);
		b18.setFont(f1);
		b19.setFont(f1);
		
		lm.setFont(f1);
		ln.setFont(f1);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		
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
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		
		add(t1);
		add(t2);
		
		add(lm);
		add(ln);
		setBackground(Color.GRAY);
		setForeground(Color.BLACK);
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
		b13.addActionListener(L1);
		b14.addActionListener(L1);
		b15.addActionListener(L1);
		b16.addActionListener(L1);
		b17.addActionListener(L1);
		b18.addActionListener(L1);
		b19.addActionListener(L1);
		
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		
		
		
		
		
	
}








