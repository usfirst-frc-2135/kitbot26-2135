package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.CANFuelSubsystem;

public class SideAuto extends Command
{
    /** Creates a new Drive. */
    CANFuelSubsystem      fuelSubsystem;
    CommandXboxController controller;

    public SideAuto(CANFuelSubsystem fuelsystem, CommandXboxController operatorController)
    {
        // Use addRequirements() here to declare subsystem dependencies.
        addRequirements(fuelsystem);
        fuelSubsystem = fuelsystem;
        controller = operatorController;
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize( )
    {}

    // Called every time the scheduler runs while the command is scheduled.
    // The Y axis of the controller is inverted so that pushing the
    // stick away from you (a negative value) drives the robot forwards (a positive
    // value). The X axis is scaled down so the rotation is more easily
    // controllable.
    @Override
    public void execute( )
    {
        new LaunchSequence(fuelSubsystem).withTimeout(10);//changed from launch to launch sequence so that there could be spinup time
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted)
    {

    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished( )
    {
        return false;
    }

}
