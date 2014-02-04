package ProcessingManagers;

/**
 * Time object
 */
public class TimeManager {
	private int h,m,s;

	// TODO => implement the body of the class (set class fields, make ways 
	// 			for other classes to work with a TimeManager object)
	
	public TimeManager(int h,int m,int s){
		this.h=h;
		this.m=m;
		this.s=s;
	}
	
	public int getHour(){
		return h;
	}
	
	public int getMinute(){
		return m;
	}
	
	public int getSecond(){
		return s;
	}
	
	
}