

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.StringTokenizer;

import Constants.ProjectileNames;
import ProcessingManagers.TimeManager;
import Projectiles.CanisterShot;
import Projectiles.Carcass;
import Projectiles.ChainShot;
import Projectiles.HeatedShot;
import Projectiles.Shrapnel;
import Projectiles.SimpleShell;
import Projectiles.SpiderShot;
import Projectiles.TriGrapeShot;
import Screen.Screen;

/**
 * Tema 2 POO Fun with bullets
 * @author iPatulea
 *Folosesc indicatiile de citire din cerinta temei, construiesc un string pe care apoi il despart.
 *Apelez clasa pentru glontul cu care se trage.
 */


public class Main {

	public static void main(String[] args) throws Exception {
		// TODO
		InputStream inStream = null;
	    BufferedInputStream bis = null;
	    inStream = new FileInputStream(args[0]);
	    bis = new BufferedInputStream(inStream);
	    String linie="";
	   
	    char c = (char)bis.read();
	    while(c != '\n')
        {
	    	linie+=c;   	
	    	c = (char)bis.read();
        }
	    StringTokenizer impart = new StringTokenizer(linie);
	    
	    
	    int sizeX = Integer.parseInt(impart.nextToken());
	    int sizeY = Integer.parseInt(impart.nextToken());
	    Screen screen =new Screen(sizeX,sizeY);
	    linie="";
	    c = (char)bis.read();
	    while(c != '\n'){
	    	linie+=c;
	    	c = (char)bis.read();
	    }
	    impart = new StringTokenizer(linie);
	    int nrProj = Integer.parseInt(impart.nextToken());
	    
	    
	    for(int i=1;i<=nrProj;i++){
	    
	    	linie="";
		    c = (char)bis.read();
		    while(c != '\n' && bis.available()>0){ 	linie+=c;	c = (char)bis.read();}
		   //String slinie = linie.substring(0,linie.length()-1);
		    impart = new StringTokenizer(linie);
		    String Proj = impart.nextToken();
		    int ref = Integer.parseInt(impart.nextToken());
		    String delim = " :";
		    int h = Integer.parseInt(impart.nextToken(delim));
		    int m = Integer.parseInt(impart.nextToken());
		    int s = Integer.parseInt(impart.nextToken());
		    TimeManager currentTime = new TimeManager(h, m, s);
		    int dist = Integer.parseInt(impart.nextToken());
		    int posx = Integer.parseInt(impart.nextToken());
		    int posy = Integer.parseInt(impart.nextToken());
		    Shapes.Point shooterPosition = new Shapes.Point(posx, posy);
		    if(Proj.compareTo(ProjectileNames.TRI_GRAPE_SHOT)==0){
		    	TriGrapeShot glont = new TriGrapeShot(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.CARCASS)==0){
		    	Carcass glont = new Carcass(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition); 	
		    }
		    if(Proj.compareTo(ProjectileNames.CANNISTER_SHOT)==0){
		    	CanisterShot glont = new CanisterShot(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.CHAIN_SHOT)==0){
		    	ChainShot glont = new ChainShot(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.SHRAPNEL)==0){
		    	Shrapnel glont = new Shrapnel(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.HEATED_SHOT)==0){
		    	HeatedShot glont = new HeatedShot(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.SPIDER_SHOT)==0){
		    	SpiderShot glont = new SpiderShot(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
		    if(Proj.compareTo(ProjectileNames.SIMPLE_SHELL)==0){
		    	SimpleShell glont = new SimpleShell(screen, ref, currentTime);
		    	glont.shoot(dist, shooterPosition);
		    }
	    }
	    //screen.showscons();
	    screen.show(args[0]);
	    if(inStream!=null)
            inStream.close();
         if(bis!=null)
            bis.close();
	}
}
