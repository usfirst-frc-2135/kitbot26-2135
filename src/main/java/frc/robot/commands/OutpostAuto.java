package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.52),
                new AutoDrive(drivesystem, 0.6, 0).withTimeout(0.5), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.52),
                new AutoDrive(drivesystem, -0.6, 0).withTimeout(3.7), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.52),
                new AutoDrive(drivesystem, -0.6, 0).withTimeout(0.25), new AutoDrive(drivesystem, 0, -0.6).withTimeout(0.52),
                new AutoDrive(drivesystem, -0.6, 0).withTimeout(1.9), new AutoDrive(drivesystem, 0.6, 0).withTimeout(1.9));
    }
}

// new AutoDrive(drivesystem, -0.75, 0).withTimeout(2.16), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.53),
// new AutoDrive(drivesystem, -0.75, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, 0).withTimeout(1.85)
//new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.6), new AutoDrive(drivesystem, 0.6,0).withTimeout(1.2)
//looks like it is going straight pretty consistently now
