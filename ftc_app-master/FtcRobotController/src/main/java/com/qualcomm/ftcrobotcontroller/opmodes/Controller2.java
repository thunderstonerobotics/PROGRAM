package com.qualcomm.ftcrobotcontroller.opmodes;  //HI DOKKEN!

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

    public void assignServo (Servo S, boolean button, double position)
    {
        if (button)
        {S.setPosition(position);}
    }

    public void assignContServo (Servo S, boolean buttonUp, boolean buttonDown, double position, double stop)
    {
        if (buttonUp)
        {
            S.setPosition(position);
        }
        else if (buttonDown)
        {
            S.setPosition(-position);
        }
        else
        {
            S.setPosition(stop);
        }
    }

    public void Toggle (DcMotor motor, float power, double divider, boolean Button1)
    {
        if (Button1)
        {
            motor.setPower(power/divider);
        }
        else
        {
            motor.setPower(power);
        }
    }

    public void slideIndividual (DcMotor slide, boolean buttonUp, boolean buttonDown, double power)
    {
        if (buttonUp)
        {
            slide.setPower(power);
        }
        else if (buttonDown)
        {
            slide.setPower(-power);
        }
        else
        {
            slide.setPower(0);
        }
    }
}

