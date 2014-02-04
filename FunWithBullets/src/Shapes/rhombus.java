package Shapes;
/**
 * Reprezenta clasa ce deseneaza pe ecran un romb.
 * Am creat puntele utilizand clasa Point utilizand regulile de alcaturile ale unui romb.
 * Desi puteam folosi doar metoda drawLineOnScreen am alcatuit 2 vectori utilizand metoda drawMultipleLinesOnScreen.
 */
import Constants.Symbols;
import Screen.Screen;

public class rhombus extends BasicShape{

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		Point VS = new Point(centerGrav.getX(), centerGrav.getY()-2*ref);
		Point VST = new Point(centerGrav.getX()-ref, centerGrav.getY());
		Point VD = new Point(centerGrav.getX()+ref, centerGrav.getY());
		Point VJ = new Point(centerGrav.getX(), centerGrav.getY()+2*ref);
		
		Point[] startPoints = new Point[4];
		startPoints[0] = VS;
		startPoints[1] = VST;
		startPoints[2] = VJ;
		startPoints[3] = VD;
		
		Point[] endPoints = new Point[4];
		endPoints[0] = VST;
		endPoints[1] = VJ;
		endPoints[2] = VD;
		endPoints[3] = VS;
		
		screen.drawMultipleLinesOnScreen(startPoints, endPoints, Symbols.RHOMBUS_SYMBOL);
	}

}
