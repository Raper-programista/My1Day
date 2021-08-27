import static java.lang.Math.*;
import java.util.*;

public class Sanie{
	private int x;
	private int y;
	private Degrees orientacja;
	public Map<String, Integer>map = new HashMap<>();
	public int count=0;

	public Sanie(int x, int y, Degrees orientacja){
		this.x = x;
		this.y = y;
		this.orientacja = orientacja;
	}

	public Sanie(){
		this.x = 0;
		this.y = 0;
		this.orientacja = Degrees.D0;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public Degrees getOrientacja(){
		return orientacja;
	}

	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setOrientacja(Degrees orientacja){
		this.orientacja = orientacja;
	}

	@Override
	public String toString(){
		return "Sanie{ " + "[" +super.toString()+ "], "
		+ "[x: " +x+ ", "
		+ "y: " +y+ "], "
		+ "[Degrees: " +orientacja.toString()+ "] "
		+ '}';
		
	}

	public void move(Direction d, int steps){
		if(d.equals(Direction.L))		goLeft(steps);
		if(d.equals(Direction.R))		goRight(steps);
	}

	private void goLeft(int steps){
		if(orientacja.equals(Degrees.D0))			goStep(-steps, "x");
		if(orientacja.equals(Degrees.D90))		goStep( steps, "y");
		if(orientacja.equals(Degrees.D180))		goStep( steps, "x");
		if(orientacja.equals(Degrees.D270))		goStep(-steps, "y");
		
		
		orientacja = orientacja.previous();
		
	}

	private void goRight(int steps){
		if(orientacja.equals(Degrees.D0))			goStep( steps, "x");
		if(orientacja.equals(Degrees.D90))		goStep(-steps, "y");
		if(orientacja.equals(Degrees.D180))		goStep(-steps, "x");
		if(orientacja.equals(Degrees.D270))		goStep( steps, "y");

		orientacja = orientacja.next();
	}

	public void goStep(int steps, String sign){

		for (int i=0; i<abs(steps); i++){

			if(steps>0 && sign.equals("x")) x++;
			if(steps<0 && sign.equals("x")) x--;
			if(steps>0 && sign.equals("y")) y++;
			if(steps<0 && sign.equals("y")) y--;

			save();
		}

	}
	public void save(){

			String XY = x+" "+y;

			if(map.get(XY)==null)	map.put(XY, 1);
			else	map.put(XY, map.get(XY)+1);
			if(map.get(XY)==2) System.out.println(++count+". "+ XY+"<-");
	}
}