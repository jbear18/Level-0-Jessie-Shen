import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
public static void main(String[] args) {
Robot robo= new Robot("mini");
Random randy=new Random();
robo.moveTo(50, 700);
robo.setWindowColor(null);
robo.setSpeed(10);
robo.setPenWidth(8);
for (int i = 0; i < 10; i++) {
int height=randy.nextInt(501-100)+100;	


robo.setRandomPenColor();
robo.penDown();

if(height<300){
	robo.move(height);
robo.turn(45);
robo.move(50);
robo.turn(90);
robo.move(50);
robo.turn(45);
robo.move(height);
robo.turn(-90);
robo.setPenColor(Color.GREEN);	
robo.move(40);	
robo.turn(-90);
}
else{
	
robo.move(height);
robo.turn(90);
robo.move(50);
robo.turn(90);
robo.move(height);
robo.setPenColor(Color.GREEN);
robo.turn(-90);
robo.move(40);	
robo.turn(270);
}


}	
	
}	
	
	
}

