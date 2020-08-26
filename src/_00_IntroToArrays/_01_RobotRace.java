package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];

		for (int i = 0; i < robots.length; i++) {

			robots[i] = new Robot();
			//robots[i].setX(100 + 150 * i);
			robots[i].setX(400);
			robots[i].setY(500);
			robots[i].setAngle(270);
			robots[i].setSpeed(50);
			
		}
		while (robots[0].getY() > 0 && robots[1].getY() > 0 && robots[2].getY() > 0 && robots[3].getY() > 0
				&& robots[4].getY() > 0) {
			for (int i = 0; i < robots.length; i++) {

				Random rand = new Random();
				int moved = rand.nextInt(50);
				int turnrate = moved / 2;
				robots[i].turn(turnrate);
				robots[i].move(moved);
				
			}
		}
			int winner = 0;
			int max = 100;
			for (int i = 0; i < robots.length; i++) {
				if (robots[i].getY() < max) {
					winner = i;
				}
			}
			JOptionPane.showMessageDialog(null, "Robot " + winner + " won");
		
	}
}
// 2. create an array of 5 robots.

// 3. use a for loop to initialize the robots.

// 4. make each robot start at the bottom of the screen, side by side, facing up

// 5. use another for loop to iterate through the array and make each robot move
// a random amount less than 50.

// 6. use a while loop to repeat step 5 until a robot has reached the top of the
// screen.

// 7. declare that robot the winner and throw it a party!

// 8. try different races with different amounts of robots.

// 9. make the robots race around a circular track.
