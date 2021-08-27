public class Sanie{
	private int x;
	private int y;
	private Degrees orientacja;

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
		if(orientacja.equals(Degrees.D0))			x -= steps;
		if(orientacja.equals(Degrees.D90))		y += steps;
		if(orientacja.equals(Degrees.D180))		x += steps;
		if(orientacja.equals(Degrees.D270))		y -= steps;
		
		
		orientacja = orientacja.previous();
		
	}

	private void goRight(int steps){
		if(orientacja.equals(Degrees.D0))			x += steps;
		if(orientacja.equals(Degrees.D90))		y -= steps;
		if(orientacja.equals(Degrees.D180))		x -= steps;
		if(orientacja.equals(Degrees.D270))		y += steps;

		orientacja = orientacja.next();
	}
}