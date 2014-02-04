package Shapes;
/**
 * Reprezenta clasa ce deseneaza pe ecran un dreptunghi.
 * Am creat puntele utilizand clasa Point utilizand regulile de alcaturile ale unui dreptunghi.
 * Desi puteam folosi doar metoda drawLineOnScreen am alcatuit 2 vectori utilizand metoda drawMultipleLinesOnScreen.
 */
import Constants.Symbols;
import Screen.Screen;

public class rectangle extends BasicShape{

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		
		
		Point VSS = new Point(centerGrav.getX()-2*ref, centerGrav.getY()-ref);
		Point VSJ = new Point(centerGrav.getX()-2*ref, centerGrav.getY()+ref);
		Point VDS = new Point(centerGrav.getX()+2*ref, centerGrav.getY()-ref);
		Point VDJ = new Point(centerGrav.getX()+2*ref, centerGrav.getY()+ref);
		
		Point[] startPoints = new Point[4];
		startPoints[0] = VSS;
		startPoints[1] = VSJ;
		startPoints[2] = VDJ;
		startPoints[3] = VDS;
		
		Point[] endPoints = new Point[4];
		endPoints[0] = VSJ;
		endPoints[1] = VDJ;
		endPoints[2] = VDS;
		endPoints[3] = VSS;
		
		screen.drawMultipleLinesOnScreen(startPoints, endPoints, Symbols.RECTANGLE_SYMBOL);
		
	}

}
