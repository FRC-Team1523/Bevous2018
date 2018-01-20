package frc.team1523.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team1523.robot.Robot;


public class ArmCommand extends Command {
    public ArmCommand() {
        requires(Robot.armControl);
    }

    @Override
    protected void initialize() {

    }

    /**
     * Called repeatedly as command is running
     */
    @Override
    protected void execute() {
        double left = Robot.oi.gamepad.getY(Hand.kLeft);
        double right = Robot.oi.gamepad.getY(Hand.kRight);

        SmartDashboard.putNumber("Joystick Y Left", left);
        SmartDashboard.putNumber("Joystick Y Right", right);

        Robot.armControl.rotateArm(left);

        Robot.armControl.moveArm(right);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}