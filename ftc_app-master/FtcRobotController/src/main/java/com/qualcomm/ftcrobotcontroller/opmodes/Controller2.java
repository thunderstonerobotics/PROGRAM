package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.Servo;


public class Controller2
{
    public void assignMotor (DcMotor DC, double joy)
    {
        DC.setPower(joy);
    }
    public void assignServo (Servo S, boolean button, float position)
    {
        if (button)
            S.setPosition(position);
    }
}

