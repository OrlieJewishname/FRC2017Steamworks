package org.usfirst.frc.team4183.robot.subsystems;


import org.usfirst.frc.team4183.robot.commands.GearHandlerSubsystem.Idle;

import edu.wpi.first.wpilibj.command.Subsystem;

public class GearHandlerSubsystem extends Subsystem {

	public void enable() {}
	
	public void disable() {}
	
	public void initDefaultCommand() {
	    setDefaultCommand(new Idle());
	}
	
}