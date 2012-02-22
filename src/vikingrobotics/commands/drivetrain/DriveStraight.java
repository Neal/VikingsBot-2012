package vikingrobotics.commands.drivetrain;

import vikingrobotics.misc.Debug;
import vikingrobotics.commands.CommandBase;

public class DriveStraight extends CommandBase {
	
	private boolean hasTimeout = false;
	private double timeout;
	private double speed;
	
	public DriveStraight(double speed) {
		requires(drivetrain);
		this.speed = speed;
	}

	public DriveStraight(double speed, double timeout) {
		this(speed);
		this.hasTimeout = true;
		this.timeout = timeout;
	}

	protected void initialize() {
		Debug.print("[" + this.getName() + "] Speed: " + this.speed);
		if(hasTimeout) {
			Debug.print("\tTimeout: " + timeout);
			setTimeout(timeout);
		}
	}

	protected void execute() {
		drivetrain.straight(speed);
	}

	protected boolean isFinished() {
		return isTimedOut();
	}

	protected void end() {
		Debug.println("\t\tDONE");
	}

	protected void interrupted() {
		Debug.println("[interrupted] " + getName());
	}

}
