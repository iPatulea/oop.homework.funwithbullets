package Shapes;
/**
 * Reprezenta clasa ce deseneaza pe ecran un triunghi.
 * Am creat puntele utilizand clasa Point utilizand regulile de alcaturile ale unui triunghi.
 * Desi puteam folosi doar metoda drawLineOnScreen am alcatuit 2 vectori utilizand metoda drawMultipleLinesOnScreen.
 */
import Constants.Symbols;
import Screen.Screen;

public class triangle extends BasicShape{

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point VS = new Point(centerGrav.getX(), centerGrav.getY()-2*ref);
		Point VJS = new Point(centerGrav.getX()-ref, centerGrav.getY()+ref);
		Point VJD = new Point(centerGrav.getX()+ref, centerGrav.getY()+ref);
		
		Point[] startPoints = new Point[3];
		startPoints[0] = VS;
		startPoints[1] = VJS;
		startPoints[2] = VJD;
		
		Point[] endPoints = new Point[3];
		endPoints[0] = VJS;
		endPoints[1] = VJD;
		endPoints[2] = VS;
		
		screen.drawMultipleLinesOnScreen(startPoints, endPoints, Symbols.TRIANGLE_SYMBOL);
	}

}
