import java.awt.*;

public class AWT_Example_2 {

	public AWT_Example_2() {
		// TODO Auto-generated constructor stub
		Frame f = new Frame();
		
		Label l = new Label("Employee ID: ");
		TextField t = new TextField();
		Button b = new Button("Submit");
		
		l.setBounds(60,100,90,50);
		t.setBounds(150,115,100,20);
		b.setBounds(105,150,80,30);
		
		f.add(l);
		f.add(b);
		f.add(t);
		
		f.setSize(400,400);
		f.setTitle("AWT Second Program");
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AWT_Example_2 obj = new AWT_Example_2();
		
	}

}
