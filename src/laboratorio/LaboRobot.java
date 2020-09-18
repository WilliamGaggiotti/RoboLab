package laboratorio;
import robocode.*;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/JuniorRobot.html


public class LaboRobot extends JuniorRobot
{

	private Strategy estrategia = new StrategyA(this);
	private boolean left = true;
	private int moveAmount;
	@Override	
	public void run() {

		setColors(orange, blue, white, yellow, black);
		
		moveAmount = Math.max(fieldWidth, fieldHeight);
		turnLeft(heading % 90);
		ahead(moveAmount);
		turnGunRight(90);
		turnRight(90);
		while(true) {
			ahead(moveAmount);
			turnRight(90);
		}
		
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	@Override
	public void onScannedRobot() {
		this.estrategia.onScannedRobot();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	@Override
	public void onHitByBullet() {
		this.estrategia.onHitByBullet();
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	@Override
	public void onHitWall() {
		this.estrategia.onHitWall();
	}	
}