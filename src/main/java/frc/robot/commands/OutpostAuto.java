package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.985),
                new AutoDrive(drivesystem, -0.6, 0).withTimeout(3.35), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.985));
        // new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.5), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.99));
        // new AutoDrive(drivesystem, -0.6, 0).withTimeout(3.67), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.495),
        // new AutoDrive(drivesystem, -0.6, 0).withTimeout(0.4), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.505),
        // new AutoDrive(drivesystem, -0.6, 0).withTimeout(2.35), new AutoDrive(drivesystem, 0, 0).withTimeout(4),
        // new AutoDrive(drivesystem, 0.6, 0).withTimeout(2.2), new AutoDrive(drivesystem, 0, 0.6).withTimeout(0.505),
        // new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.4), new AutoDrive(drivesystem, 0, 0.6).withTimeout(0.505),
        // new AutoDrive(drivesystem, 0.6, 0).withTimeout(3.67));
        //         new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.4), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.505),
        // new AutoDrive(drivesystem, -0.6, 0).withTimeout(1.9), new AutoDrive(drivesystem, 0.6, 0).withTimeout(1.9));
        // new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.495),
        //         new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.5), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.495),
        //         new AutoDrive(drivesystem, -0.6, 0).withTimeout(3.67), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.495),
        //         new AutoDrive(drivesystem, -0.6, 0).withTimeout(0.4), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.505),
        //         new AutoDrive(drivesystem, -0.6, 0).withTimeout(2.2), new AutoDrive(drivesystem, 0, 0).withTimeout(4),
        //         new AutoDrive(drivesystem, 0.6, 0).withTimeout(2.2), new AutoDrive(drivesystem, 0, 0.6).withTimeout(0.505),
        //         new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.4), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.505));
        // new AutoDrive(drivesystem, -0.6, 0).withTimeout(1.9), new AutoDrive(drivesystem, 0.6, 0).withTimeout(1.9));
    }
}

//looks like it is going straight pretty consistently now
