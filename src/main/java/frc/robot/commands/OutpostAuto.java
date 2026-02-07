package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.CANDriveSubsystem;
import frc.robot.subsystems.CANFuelSubsystem;

public class OutpostAuto extends SequentialCommandGroup
{
    public OutpostAuto(CANDriveSubsystem drivesystem, CANFuelSubsystem fuelsystem)
    {
        addCommands(new AutoDrive(drivesystem, 0.5, 0).withTimeout(1.5), new AutoDrive(drivesystem, 0, -0.75).withTimeout(0.5),
                new AutoDrive(drivesystem, -0.5, 0).withTimeout(7.1));
        // new AutoDrive(drivesystem, 0.5, 0).withTimeout(7.1));
        // new AutoDrive(drivesystem, 0, -0.5).withTimeout(3.1),
        // new AutoDrive(drivesystem, -0.5, 0).withTimeout(1));
        // addCommands(new AutoDrive(drivesystem, 0, -0.5).withTimeout(3.1));
        //new AutoDrive(drivesystem,0,-0.5).withTimeout(4.9);
        //overall time of auto is 21.7 seconds (9.5+3.1+7.1+3.1+1+3.1+4.9) (overtime, will probably speed up autodrive to compensate)
    }
}
//new AutoDrive(drivesystem, 1, 0).withTimeout(3.55);
//new AutoDrive(drivesystem, 0, -0.5).withTimeout(1.725);
