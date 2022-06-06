
import java.awt.*;
import java.awt.event.*;

public class AWT_Calculator_15 extends Frame {
	Label l1,l2,l4;
	TextField t1,t2;
	Button ad,sub,div,mod,mul,ex;
	
	public AWT_Calculator_15() {
		// TODO Auto-generated constructor stub
		
		l1 = new Label("Enter 1st Number"); 
		l1.setBounds(80, 100, 100, 30);
		t1 = new TextField();
		t1.setBounds(200, 103, 150, 25);
		
		l2 = new Label("Enter 2st Number"); 
		l2.setBounds(80, 140, 100, 30);
		t2 = new TextField();
		t2.setBounds(200, 143, 150, 25);
		
		l4 = new Label("Result :"); 
		l4.setBounds(170, 183, 100, 30);
		
		ad = new Button("+");
		ad.setBounds(80, 223, 50, 25);
		
		sub = new Button("-");
		sub.setBounds(140, 223, 50, 25);
		
		mul = new Button("*");
		mul.setBounds(200, 223, 50, 25);
		
		div = new Button("/");
		div.setBounds(260, 223, 50, 25);
		
		mod = new Button("%");
		mod.setBounds(320, 223, 50, 25);
		
		ex = new Button("EXIT");
		ex.setBounds(180, 273, 80, 25);
		

		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l4);
		add(ad);
		add(sub);
		add(mod);
		add(mul);
		add(div);
		add(ex);
		
		setSize(420, 400);
		setTitle("AWT: Largest Number");
		setLayout(null);
		setVisible(true);
		
		ad.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(t1.getText());
		        int b = Integer.parseInt(t2.getText());
		        int c = a+b;
		        
		        l4.setText(String.valueOf(a) + " + " + String.valueOf(b) + " = " + String.valueOf(c));
			}
		});
		
		sub.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(t1.getText());
		        int b = Integer.parseInt(t2.getText());
		        int c = a-b;
		        
		        l4.setText(String.valueOf(a) + " - " + String.valueOf(b) + " = " + String.valueOf(c));
			}
		});

		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(t1.getText());
		        int b = Integer.parseInt(t2.getText());
		        float c = a/b;
		        
		        l4.setText(String.valueOf(a) + " / " + String.valueOf(b) + " = " + String.valueOf(c));
			}
		});
		
		mod.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(t1.getText());
		        int b = Integer.parseInt(t2.getText());
		        float c = a%b;
		        
		        l4.setText(String.valueOf(a) + " % " + String.valueOf(b) + " = " + String.valueOf(c));
			}
		});
		
		mul.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int a = Integer.parseInt(t1.getText());
		        int b = Integer.parseInt(t2.getText());
		        int c = a*b;
		        
		        l4.setText(String.valueOf(a) + " * " + String.valueOf(b) + " = " + String.valueOf(c));
			}
		});
		
		ex.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AWT_Calculator_15();
	}

}
