/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.autonomous;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.DoNothingCommand;
import frc.robot.commands.MoveLeftCommand;
import frc.robot.commands.OpenHatchCommand;
import frc.robot.routines.HatchRoutine;

public class LeftTwoHatchAuto extends CommandGroup {
  /**
   * Add your docs here.
   */
  public LeftTwoHatchAuto() {
    addSequential(new OpenHatchCommand());
    addSequential(new HatchRoutine());
    addSequential(new DoNothingCommand(0.25));
    addSequential(new MoveLeftCommand(0.75));
    addSequential(new DoNothingCommand(0.25));
    addSequential(new HatchRoutine());
    addSequential(new DoNothingCommand(0.25));
    addSequential(new MoveLeftCommand(0.75));
    addSequential(new DoNothingCommand(0.25));
    addSequential(new HatchRoutine());
  }
}