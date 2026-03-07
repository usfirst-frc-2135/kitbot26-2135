package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, 0).withTimeout(0.15),
                new AutoDrive(drivesystem, 0, -0.6).withTimeout(1), new AutoDrive(drivesystem, -0.6, 0).withTimeout(3.94),
                new AutoDrive(drivesystem, 0, 0).withTimeout(0.15), new AutoDrive(drivesystem, 0, -0.6).withTimeout(1.01),
                new AutoDrive(drivesystem, -0.6, 0).withTimeout(2.3));
    }
}

//looks like it is going straight pretty consistently now
