import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class mouselistner extends WindowAdapter implements MouseListener{
	
	Label l;
	Frame f;
	public mouselistner() {
		f = new Frame("MouseListner");
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
		
		init();
		add_Component();
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public void init() {
		l = new Label();
		l.setBounds(20,50,100,30);
		
		f.addMouseListener(this);
		f.addWindowListener(this);
	}
	
	public void add_Component() {
		f.add(l);
	}
	
	public static void main(String args[]) {
		new mouselistner();
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Clicked");
		f.setBackground(Color.BLACK);
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Pressed");
		f.setBackground(Color.GREEN);
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Released");
		f.setBackground(Color.PINK);
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Entered");
		f.setBackground(Color.YELLOW);
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Exited");
		f.setBackground(Color.CYAN);
	}
}


















































