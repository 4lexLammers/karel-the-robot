/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends Karel {

	/*
	* To repair a set of arches, Karel needs to repair the first arche
	* and walk 4 corners to the next arche since there is no more
	* arche to repair!
	*/
	
	public void run() {
		
		while (frontIsClear()) {
			turnLeft();
			fillStones();
			moveToNextArche();
		}
		turnLeft();
		fillStones();
	}

	
	private void turnAround() {
		turnLeft();
		turnLeft();
	}
	
	
	/*
	 * Pre-condition: Karel is facing east
	 * Post-condition: Karel is facing east
	 */
	private void fillStones() {
		if (noBeepersPresent()) {
			putBeeper();
		}
			while (frontIsClear()) {
				move();
				if (noBeepersPresent()) {
					putBeeper();
				}
			}
			turnAround();
			
			while (frontIsClear()) {
				move();
			}
			turnLeft();
	}
	
	private void moveToNextArche() {
		move4times();
	}
	
	private void move4times() {
		move();
		move();
		move();
		move();
	}
}
