package laboratorio;

public class StrategyA implements Strategy {

	private LaboRobot robot;
	
	public StrategyA(LaboRobot robot) {
		super();
		this.robot = robot;
	}

	public void onScannedRobot() {
		this.robot.fire(2);
	}
	
	public void onHitByBullet() {

	}
	
	public void onHitWall() {
		
	}
	
	
	
}
