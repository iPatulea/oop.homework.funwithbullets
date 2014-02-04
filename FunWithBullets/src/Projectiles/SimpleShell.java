package Projectiles;
/**
 * Clasa glontului SimpleShell.
 * Singurul glont care extinde direct clasa Projectile si deseneza un punct pe ecran indiferent 
 * de distanta pe care o parcurge.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.dot;

public class SimpleShell extends Projectile{

	
	public SimpleShell(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
		shapeChangingDist = -1;
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		hitScreenAction(shooterPosition, ref);
	}

	@Override
	protected void hitScreenAction(Point shooterPosition, int ref) {
		// TODO Auto-generated method stub
		shape = new dot();
		shape.draw(screen, ref, shooterPosition);
	}
	
}
