package frc.robot.subsystems.swervedrive;

import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LimelightSubsystem extends SubsystemBase{
    private static DoubleSubscriber tx;
    private static DoubleSubscriber ty;
    private static DoubleSubscriber tv;
    private static DoubleSubscriber ta;

    public LimelightSubsystem(){
        NetworkTable limeLightTable = NetworkTableInstance.getDefault().getTable("limelight");
        tx = limeLightTable.getDoubleTopic("tx").subscribe(0); // Horizontal offset from crosshair to target (-29.8 to 29.8 degrees).
        ty = limeLightTable.getDoubleTopic("ty").subscribe(0); // Vertical offset from crosshair to target (-24.85 to 24.85 degrees).
        tv = limeLightTable.getDoubleTopic("tv").subscribe(0); // Whether the limelight has any valid targets (0 or 1).
        ta = limeLightTable.getDoubleTopic("ta").subscribe(0); // Target area (0% of image to 100% of image).
    }
}
