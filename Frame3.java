import java.awt.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.util.regex.*;
class Frame3 extends Frame
{
	Button R,S,V,W,P,Q,T,U,R0,R1,R2;
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
	
		R0 = new Button("Enter");
		R1 = new Button("Clear");
		R2 = new Button("<-Back");
		
		 lm = new Label("Max");
		 ln = new Label("Min");
		
		 R = new Button("");
		 S = new Button("");
		 V = new Button("");
		 W = new Button("");
		 P = new Button("");
		 Q = new Button("");
		 T = new Button("");
		 U = new Button("");
		 
		 l1 = new Label("C'");
		 l2 = new Label("C");
		 l3= new Label("A'B'");
		 l4= new Label("A'B");
		 l5 = new Label("AB");
		 l6 = new Label("AB'");
		
		P.setBounds(300,300,50,50);//P
		Q.setBounds(350,300,50,50);//Q
		R.setBounds(400,300,50,50);//R
		S.setBounds(450,300,50,50);//S
		T.setBounds(300,350,50,50);//T
		U.setBounds(350,350,50,50);//U
		V.setBounds(400,350,50,50);//V
		W.setBounds(450,350,50,50);//W
		
		
		R0.setBounds(350,500,75,55);
		R1.setBounds(625,500,75,55);
		R2.setBounds(925,500,75,55);
		
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
		
		R.setFont(f1);
		S.setFont(f1);
		V.setFont(f1);
		W.setFont(f1);
		P.setFont(f1);
		Q.setFont(f1);
		T.setFont(f1);
		U.setFont(f1);
		R0.setFont(f1);
		R1.setFont(f1);
		R2.setFont(f1);
		
		lm.setFont(f1);
		ln.setFont(f1);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		
		add(R);
		add(S);
		add(V);
		add(W);
		add(P);
		add(Q);
		add(T);
		add(U);
		
		add(R0);
		add(R1);
		add(R2);
		
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
		setBackground(Color.GRAY);
		setForeground(Color.BLACK);
		 R.addActionListener(L1);
		 S.addActionListener(L1);
		 V.addActionListener(L1);
		 W.addActionListener(L1);
		 P.addActionListener(L1);
		 Q.addActionListener(L1);
		 T.addActionListener(L1);
		 U.addActionListener(L1);
		R0.addActionListener(L1);
		R1.addActionListener(L1);
		R2.addActionListener(L1);
		
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
			
		});
	}
		
		
		
		
		
		
		
	
}








