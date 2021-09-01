package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous (name = "TutorialAutonStudent")
public class TutorialAutonStudent extends LinearOpMode {

    // Declaration
    DcMotor frontLeft, frontRight, backLeft, backRight;
    double speed = 0.2;

    @Override
    public void runOpMode() throws InterruptedException {
        // Initialize
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");

        waitForStart();

        while (opModeIsActive()) {

            break;
        }
    }

    // Methods
    public void forward() {

    }

    public void backward() {

    }

    public void stopMotors() {

    }

    public void turnLeft() {

    }

    public void turnRight() {

    }

    public void strafeLeft() {

    }

    public void strafeRight() {

    }
}
