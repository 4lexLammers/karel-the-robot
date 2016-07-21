/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * Karel walks to the door of its house, picks up the
 * newspaper and then returns to its initial position 
 * in the upper left corner of the house.
 *
 * Code by Alexander Lammers
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends Karel {
	
	public void run() {
		moveToNewspaper();
		pickBeeper();
		returnToStartingPoint();
	}

	private void turnRight() {
         for (int i = 0; i < 3; i++) {
         	turnLeft();
		}
	}

	private void moveToNewspaper() {
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
	}
	
	private void returnToStartingPoint() {
		turnAround();
         for (int i = 0; i < 3; i++) {
         	move();
		}
		turnRight();
		move();
		turnRight();
	}
	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
}
