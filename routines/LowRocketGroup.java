/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.routines;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.DoNothingCommand;
import frc.robot.commands.LowRocketShootCommand;
import frc.robot.commands.RotateDownCommand;
import frc.robot.commands.RotateUpCommand;

public class LowRocketGroup extends CommandGroup {
  /**
   * Add your docs here.
   */
  public LowRocketGroup() {
    addSequential(new RotateUpCommand());
    addSequential(new DoNothingCommand(0.15));
    addSequential(new LowRocketShootCommand());
    addSequential(new DoNothingCommand(0.1));
    addSequential(new RotateDownCommand());
  }
}