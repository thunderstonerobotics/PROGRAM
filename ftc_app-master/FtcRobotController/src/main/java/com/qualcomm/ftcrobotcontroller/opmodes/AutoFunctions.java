package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by TechEd on 10/9/2015.
 */
public class AutoFunctions
{
    public void encoderTurn (DcMotor drive1, DcMotor drive2, Integer pos1, Integer pos2, double power1, double power2)
    {
        drive1.setTargetPosition(pos1);
        drive2.setTargetPosition(pos2);
        drive1.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        drive2.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        drive1.setPower(power1);
        drive2.setPower(power2);

        drive2.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        drive1.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    }

    public void encoderStraight (DcMotor drive1, DcMotor drive2, Integer pos, double power)
    {
        drive1.setTargetPosition(pos);
        drive2.setTargetPosition(pos);
        drive1.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        drive2.setChannelMode(DcMotorController.RunMode.RUN_TO_POSITION);
        drive1.setPower(power);
        drive2.setPower(power);

        drive1.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
        drive2.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    }
}
