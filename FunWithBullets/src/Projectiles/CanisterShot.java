package Projectiles;
/**
 * Clasa glontului CanisterShot.
 * Extinde clasa lui HeatedShot pentru ca in acesta se transforma daca distanta este sufucient de mare.
 * Daca distanta nu este suficient de mare deseneaza pe ecran forma specifica.
 */
import ProcessingManagers.TimeManager;
import Screen.Screen;
import Shapes.Point;
import Shapes.rectangle;

public class CanisterShot extends HeatedShot{

	
	public CanisterShot(Screen screen, int ref, TimeManager currentTime){
		super(screen,ref,currentTime);
	}
	
	@Override
	public void shoot(int dist, Point shooterPosition) {
		// TODO Auto-generated method stub
		shapeChangingDist = 42 + (3 * 3 * currentTime.getHour() + 3 * currentTime.getMinute() + currentTime.getSecond()) % 42;
		if(dist >= shapeChangingDist){		
			int dx = -shapeChangingDist;
			int dy = 0;
			shooterPosition = shooterPosition.translate(dx, dy);
			ref = ref - shapeChangingDist/10 - 3;
			super.shoot(dist - shapeChangingDist, shooterPosition);
			return;
		}
		int dx = -dist;
		int dy = 0;
		shooterPosition = shooterPosition.translate(dx, dy);
		ref = ref - dist/10 - 3;
		shape = new rectangle();
		shape.draw(screen, ref, shooterPosition);
	}
	
	

}
