package frc.team1523.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import frc.team1523.robot.RobotMap;
import frc.team1523.robot.commands.ArmCommand;
import frc.team1523.robot.commands.TankDrive;

public class ArmControl extends Subsystem {

    private Talon rod_1 = new Talon(7);
    private Talon rod_2 = new Talon(3);
    private Talon arm = new Talon(5);

    public void initDefaultCommand() {
        setDefaultCommand(new ArmCommand());
    }

    public void moveArm(double speed) {
        arm.set(speed);
    }

    public void rotateArm(double speed) {
        rod_1.set(speed);
        rod_2.set(speed);
    }
}