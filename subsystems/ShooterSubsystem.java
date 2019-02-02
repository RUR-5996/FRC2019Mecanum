/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FollowerType;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class ShooterSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  public void shooterInit() {
    RobotMap.shooter2.follow(RobotMap.shooter1, FollowerType.PercentOutput);
    RobotMap.shooter4.follow(RobotMap.shooter3, FollowerType.PercentOutput);
  }

  public void shoot(double speed) {
    RobotMap.shooter1.set(speed);
    RobotMap.shooter3.set(speed);
  }

  public void intake(double speed) {
    RobotMap.shooter1.set(speed);
    RobotMap.shooter3.set(speed);
  }

  public void stop(){
    RobotMap.shooter1.set(0);
    RobotMap.shooter3.set(0);
  }

  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    //setDefaultCommand(new ShootCommand());
  }
}
