package Shapes;
/**
 * Reprezinta clasa ce deseneaza un punct indiferent de "ref"
 */
import Constants.Symbols;
import Screen.Screen;

public class dot extends BasicShape{

	@Override
	public void draw(Screen screen, int ref, Point centerGrav) {
		// TODO Auto-generated method stub
		screen.drawLineOnScreen(centerGrav, centerGrav, Symbols.DOT_SYMBOL);
	}

}
