package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants.IntakeConstants;

public class IntakeSubsystem extends SubsystemBase {
  private final TalonSRX topIntake = new TalonSRX(IntakeConstants.kTopIntakePort); // Top Intake
  private final TalonSRX bottomIntake = new TalonSRX(IntakeConstants.kBottomIntakePort); // Bottom Intake

  /**
   * Creates a new DriveSubsystem.
   */
  public IntakeSubsystem() {
    
  }

  public void intake() {

  }

  public void stopIntake() {
    
  }
}