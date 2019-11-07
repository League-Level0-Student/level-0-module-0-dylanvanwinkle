package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotStar {

    public static void main(String[] args) {

        Robot a = new Robot();
        a.hide();
        a.move(10);
        a.penDown();
        a.setPenWidth(10000);
        a.setSpeed(100);
        a.setRandomPenColor();
        a.move(90);
        a.setRandomPenColor();
        a.turn(-120);
        a.setRandomPenColor();
        a.move(100);
        a.setRandomPenColor();
        a.turn(-125);
        a.setRandomPenColor();
        a.move(93);
        a.setRandomPenColor();
        a.turn(-120);

    }
}