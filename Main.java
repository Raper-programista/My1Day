import java.io.*;
import java.util.*;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Sanie s = new Sanie();
		Sanie d = new Sanie();
		String[] steps = Lista.getLista();
		
		

		//for(String r : instrukcje )
		//	System.out.println(r);

	/*for(int i =0; i<10; i++){
		
		s.setOrientacja(s.getOrientacja().next());
		d.setOrientacja(d.getOrientacja().previous());

		System.out.println(
			(i+1)+".s "+s+'\n'+
			(i+1)+".d "+d+'\n'
		);						
	}*/

	for(String step : steps){
		Direction dir = Direction.parseDir(step.substring(0,1));
		int numOfSteps = Integer.parseInt(step.substring(1));

		s.move(dir, numOfSteps);
	}
	int x = abs(s.getX());
	int y = abs(s.getY());
	int result = x+y;	
	System.out.println(s);
	System.out.println(result);
			
  }
}