package Projectiles;
/**
 * Clasa glontului ChainShot.
 * Extinde clasa lui Shrapnel pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.triangle;

public class ChainShot extends Shrapnel{

	
	public ChainShot(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (4 * 4 * currentTime.getHour() + 4 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){
			int dx = 0;
			int dy = -shapeChangingDist;
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 4;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = 0;
		int dy = -dist;
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 4;
		shape = new triangle();
		shape.draw(screen, ref, shooterPosition);
	}


}
