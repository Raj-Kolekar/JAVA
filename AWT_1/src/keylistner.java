
import java.awt.*;
import java.awt.event.*;

public class keylistner extends WindowAdapter implements KeyListener{
	
	Frame f;
	TextArea t;
	Label l;
	
	public keylistner() {
		f = new Frame("Keylistner");
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		
		init();
		add_Component();
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public void init() {
		l = new Label("Press key");
		l.setBounds(20,20,100,80);
		t = new TextArea();
		t.setBounds(20,100,250,250);
		
		t.addKeyListener(this);
		f.addWindowListener(this);
	}
	
	public void add_Component() {
		f.add(l);
		f.add(t);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key is Typed");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key is Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		l.setText("Key is Released");
	}
	
	public static void main(String args[]) {
		new keylistner();
	}
	
}











































