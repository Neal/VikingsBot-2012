package vikingrobotics.misc;

/**
 * All the random contants needed to use with all robot parts.
 * @author Neal
 */
public interface Constants {
	
	public static final int kTeamNumber = 1777;
	
	public static final double kMaxBatteryVoltage = 13.0;

	public static final double kRobotWidth = 38;
	public static final double kRobotLength = 28;
	public static final double kRobotBumpers = 3 + 3;
	public static final double kRobotWidthWithBumpers = kRobotWidth + kRobotBumpers;
	public static final double kRobotLengthWithBumpers = kRobotLength + kRobotBumpers;
	public static final double kRobotEdgeToSonar = 4;
	public static final double kWheelRadius = 3.0;
	public static final double kWheelCircumference = 2 * Math.PI * kWheelRadius;
	public static final double kShooterHeight = 40;
	
	public static final double kHoopHeightTop = 98;
	public static final double kHoopHeightMid = 61;
	public static final double kHoopHeightLow = 28;
	public static final double kHoopInnerRadius = 9;
	public static final double kHoopInnerDiameter = kHoopInnerRadius*2;

	public static final double DIST_FENDER_TO_KEY = 110;
	public static final double DIST_ALLIANCEWALL_TO_KEY = 144;
	public static final double DIST_ALLIANCEWALL_TO_BRIDGE = 280.4;
	public static final double kBumperEdgeToWheelCenter = 9.5; 		//?
	public static final double kFenderDepth = 38.5;
	public static final double DIST_TO_FENDER = DIST_FENDER_TO_KEY - (kRobotWidthWithBumpers - kBumperEdgeToWheelCenter);
	public static final double DIST_TO_BRIDGE = DIST_ALLIANCEWALL_TO_BRIDGE - kFenderDepth - kRobotWidthWithBumpers -2;

	public static final double kTimeFeedOneBall = 0.4;
	public static final double kShooterUp = 1.0;
	public static final double kShooterDown = -1.0;
	
	// Gamepad axes
	public static final int kGamepadAxisLeftStickX = 1;
	public static final int kGamepadAxisLeftStickY = 2;
	public static final int kGamepadAxisTrigger = 3;
	public static final int kGamepadAxisRightStickX = 4;
	public static final int kGamepadAxisRightStickY = 5;
	public static final int kGamepadAxisDpadX = 6;

	// Gamepad buttons
	public static final int kGamepadButtonA = 1;	//   /  Y  \
	public static final int kGamepadButtonB = 2;	//  | X + B |
	public static final int kGamepadButtonX = 3;	//   \  A  /
	public static final int kGamepadButtonY = 4;
	public static final int kGamepadButtonLB = 5;
	public static final int kGamepadButtonRB = 6;
	public static final int kGamepadButtonBack = 7;
	public static final int kGamepadButtonStart = 8;
	public static final int kGamepadButtonLeftStick = 9;
	public static final int kGamepadButtonRightStick = 10;
	public static final int kGamepadButtonMode = 11;		// ?
	public static final int kGamepadButtonLogitech = 12;	// ?

	// Joystick axes
	public static final int kJoystickAxisX = 1;
	public static final int kJoystickAxisY = 2;
	public static final int kJoystickAxisZ = 3;
	public static final int kJoystickAxisThrottle = 4;
	public static final int kJoystickAxisTopX = 5;
	public static final int kJoystickAxisTopY = 6;
	public static final int kJoystick2AxisThrottle = 3;

	// Joystick buttons
	public static final int kJoystickButton1 = 1;
	public static final int kJoystickButton2 = 2;
	public static final int kJoystickButton3 = 3;
	public static final int kJoystickButton4 = 4;
	public static final int kJoystickButton5 = 5;
	public static final int kJoystickButton6 = 6;
	public static final int kJoystickButton7 = 7;
	public static final int kJoystickButton8 = 8;
	public static final int kJoystickButton9 = 9;
	public static final int kJoystickButton10 = 10;
	public static final int kJoystickButton11 = 11;
	public static final int kJoystickButton12 = 12;
	public static final int kJoystickButtonTrigger = 1;
	public static final int kJoystickButtonThumb = 2;
	public static final int kJoystickButtonThumbBottomLeft = 3;
	public static final int kJoystickButtonThumbBottomRight = 4;
	public static final int kJoystickButtonThumbTopLeft = 5;
	public static final int kJoystickButtonThumbTopRight = 6;
	public static final int kJoystickButtonTopLeft = 7;
	public static final int kJoystickButtonTopRight = 8;
	public static final int kJoystickButtonMidLeft = 9;
	public static final int kJoystickButtonMidRight = 10;
	public static final int kJoystickButtonBottomLeft = 11;
	public static final int kJoystickButtonBottomRight = 12;
	public static final double kJoystickThreshold = 0.2;
	
	public static final int kDSDigitalInputShooterOnJ2 = 1;
	public static final int kDSDigitalInputShooterAI1 = 2;
	public static final int kDSDigitalInputArcadeDrive = 3;
	public static final int kDSDigitalInput4 = 4;
	public static final int kDSDigitalInput5 = 5;

}