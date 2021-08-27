import java.io.*;
import java.util.*;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Sanie s = new Sanie();
		Sanie d = new Sanie();
		String[] steps = Lista.getLista();

	for(String step : steps){
		Direction dir = Direction.parseDir(step.substring(0,1));
		int numOfSteps = Integer.parseInt(step.substring(1));

		s.move(dir, numOfSteps);
	}
	int x = abs(s.getX());
	int y = abs(s.getY());
	int result = x+y;	
	System.out.println(s.deja_vu);
	System.out.println(result);
			
  }
}