package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.5),
                new AutoDrive(drivesystem, -0.75, 0).withTimeout(2.15), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.42),
                new AutoDrive(drivesystem, -0.75, 0).withTimeout(1.35), new AutoDrive(drivesystem, 0, 0).withTimeout(1.5),
                new AutoDrive(drivesystem, 0.75, 0).withTimeout(0.25));
        // new ExampleAuto(drivesystem, fuelsystem)        //new AutoDrive(drivesystem,0,0.75).withTimeout(0.53)
        //new AutoDrive(drivesystem,0.75,0).withTimeout(1.1);
        //new AutoDrive(drivesystem,0,0.75).withTimeout(0.75);
        //new LaunchSequence(fuelsystem).withTimeout(5);
    }
}

// new AutoDrive(drivesystem, -0.75, 0).withTimeout(2.16), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.53),
// new AutoDrive(drivesystem, -0.75, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, 0).withTimeout(1.85)
