package frc.team1523.robot.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.team1523.robot.Constants;
import frc.team1523.robot.RobotMap;
import frc.team1523.robot.commands.TankDrive;

public class DriveTrain extends Subsystem {

    private Talon left_front = new Talon(RobotMap.DRIVE_LEFT_FRONT);
    private Talon left_rear = new Talon(RobotMap.DRIVE_LEFT_REAR);
    private Talon right_front = new Talon(RobotMap.DRIVE_RIGHT_FRONT);
    private Talon right_rear = new Talon(RobotMap.DRIVE_RIGHT_REAR);

    private MecanumDrive drive;

    public void initDefaultCommand() {
        setDefaultCommand(new TankDrive());
        drive = new MecanumDrive(left_rear, left_front, right_rear, right_front);
    }

    public void drive(Joystick stick) {
        drive.driveCartesian(boringDeadband(stick.getX()), boringDeadband(-stick.getY()), boringDeadband(stick.getZ()), 0);
    }

    private double boringDeadband(double value) {
        if (Math.abs(value) < Constants.DEAD_ZONE) {
            return 0;
        } else {
            return value;
        }
    }

    /**
     * Clamp the speed so as to not exceed the maximum supported values of the motors
     *
     * @param speed the raw speed
     * @return the clamped speed
     */
    private double clamp(double speed) {
        return Math.max(Constants.DRIVE_MOTOR_MIN, Math.min(Constants.DRIVE_MOTOR_MAX, speed));
    }
}