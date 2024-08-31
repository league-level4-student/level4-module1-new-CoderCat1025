package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMorph extends Polymorph implements MouseMotionListener{

	public MouseMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {

	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	@Override
	public void mouseDragged(MouseEvent e) {

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse moved");
		if (e.getXOnScreen() > getX()) {
			setX(getX()+10);
		} else {
			setX(getX()-10);
		}
		if (e.getYOnScreen() > getY()) {
			setY(getY()+10);
		} else {
			setY(getY()-10);
		}
	}

}
