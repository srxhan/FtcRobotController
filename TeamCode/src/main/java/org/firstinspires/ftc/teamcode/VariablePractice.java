package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class VariablePractice extends OpMode {
    @Override
    public void init() {
        int teamNumber = 27883;
        double motorSpeed = 0.75;
        boolean clawCLosed = true;
        String name = "Wilsobotics";
        int motorAngle = 90;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("motor speed", motorSpeed);
        telemetry.addData("claw closed", clawCLosed);
        telemetry.addData("Name", name);
        telemetry.addData("motor angle", motorAngle);

    }

    @Override
    public void loop() {

    }
}
