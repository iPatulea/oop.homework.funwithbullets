package Screen;
/**
 * Clasa pentru ecran.
 * Construiesc matricea in constructor.
 * Am adaugat 2 variabile private sizeX si sizeY pentru a afisa matricea.
 * Am adaugat 2 metode care scriu matricea intr-un fisier sau in consola.
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Constants.Symbols;
import IOManager.DrawManager;
import Shapes.Point;

/**
 * Class that represents the screen to be projected on
 */
public class Screen {
	private char[][] matrix;
	private int sizeX,sizeY;
	/**
	 * Builds the necessary data of the screen
	 * 
	 * @param sizeX	screen size on X axis
	 * @param sizeY	screen size on Y axis
	 */
	public Screen(int sizeX, int sizeY) {
		// TODO
		this.sizeX=sizeX;
		this.sizeY=sizeY;
		matrix = new char[sizeX][sizeY];
		for(int i=0;i<sizeX;i++)
			for(int j=0;j<sizeY;j++)
				matrix[i][j] = Symbols.SCREEN_SYMBOL;
	}
	
	/**
	 * Draws a line on the screen between the given points
	 * 
	 * @param startPoint	the first end of the line
	 * @param endPoint		the second end of the line
	 * @param symbol		the symbol the line is drawn with
	 */
	public void drawLineOnScreen(Point startPoint, Point endPoint, 
			char symbol) {
		// TODO
		// Hint: Use DrawManager
		DrawManager.drawLine(matrix, startPoint, endPoint, symbol);
	}
	
	/**
	 * Draws multiple lines, each defined by startPoints[index] and
	 * endPoints[index] 
	 * 
	 * @param startPoints	array of first ends of the lines
	 * @param endPoints		array of second ends of the lines
	 * @param symbol		the symbol with which ALL lines are drawn
	 */
	public void drawMultipleLinesOnScreen(Point[] startPoints,
			Point[] endPoints, char symbol) {
		// TODO
		for(int i=0;i<startPoints.length;i++){
			DrawManager.drawLine(matrix, startPoints[i], endPoints[i], symbol);
		}
	}
	public void showscons(){
		for(int i=0;i<sizeX;i++){
			for(int j=0;j<sizeY;j++){
			      System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public void show(String args) throws IOException{
		
		File file = new File(args+"_out");
	    file.createNewFile();
	    FileWriter writer = new FileWriter(file); 
		for(int i=0;i<sizeX;i++){
			for(int j=0;j<sizeY;j++){
			      writer.write(matrix[i][j]);
			}
			writer.write('\n');
		}
		writer.write('\n');
		writer.flush();
	    writer.close();
	}
}
