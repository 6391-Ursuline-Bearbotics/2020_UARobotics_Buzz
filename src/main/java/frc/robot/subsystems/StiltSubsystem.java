package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Talon;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import frc.robot.Constants.StiltConstants;

public class StiltSubsystem extends SubsystemBase {
  private final TalonSRX Talon5 = new TalonSRX(StiltConstants.kBackLeftStiltPort); // Back Left
  private final TalonSRX Talon6 = new TalonSRX(StiltConstants.kFrontLeftStiltPort); // Front Left
  private final TalonSRX Talon10 = new TalonSRX(StiltConstants.kFrontRightStiltPort); // Front Right
  private final TalonSRX Talon11 = new TalonSRX(StiltConstants.kBackRightStiltPort); // Back Right

  /**
   * Creates a new DriveSubsystem.
   */
  public StiltSubsystem() {
    Talon5.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    Talon6.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    Talon10.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    Talon11.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative);
    Talon5.setSensorPhase (false);
    Talon6.setSensorPhase (false);
    Talon10.setSensorPhase (false);
    Talon11.setSensorPhase (false);
    Talon5.setSelectedSensorPosition(0);
    Talon6.setSelectedSensorPosition(0);
    Talon10.setSelectedSensorPosition(0);
    Talon11.setSelectedSensorPosition(0);
  }

  public void climblower() {
    
  }
}