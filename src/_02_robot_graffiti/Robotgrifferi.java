package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robotgrifferi {

	public static void main(String[] args) {
Robot RG = 	new Robot();
RG.hide();
RG.penDown();
RG.setPenWidth(10000);
RG.setSpeed(100);	
for (int i = 0; i < 100; i++) {
	RG.setRandomPenColor();
	RG.turn(0);
	RG.setRandomPenColor();
	RG.move (1);
}

RG.turn(60);
for (int i = 0; i < 237; i++) {
RG.setRandomPenColor();
RG.turn(1);		
RG.setRandomPenColor();
RG.move(1);
	}
}
}