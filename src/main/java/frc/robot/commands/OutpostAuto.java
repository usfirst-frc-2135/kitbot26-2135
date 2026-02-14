package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.5),
                new AutoDrive(drivesystem, -0.75, 0).withTimeout(2.2), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.53),
                new AutoDrive(drivesystem, -0.75, 0).withTimeout(1.4));
        //overall time of auto is 10 seconds 
    }
}
