package Projectiles;
/**
 * Clasa glontului TriGrapeShot.
 * Extinde clasa lui Shrapnel pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.triangle;

public class TriGrapeShot extends Shrapnel{

	
	public TriGrapeShot(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
		
	}
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (1 * 1 * currentTime.getHour() + 1 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){
			int dx = shapeChangingDist;
			int dy = 0;
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 1;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = dist;
		int dy = 0;
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 1;
		shape = new triangle();
		shape.draw(screen, ref, shooterPosition);
	}


}
