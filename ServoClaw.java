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
@TeleOp(name="Claw", group="Linear Opmode")

public static class Servo {

public static void ServoMotor() {

    Servo = hardwareMap.Get(Claw.class);

     Servo  Claw = null;
    // Defining them

 double ServoPower;

 double AButton;

 double BButton;

 BButton = gamepad2.button_B;

 AButton = gamepad2.button_A;

 if (BButton = 1 ){
    ServoPower = 1;
}

if else (AButton = 1){
    ServoPower = 1;
}

else {
    ServoPower = 0;
}

Claw.set.power(ServoPower);
}
}