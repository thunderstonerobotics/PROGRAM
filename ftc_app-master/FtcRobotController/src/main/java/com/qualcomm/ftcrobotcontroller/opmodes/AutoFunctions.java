package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by TechEd on 10/9/2015.
 */
public class AutoFunctions
{
    public void encoderTurn (DcMotor driveR, DcMotor driveL, Integer pos1, Integer pos2, double power1, double power2)
    {
        driveR.setTargetPosition(pos1);
        driveL.setTargetPosition(pos2);
        driveR.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveL.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveR.setPower(power1);
        driveL.setPower(power2);
    }

    public void encoderStraight (DcMotor driveR, DcMotor driveL, Integer pos, double power)
    {
        driveR.setTargetPosition(-pos);
        driveL.setTargetPosition(pos);
        driveR.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveL.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveR.setPower(-power);
        driveL.setPower(power);
    }
}
