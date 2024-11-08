package mvc;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingFrame extends JFrame {
	DrawingPanel view = new DrawingPanel();
	DrawingController controller; 
	
	public DrawingFrame() {
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// poziv metode iz kontrolera
				controller.mouseClicked(e.getX(), e.getY());
			}
		});
		getContentPane().add(view, BorderLayout.CENTER);
		
		
	}

	public DrawingPanel getView() {
		return view;
	}

	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
	
	

}
