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
@TeleOp(name="Duck", group="Linear Opmode")

public static class Duck {

    

public static void DuckMotor() {
    DcMotor duckMotor = null;
    duckMotor = hardwareMap.dcMotor.Get("duckMotor");
// Nameing them
double BumperRight;
double DuckPower;
double BumperLeft;
BumperRight = gamepad2.right_bumper;
BumperLeft = gamepad2.left_bumper;
if (BumperLeft = 1){
    DuckPower = -1;
}
else if (BumperRight = 1){
    DuckPower = 1;
}
else {
    DuckPower = 0;
}
duckMotor.set.power(DuckPower);
}
}