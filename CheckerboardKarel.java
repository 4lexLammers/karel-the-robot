/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * CheckerboardKarel class draws a checkerboard using beepers.
 * This works for all sizes of the world.
 *
 * Code by Alexander Lammers
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run() {
		if (frontIsBlocked()) {
			turnLeft();
			fillRow();
		}
			while (frontIsClear()) {
				fillRow();
				if (frontIsBlocked()) {
					goToNextRow();
				}			
			}
	}

	/*
	* This method fills the current row with beepers
	* Pre-condition: Karel is facing east or west
	* Post-condition: Karel stands in front of a wall
	*/
		
	private void fillRow() {
		putBeeper();
		move();
		if (frontIsClear()) {
			move();

				/*
				* If the number of avenues is odd
				*/ 

			if(frontIsBlocked()) {
				putBeeper();
			}
		}

	}

	/*
	* This method tells Karel to go to the next row
	* Pre-condition: Karel stands in front of a wall 
	* 	and is facing east or west
	* Post-condition: Karel is facing east or west on the next row
	*/

	private void goToNextRow() {
		if (facingEast() & beepersPresent()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnLeft();
				move();
			}
		} 
		else if (facingEast() & noBeepersPresent()) {
			turnLeft();
			if (frontIsClear()) {
				move();
				turnLeft();
			}
		} 
		else if (facingWest() & beepersPresent()) {
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
				move();				
			}

		} else {
			turnRight();
			if (frontIsClear()) {
				move();
				turnRight();
			}
		}
	}
}
