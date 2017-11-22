import stanford.karel.*;

public class Introduction extends Karel {

	// You fill in this part
	
	public void run() {
		move();
		pickBeeper();
		move();
		turnLeft();
		move();
		turnRight();
		move();
		move();
		putBeeper();
		
		
	}
	
	private void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

}