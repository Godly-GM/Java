import java.awt.*;
import java.awt.event.*;

public class AWT_large_14 extends Frame {
	
	Label l1,l2,l3,l4;
	TextField t1,t2,t3;
	Button b1,b2;

	public AWT_large_14() {
		// TODO Auto-generated constructor stub
		
		l1 = new Label("Enter 1st Number"); 
		l1.setBounds(80, 100, 100, 30);
		t1 = new TextField();
		t1.setBounds(200, 103, 150, 25);
		
		l2 = new Label("Enter 2st Number"); 
		l2.setBounds(80, 140, 100, 30);
		t2 = new TextField();
		t2.setBounds(200, 143, 150, 25);
		
		l3 = new Label("Enter 3st Number"); 
		l3.setBounds(80, 180, 100, 30);
		t3 = new TextField();
		t3.setBounds(200, 183, 150, 25);
		
		b1 = new Button("FIND");
		b1.setBounds(100, 223, 100, 25);
		
		b2 = new Button("EXIT");
		b2.setBounds(220, 223, 100, 25);
		
		l4 = new Label(" "); 
		l4.setBounds(150, 263, 100, 30);
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(l4);
		add(t3);
		add(b1);
		add(b2);
		
		setSize(400, 400);
		setTitle("AWT: Largest Number");
		setLayout(null);
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				int c = Integer.parseInt(t3.getText());
				
				if(a > b && a > c) {
					l4.setText("Maximum is: "+String.valueOf(a));
				}
				
				else if(b > a && b > c) {
					l4.setText("Maximum is: "+String.valueOf(b));
				}
				else {
					l4.setText("Maximum is: "+String.valueOf(c));
				}	
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new AWT_large_14();
		
	}

}
