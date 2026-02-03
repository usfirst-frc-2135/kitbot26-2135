package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new ExampleAuto(drivesystem, fuelsystem), new AutoDrive(drivesystem, 0, -0.5).withTimeout(3.1),
                new AutoDrive(drivesystem, 0.5, 0).withTimeout(5), new AutoDrive(drivesystem, 0, -0.5).withTimeout(1),
                new AutoDrive(drivesystem, -0.5, 0).withTimeout(1));
        // addCommands(new AutoDrive(drivesystem, 0, -0.5).withTimeout(3.1));
        //new AutoDrive(drivesystem,0,-1).withTimeout(1.55);
        //overall time of auto is 21.7 seconds (overtime, will probably speed up autodrive to compensate)
    }
}
