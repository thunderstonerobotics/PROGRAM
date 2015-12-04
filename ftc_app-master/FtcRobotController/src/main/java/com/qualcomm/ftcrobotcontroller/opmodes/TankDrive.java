package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import java.util.ResourceBundle;

/**
 * Created by TechEd on 9/30/2015.
 */
public class TankDrive  extends OpMode {

    TeleopTank TeleopTank;
    Controller2 Controller2;
    AdafruitRGBExample Color;

    DcMotor leftDrive;
    DcMotor rightDrive;

    @Override
    public void init()
    {
        leftDrive = hardwareMap.dcMotor.get("left_drive");
        rightDrive = hardwareMap.dcMotor.get("right_drive");
        rightDrive.setDirection(DcMotor.Direction.REVERSE);
        TeleopTank = new TeleopTank(hardwareMap.dcMotor.get("left_drive"),hardwareMap.dcMotor.get("right_drive"));
        Controller2 = new Controller2();
        Color = new AdafruitRGBExample();
    }


    @Override
    public void loop()
    {
        TeleopTank.Tank(gamepad1.left_stick_y, gamepad1.right_stick_y);
    }
}