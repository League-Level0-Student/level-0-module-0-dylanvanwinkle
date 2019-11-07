package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robotgrifferi {

	public static void main(String[] args) {
Robot RG = 	new Robot();
RG.hide();
RG.penDown();
RG.setPenWidth(10000);
RG.setSpeed(100);	
for (int i = 0; i < 10; i++) {
	RG.setRandomPenColor();
	RG.turn(0);
	RG.move (10);
}

RG.turn(60);
for (int i = 0; i < 23; i++) {
RG.setRandomPenColor();
RG.turn(10);		
RG.move(10);
	}
}
}