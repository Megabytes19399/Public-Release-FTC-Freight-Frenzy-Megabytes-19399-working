package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import java.lang.Math;
//Name the file
@TeleOp(name="Arm", group="Linear Opmode")

public static class Swivel {



public static void SwivelMotor() {
    DcMotor Swivel = null;
    Swivel = hardwareMap.dcMotor.Get("Swivel");
// Nameing them
 double joyScale = 0.5;
double ArmPower;
double Y1;
Y1 = gamepad2.left_stick_y * joyscale;
if (Y1 < 0){
    ArmPower = Y1;
}
if else (Y1 > 0){
    ArmPower = Y1;
}
else {
    ArmPower = 0;
}
Swivel.set.power(ArmPower);
}
}