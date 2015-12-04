package com.qualcomm.ftcrobotcontroller.opmodes;

import android.widget.Button;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;


public class TeleopTank  {

    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private int caseVar;

    public TeleopTank (DcMotor left, DcMotor right)
    {
        leftMotor = left;
        rightMotor = right;

    }
    public void Tank(float leftY, float rightY) {

        leftMotor.setPower(leftY);
        rightMotor.setPower(rightY);
    }
    public void Tank(float leftY, float rightY, double divider) {

        leftMotor.setPower(leftY*divider);
        rightMotor.setPower(rightY*divider);
    }
    public void driveShift (float leftY, float rightY, double divider, boolean Button1, boolean Button2)
    {
        if (Button1)
        {caseVar = 1;}
        if (Button2)
        {caseVar = 2;}

        switch (caseVar)
        {
            case 1: Tank(leftY,rightY);
            case 2: Tank(leftY,rightY,divider);
        }
    }

}

