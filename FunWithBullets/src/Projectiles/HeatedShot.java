package Projectiles;
/**
 * Clasa glontului HeatedShot.
 * Extinde clasa lui SpiderShot pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.rhombus;

public class HeatedShot extends SpiderShot{

	
	public HeatedShot(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (6 * 6 * currentTime.getHour() + 6 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){
			int dx = 0;
			int dy = (int)Math.round(Math.cos( shapeChangingDist * Math.PI / 2));
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 6;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = 0;
		int dy = (int)Math.round(Math.cos( dist * Math.PI / 2));
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 6;
		shape = new rhombus();
		shape.draw(screen, ref, shooterPosition);
	}

	
}
