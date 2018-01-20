
package frc.team1523.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team1523.robot.subsystems.ArmControl;
import frc.team1523.robot.subsystems.DriveTrain;

public class Robot extends IterativeRobot {
    public static OI oi;
    public static DriveTrain driveTrain;
    public static ArmControl armControl;

    @Override
    public void robotInit() {
        oi = new OI();
        driveTrain = new DriveTrain();
        armControl = new ArmControl();
    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
    }

    @Override
    public void robotPeriodic() {
        Scheduler.getInstance().run();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
}