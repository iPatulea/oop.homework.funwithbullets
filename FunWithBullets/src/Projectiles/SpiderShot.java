package Projectiles;
/**
 * Clasa glontului SpiderShot.
 * Extinde clasa lui SimpleShell pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.rectangle;

public class SpiderShot extends SimpleShell{

	
	public SpiderShot(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (7 * 7 * currentTime.getHour() + 7 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){
			int dx = (int)Math.round(Math.sin( shapeChangingDist * Math.PI / 2));
			int dy = (int)Math.round(Math.cos( shapeChangingDist * Math.PI / 2));
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 7;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = (int)Math.round(Math.sin( dist * Math.PI / 2));
		int dy = (int)Math.round(Math.cos( dist * Math.PI / 2));
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 7;
		shape = new rectangle();
		shape.draw(screen, ref, shooterPosition);
	}

	
}
