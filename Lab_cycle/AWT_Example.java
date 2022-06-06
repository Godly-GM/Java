
import java.awt.*;

public class AWT_Example extends Frame {

	public AWT_Example() {
		// TODO Auto-generated constructor stub
		
		Button b = new Button("Click me...!");
		
		b.setBounds(100, 150, 200, 80);
		
		add(b);
		
		setSize(400,400);
		
		setTitle("AWT First Program");
		
		setLayout(null);
		
		setVisible(true);

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AWT_Example obj = new AWT_Example();
	}

}
