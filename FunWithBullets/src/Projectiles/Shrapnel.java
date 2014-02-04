package Projectiles;
/**
 * Clasa glontului Shrapnel.
 * Extinde clasa lui SpiderShot pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.square;

public class Shrapnel extends SpiderShot{

	
	public Shrapnel(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (5 * 5 * currentTime.getHour() + 5 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){
			int dx = (int)Math.round(Math.sin( shapeChangingDist * Math.PI / 2));
			int dy = 0;
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 5;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = (int)Math.round(Math.sin( dist * Math.PI / 2));
		int dy = 0;
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 5;
		shape = new square();
		shape.draw(screen, ref, shooterPosition);
	}

	
}
