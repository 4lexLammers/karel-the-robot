/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * CheckerboardKarel class draws a checkerboard using beepers.
 * This works for all sizes of the world.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// not working
	public void run() {
		if (frontIsBlocked()){
			turnLeft();
			fillRow();
		}
			while (frontIsClear()) {
				fillRow();
					if (frontIsBlocked()){
						goToNextRow();
					}			
			}
	}

		
	private void fillRow() {
		putBeeper();
		move();
			if (frontIsClear()){
				move();
					// If the number of avenues is odd
					if(frontIsBlocked()) {
						putBeeper();
					}
			}

	}
	// Pre-Condition: Karel needs to face east or west
	// Post-Condition: 
	private void goToNextRow() {
		if (facingEast() & beepersPresent()){
			turnLeft();
				if (frontIsClear()){
					move();
					turnLeft();
					move();
				}
		} 
		else if (facingEast() & noBeepersPresent()){
			turnLeft();
				if (frontIsClear()){
					move();
					turnLeft();
			}
		} 
		else if (facingWest() & beepersPresent()){
			turnRight();
				if (frontIsClear()){
					move();
					turnRight();
					move();
				}
		} else {
			turnRight();
			if (frontIsClear()){
				move();
				turnRight();
			}
		}
	}
}
