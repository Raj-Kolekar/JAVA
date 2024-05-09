import java.awt.*;
import java.awt.event.*;

public class mouselistner extends WindowAdapter implements MouseListener {
	Label l;
	Frame f;
	
	public mouselistner() {
		f = new Frame("Mouse Listner");
		f.setSize(500,500);
		f.setVisible(true);
		f.setLayout(null);
		init();
		add_Components();
	}
	public void init() {
		l = new Label();
		l.setBounds(20,50,150,30);
		f.addWindowListener(this);
		f.addMouseListener(this);
	}
	
	public void add_Components() {
		f.add(l);
	}
	public void windowClosing(WindowEvent e) {
		f.dispose();
	}
	
	public static void main(String[] args) {
		new mouselistner();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Clicked");
		f.setBackground(Color.PINK);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Pressed");
		f.setBackground(Color.CYAN);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Released");
		f.setBackground(Color.GREEN);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Entered");
		f.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		l.setText("Mouse Exited");
		f.setBackground(Color.BLUE);
	}

}
