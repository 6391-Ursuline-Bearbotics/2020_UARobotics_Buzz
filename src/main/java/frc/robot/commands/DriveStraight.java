package frc.robot.commands;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.PIDCommand;

import frc.robot.subsystems.DriveSubsystem;

/**
 * Drive the given distance straight (negative values go backwards). Uses a
 * local PID controller to run a simple PID loop that is only enabled while this
 * command is running. The input is the averaged values of the left and right
 * encoders.
 */
public class DriveStraight extends PIDCommand {
  private final DriveSubsystem m_drivetrain;

  /**
   * Create a new DriveStraight command.
   * @param distance The distance to drive
   */
  public DriveStraight(double distance, DriveSubsystem drivetrain) {
    super(new PIDController(4, 0, 0),
        drivetrain::getAverageEncoderDistance,
        distance,
        d -> drivetrain.drive(d, d));

    m_drivetrain = drivetrain;
    addRequirements(m_drivetrain);

    getController().setTolerance(0.01);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
    // Get everything in a safe starting state.
    m_drivetrain.reset();
    super.initialize();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return getController().atSetpoint();
  }
}