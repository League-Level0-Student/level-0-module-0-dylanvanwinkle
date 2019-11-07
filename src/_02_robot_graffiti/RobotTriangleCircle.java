package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotTriangleCircle {

    public static void main(String[] args) {

        Robot a = new Robot("batman");
        // a.hide();
        a.move(10);
        a.penDown();
        a.setPenWidth(10000);
        a.setSpeed(100);
        a.setRandomPenColor();
        a.move(90);
        a.turn(-120);
        a.setRandomPenColor();
        a.move(100);
        a.turn(-125);
        a.setRandomPenColor();
        a.move(93);
        a.turn(-40);
        for (int i = 0; i < 60; i++) {
            a.setRandomPenColor();
            a.move(90);
            a.turn(120);
            a.setRandomPenColor();
            a.move(100);
            a.turn(125);
            a.setRandomPenColor();
            a.move(93);
            a.turn(-1);

        }
        a.penUp();
        a.move(1000);

    }
}