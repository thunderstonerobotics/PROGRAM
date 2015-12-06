package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import android.widget.Switch;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

import java.util.ResourceBundle;

/**
 * Created by TechEd on 9/30/2015.
 */
public class BalanceBot  extends OpMode {

    TeleopTank TeleopTank;
    Controller2 Controller2;

    DcMotor leftDrive;
    DcMotor rightDrive;
    DcMotor balance;
    DcMotor slide;

    @Override
    public void init()
    {
        leftDrive = hardwareMap.dcMotor.get("left_drive");
        rightDrive = hardwareMap.dcMotor.get("right_drive");
        balance = hardwareMap.dcMotor.get("balance");
        slide = hardwareMap.dcMotor.get("slide");
        //rightDrive.setDirection(DcMotor.Direction.REVERSE);
        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        TeleopTank = new TeleopTank(hardwareMap.dcMotor.get("left_drive"),hardwareMap.dcMotor.get("right_drive"));
        Controller2 = new Controller2();
    }


    @Override
    public void loop()
    {
        TeleopTank.Tank(gamepad1.left_stick_y,gamepad1.right_stick_y);

        Controller2.assignMotor(balance, gamepad2.right_stick_y / 3);

        Controller2.assignMotor(slide, gamepad2.left_stick_y /3);


    }
}

