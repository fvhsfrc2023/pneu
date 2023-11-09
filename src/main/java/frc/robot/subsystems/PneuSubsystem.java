// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid;


public class PneuSubsystem extends SubsystemBase {

    private final DoubleSolenoid exampleDouble;

  /** Creates a new ExampleSubsystem. */
  public PneuSubsystem() {

    exampleDouble = new DoubleSolenoid(PneumaticsModuleType.REVPH, 15, 3);
    exampleDouble.set(DoubleSolenoid.Value.kForward)
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void move (double input) {
    if (input > 0.3) {
        exampleDouble.toggle();
    }
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
