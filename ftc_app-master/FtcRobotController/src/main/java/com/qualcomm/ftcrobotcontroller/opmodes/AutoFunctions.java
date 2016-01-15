package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by TechEd on 10/9/2015.
 */

//THis class is a subclass
public class AutoFunctions
{
    public void encoderTurn (DcMotor driveR, DcMotor driveL, Integer pos1, Integer pos2, double power1, double power2, DcMotor end, Integer endp)
    {
        while(end.getCurrentPosition()>endp)
        {
            driveR.setTargetPosition(pos1);
            driveL.setTargetPosition(pos2);
            driveR.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
            driveL.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
            driveR.setPower(power1);
            driveL.setPower(power2);
        }
        driveL.setPower(0);
        driveR.setPower(0);


        driveL.setMode(DcMotorController.RunMode.RESET_ENCODERS);
        driveR.setMode(DcMotorController.RunMode.RESET_ENCODERS);
    }

    public void singleMotor (DcMotor motor, Integer pos, double power)
    {
        while(motor.getCurrentPosition()>pos)
        {
            motor.setTargetPosition(pos);
            motor.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
            motor.setPower(power);
        }
        motor.setPower(0);

        motor.setMode(DcMotorController.RunMode.RESET_ENCODERS);
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

    public void encoderTurnv2 (DcMotor driveR, DcMotor driveL, Integer pos1, Integer pos2, double power1, double power2)
    {
        driveR.setTargetPosition(pos1);
        driveL.setTargetPosition(pos2);
        driveR.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveL.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
        driveR.setPower(power1);
        driveL.setPower(power2);
    }
    public void oldEncoderDrive (DcMotor driveR, DcMotor driveL, Double powerR, Double powerL, DcMotor stop, Integer stopPosition)
    {

        while ( Math.abs(stop.getCurrentPosition() ) < stopPosition)
        {
            driveR.setPower(powerR);
            driveL.setPower(powerL);
        }
        driveR.setPower(0);
        driveL.setPower(0);
    }

}
